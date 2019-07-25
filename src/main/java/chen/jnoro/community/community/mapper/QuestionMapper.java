package chen.jnoro.community.community.mapper;

import chen.jnoro.community.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description: 话题的mapper
 * @Auther: jianrong.chen
 * @Date: 2019/7/3 15:52
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into t_community_question(title,description,create_time,creator_id,tag)values(#{title},#{description},#{createTime},#{creatorId},#{tag})")
    void create(Question question);

    /**
     * 获取话题的信息 Question
     * @return 话题的信息列表
     * @param offset
     * @param size
     */
    @Select("select * from t_community_question limit #{offset},#{size}")
    List<Question> list(Integer offset, Integer size);

    @Select("select count(1) from t_community_question")
    Integer count();
}
