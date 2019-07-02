package luckycoffee.jnoro.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @Description: 测试的Controller
 * @Auther: jianrong.chen@luckincoffee.com
 * @Date: 2019/6/29 16:12
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String hello(){
        return "index";

    }
}
