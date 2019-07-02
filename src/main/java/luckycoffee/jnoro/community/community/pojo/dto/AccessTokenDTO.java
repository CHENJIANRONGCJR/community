package luckycoffee.jnoro.community.community.pojo.dto;

/**
 * @Description:
 * @Auther: jianrong.chen@luckincoffee.com
 * @Date: 2019/7/2 08:41
 */
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

    /**
     * 获取
     *
     * @return client_id
     */
    public String getClient_id() {
        return this.client_id;
    }

    /**
     * 设置
     *
     * @param client_id
     */
    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    /**
     * 获取
     *
     * @return client_secret
     */
    public String getClient_secret() {
        return this.client_secret;
    }

    /**
     * 设置
     *
     * @param client_secret
     */
    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    /**
     * 获取
     *
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * 设置
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取
     *
     * @return redirect_uri
     */
    public String getRedirect_uri() {
        return this.redirect_uri;
    }

    /**
     * 设置
     *
     * @param redirect_uri
     */
    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }

    /**
     * 获取
     *
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * 设置
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }
}
