package luckycoffee.jnoro.community.community.controller;

import luckycoffee.jnoro.community.community.mapper.UserMapper;
import luckycoffee.jnoro.community.community.model.User;
import luckycoffee.jnoro.community.community.pojo.dto.AccessTokenDTO;
import luckycoffee.jnoro.community.community.provider.GithubProvider;
import luckycoffee.jnoro.community.community.pojo.dto.GithubUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @Description:
 * @Auther: jianrong.chen@luckincoffee.com
 * @Date: 2019/7/2 08:31
 */
@Controller
public class AuthorizeController {
    
    @Autowired
    private GithubProvider githubProvider;

    /**
     * 去配置文件里面读取配置的信息
     */
    @Value("${githud.client.id}")
    private String clientId;

    @Value("${githud.client.secret}")
    private String clientSecret;

    @Value("${githud.redirect.uri}")
    private String redirectUri;

    @Autowired
    private UserMapper userMapper;
    
    @GetMapping("/callback")
    public String callback(@RequestParam(name="code") String code,@RequestParam(name="state") String state,
    HttpServletRequest request,HttpServletResponse response){
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setClient_id(clientId);
        accessTokenDTO.setClient_secret(clientSecret);
        accessTokenDTO.setRedirect_uri(redirectUri);
        accessTokenDTO.setState(state);
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser githubUser = githubProvider.getUser(accessToken);
        if(null != githubUser && githubUser.getId() != null){
            User user = new User();
            String token = UUID.randomUUID().toString();
            user.setToken(token);
            user.setName(githubUser.getName());
            user.setAccountId(String.valueOf(githubUser.getId()));
            user.setCreateTime(String.valueOf(LocalDateTime.now()));
            user.setLastModifyTime(String.valueOf(LocalDateTime.now()));
            user.setBio("git用户信息");
            user.setAvatarUrl(githubUser.getAvatarUrl());
            userMapper.insert(user);
            response.addCookie(new Cookie("token",token));
            return "redirect:/";
            // 登录成功，写cookie和session
        }else{
            //登录失败，重新登录
            return "redirect:/";
        }
    }
}
