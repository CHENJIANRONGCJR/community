package luckycoffee.jnoro.community.community.pojo.dto;

import lombok.Data;

/**
 * @Description: Github用户实体信息
 * @Auther: jianrong.chen@luckincoffee.com
 * @Date: 2019/7/4 13:16
 */
@Data
public class GithubUser {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 描述
     */
    private String bio;

    /**
     * 图像的url
     */
    private String avatarUrl;

    @Override
    public String toString() {
        return "GithubUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bio='" + bio + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                '}';
    }

    /**
     * 获取 主键id
     *
     * @return id 主键id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 主键id
     *
     * @param id 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 用户姓名
     *
     * @return name 用户姓名
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置 用户姓名
     *
     * @param name 用户姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 描述
     *
     * @return bio 描述
     */
    public String getBio() {
        return this.bio;
    }

    /**
     * 设置 描述
     *
     * @param bio 描述
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * 获取 图像的url
     *
     * @return avatarUrl 图像的url
     */
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    /**
     * 设置 图像的url
     *
     * @param avatarUrl 图像的url
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
