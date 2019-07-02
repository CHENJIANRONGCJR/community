package luckycoffee.jnoro.community.community.controller;

import luckycoffee.jnoro.community.community.pojo.dto.AccessTokenDTO;
import luckycoffee.jnoro.community.community.provider.GithubProvider;
import luckycoffee.jnoro.community.community.provider.GithubUser;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @GetMapping("/callback")
    public String callback(@RequestParam(name="code") String code,@RequestParam(name="state") String state){
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setClient_id("53f55e793eaa2935477a");
        accessTokenDTO.setClient_secret("4d130d554f4bcaa47079ff27493924f20f251126");
        accessTokenDTO.setRedirect_uri("http://localhost:8080/callback");
        accessTokenDTO.setState(state);
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser user = githubProvider.getUser(accessToken);
        System.out.println(user.getName());
        githubProvider.getAccessToken(accessTokenDTO);
        return "index";
    }
}
