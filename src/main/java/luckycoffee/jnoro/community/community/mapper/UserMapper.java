package luckycoffee.jnoro.community.community.mapper;

import luckycoffee.jnoro.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description:
 * @Auther: jianrong.chen@luckincoffee.com
 * @Date: 2019/7/3 10:39
 */
@Mapper
public interface UserMapper {
    @Insert("insert into t_community_user(name,account_id,token,create_time,last_modify_time) values(#{name},#{accountId},#{token},#{createTime},#{lastModifyTime})")
 void insert(User user);
}
