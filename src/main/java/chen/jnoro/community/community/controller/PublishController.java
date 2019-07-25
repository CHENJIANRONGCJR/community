package chen.jnoro.community.community.controller;

import chen.jnoro.community.community.mapper.QuestionMapper;
import chen.jnoro.community.community.mapper.UserMapper;
import chen.jnoro.community.community.model.Question;
import chen.jnoro.community.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

/**
 * @Description: 发布功能的Controller
 * @Auther: jianrong.chen
 * @Date: 2019/7/3 14:27
 */
@Controller
public class PublishController {

    /**
     * 自动注入问题的Mapper
     */
    @Autowired
    private QuestionMapper questionMapper;

    /**
     * 自动注入用户的Mapper
     */
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/publish")
    public String publish() {
        return "publish";
    }

    @PostMapping("/publish")
    public String doPublish(
            @RequestParam(value = "title",required = false) String title,
            @RequestParam(value = "description",required = false) String description,
            @RequestParam(value = "tag",required = false) String tag,
            HttpServletRequest request,
            Model model
    ){
        model.addAttribute("title",title);
        model.addAttribute("description",description);
        model.addAttribute("tag",tag);
        // 前端的参数校验
        if(title == null || title == ""){
            model.addAttribute("error","标题不能为空");
            return "publish";
        }
        if(description == null || description == ""){
            model.addAttribute("error","问题描述不能为空");
            return "publish";
        }
        if(tag == null || tag == ""){
            model.addAttribute("error","便签不能为空");
            return "publish";
        }
        Cookie[] cookies = request.getCookies();
        User user = new User();
        if (null != cookies && cookies.length !=0) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")) {
                    String token = cookie.getValue();
                    user = userMapper.findByToken(token);
                    if (null != user) {
                        request.getSession().setAttribute("user", user);
                    }
                    break;
                }
            }
        }
        if(null == user){
            model.addAttribute("error","用户未登录");
            return "publish";
        }
        Question question = new Question();
        question.setTitle(title);
        question.setTag(tag);
        question.setDescription(description);
        question.setCreatorId(user.getId());
        question.setCreateTime(String.valueOf(LocalDateTime.now()));
        questionMapper.create(question);
        return "redirect:/";
    }
}
