package luckycoffee.jnoro.community.community.model;

/**
 * @Description: 话题实体对象
 * @Auther: jianrong.chen@luckincoffee.com
 * @Date: 2019/7/3 15:58
 */
public class Question {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 主题
     */
    private String title;

    /**
     * 描述
     */
    private String description;

    /**
     * 便签
     */
    private String tag;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 创建人id
     */
    private Integer creatorId;

    /**
     * 评论数
     */
    private Integer commentCount;

    /**
     * 浏览量
     */
    private Integer viewCount;

    /**
     * 点赞数
     */
    private Integer likeCount;

    /**
     * 序列化方法
     * @return  Question信息
     */
    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", tag='" + tag + '\'' +
                ", createTime='" + createTime + '\'' +
                ", creatorId=" + creatorId +
                ", commentCount=" + commentCount +
                ", viewCount=" + viewCount +
                ", likeCount=" + likeCount +
                '}';
    }

    /**
     * 获取 主键
     *
     * @return id 主键
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * 设置 主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 主题
     *
     * @return title 主题
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * 设置 主题
     *
     * @param title 主题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取 描述
     *
     * @return description 描述
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * 设置 描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取 便签
     *
     * @return tag 便签
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * 设置 便签
     *
     * @param tag 便签
     */
    public void setTag(String tag) {
        this.tag = tag;
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
     * 获取 创建人id
     *
     * @return creatorId 创建人id
     */
    public Integer getCreatorId() {
        return this.creatorId;
    }

    /**
     * 设置 创建人id
     *
     * @param creatorId 创建人id
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 获取 评论数
     *
     * @return commentCount 评论数
     */
    public Integer getCommentCount() {
        return this.commentCount;
    }

    /**
     * 设置 评论数
     *
     * @param commentCount 评论数
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 获取 浏览量
     *
     * @return viewCount 浏览量
     */
    public Integer getViewCount() {
        return this.viewCount;
    }

    /**
     * 设置 浏览量
     *
     * @param viewCount 浏览量
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * 获取 点赞数
     *
     * @return likeCount 点赞数
     */
    public Integer getLikeCount() {
        return this.likeCount;
    }

    /**
     * 设置 点赞数
     *
     * @param likeCount 点赞数
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }
}
