package luckycoffee.jnoro.community.community.mapper;

import luckycoffee.jnoro.community.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Auther: jianrong.chen@luckincoffee.com
 * @Date: 2019/7/3 15:52
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into t_community_question(title,description,create_time,creatorId,tag)values(#{title},#{description},#{createTime},#{creatorId},#{tag})")
    public void create(Question question);
}
