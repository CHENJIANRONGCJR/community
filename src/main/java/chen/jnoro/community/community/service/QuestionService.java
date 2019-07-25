package chen.jnoro.community.community.service;

import chen.jnoro.community.community.mapper.QuestionMapper;
import chen.jnoro.community.community.mapper.UserMapper;
import chen.jnoro.community.community.model.Question;
import chen.jnoro.community.community.model.User;
import chen.jnoro.community.community.pojo.dto.PageDTO;
import chen.jnoro.community.community.pojo.dto.QuestionDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Auther: jianrong.chen
 * @Date: 2019/7/4 17:29
 */
@Service
public class QuestionService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private QuestionMapper questionMapper;

    /**
     * 获取话题列表信息
     *
     * @param page
     * @param size
     * @return
     */
    public List<QuestionDTO> list(Integer page, Integer size) {

        //size *(page -1)
        Integer offset = size * (page - 1);
        List<Question> questions = questionMapper.list(offset, size);
        List<QuestionDTO> questionDTOList = new ArrayList<>();

        PageDTO pageDTO = new PageDTO();
        for (Question question : questions) {
            User user = userMapper.findById(question.getCreatorId());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        pageDTO.setQuestionDTOS(questionDTOList);
        Integer totalCount = questionMapper.count();
        pageDTO.setPagination(totalCount,page,size);
        return questionDTOList;
    }
}
