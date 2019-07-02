package luckycoffee.jnoro.community.community.controller;

import luckycoffee.jnoro.community.community.pojo.dto.AccessTokenDTO;
import luckycoffee.jnoro.community.community.provider.GithubProvider;
import luckycoffee.jnoro.community.community.provider.GithubUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    
    @GetMapping("/callback")
    public String callback(@RequestParam(name="code") String code,@RequestParam(name="state") String state){
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setClient_id(clientId);
        accessTokenDTO.setClient_secret(clientSecret);
        accessTokenDTO.setRedirect_uri(redirectUri);
        accessTokenDTO.setState(state);
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser user = githubProvider.getUser(accessToken);
        System.out.println(user.getName());
        githubProvider.getAccessToken(accessTokenDTO);
        return "index";
    }
}
