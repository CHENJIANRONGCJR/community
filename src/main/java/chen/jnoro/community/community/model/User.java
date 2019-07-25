package chen.jnoro.community.community.model;

/**
 * @Description: 登录的用户信息
 * @Auther: jianrong.chen
 * @Date: 2019/7/3 10:41
 */
public class User {
    /**
     * 主键 id
     */
    private Integer id;

    /**
     * 名字
     */
    private String name;

    /**
     * 数量
     */
    private String accountId;

    /**
     * 登录的token信息
     */
    private String token;

    /**
     * 用户描述
     */
    private String bio;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String LastModifyTime;

    /**
     * 图像的url
     */
    private String avatarUrl;

    /**
     * 获取 主键 id
     *
     * @return id 主键 id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置 主键 id
     *
     * @param id 主键 id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 名字
     *
     * @return name 名字
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置 名字
     *
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 数量
     *
     * @return accountId 数量
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * 设置 数量
     *
     * @param accountId 数量
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取 登录的token信息
     *
     * @return token 登录的token信息
     */
    public String getToken() {
        return this.token;
    }

    /**
     * 设置 登录的token信息
     *
     * @param token 登录的token信息
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取 创建时间
     *
     * @return createTime 创建时间
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置 创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 修改时间
     *
     * @return LastModifyTime 修改时间
     */
    public String getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * 设置 修改时间
     *
     * @param LastModifyTime 修改时间
     */
    public void setLastModifyTime(String LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountId='" + accountId + '\'' +
                ", token='" + token + '\'' +
                ", createTime='" + createTime + '\'' +
                ", LastModifyTime='" + LastModifyTime + '\'' +
                '}';
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

    /**
     * 获取 用户描述
     *
     * @return bio 用户描述
     */
    public String getBio() {
        return this.bio;
    }

    /**
     * 设置 用户描述
     *
     * @param bio 用户描述
     */
    public void setBio(String bio) {
        this.bio = bio;
    }
}
