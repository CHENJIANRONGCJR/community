package luckycoffee.jnoro.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: 测试的Controller
 * @Auther: jianrong.chen@luckincoffee.com
 * @Date: 2019/6/29 16:12
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name ="name") String name,Model model){
        model.addAttribute("name",name);
        return "hello";

    }
}
