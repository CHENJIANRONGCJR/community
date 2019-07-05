package luckycoffee.jnoro.community.community.mapper;

import luckycoffee.jnoro.community.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description:
 * @Auther: jianrong.chen@luckincoffee.com
 * @Date: 2019/7/3 15:52
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into t_community_question(title,description,create_time,creatorId,tag)values(#{title},#{description},#{createTime},#{creatorId},#{tag})")
    void create(Question question);

    @Select("select title,description,create_time as createTime ,creatorId,tag,view_count as viewCount,like_count as likeCount,comment_count as commentCount from t_community_question")
    List<Question> list();
}
