package luckycoffee.jnoro.community.community.provider;

/**
 * @Description: Github用户信息
 * @Auther: jianrong.chen@luckincoffee.com
 * @Date: 2019/7/2 09:22
 */
public class GithubUser {
    private String name;
    private Long id;
    private String bio;

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return bio
     */
    public String getBio() {
        return this.bio;
    }

    /**
     * 设置
     *
     * @param bio
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "GithubUser{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", bio='" + bio + '\'' +
                '}';
    }
}
