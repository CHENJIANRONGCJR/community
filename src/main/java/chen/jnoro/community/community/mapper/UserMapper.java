package chen.jnoro.community.community.mapper;

import chen.jnoro.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Description: 用户登录信息的
 * @Auther: jianrong.chen
 * @Date: 2019/7/3 10:39
 */
@Mapper
public interface UserMapper {
    @Insert("insert into t_community_user(name,account_id,token,create_time,last_modify_time,avatar_url) values(#{name},#{accountId},#{token},#{createTime},#{lastModifyTime},#{avatarUrl})")
 void insert(User user);

    @Select("select * from t_community_user where token = #{token}")
    User findByToken(@Param("token") String token);

    @Select("select * from t_community_user where id = #{Id}")
    User findById(@Param("Id") Integer Id);
}
