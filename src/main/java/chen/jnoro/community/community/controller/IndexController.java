package chen.jnoro.community.community.controller;

import chen.jnoro.community.community.mapper.UserMapper;
import chen.jnoro.community.community.model.User;
import chen.jnoro.community.community.pojo.dto.QuestionDTO;
import chen.jnoro.community.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * @Description: 测试的Controller
 * @Auther: jianrong.chen
 * @Date: 2019/6/29 16:12
 */
@Controller
public class IndexController {

    /**
     * 注入用户的mapper
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * 注入话题的service
     */
    @Autowired
    private QuestionService questionService;

    /**
     * 加载登录后的展示页面
     * @param request 请求信息
     * @return 登录后的页面信息
     */
    @GetMapping("/")
    public String index(HttpServletRequest request,
    Model model,
    @RequestParam(name = "page",defaultValue = "1") Integer page,
    @RequestParam(name = "size",defaultValue = "5") Integer sizz

    ){
        Cookie[] cookies = request.getCookies();
        if(null != cookies && cookies.length !=0) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")) {
                    String token = cookie.getValue();
                    User user = userMapper.findByToken(token);
                    if (null != user) {
                        request.getSession().setAttribute("user", user);
                    }
                    break;
                }
            }
        }

        List<QuestionDTO> questionList = questionService.list(page,sizz);
        for(QuestionDTO questionDTO:questionList){
            questionDTO.setDescription("reset");
        }
        model.addAttribute("questions",questionList);
        return "index";
    }
}
