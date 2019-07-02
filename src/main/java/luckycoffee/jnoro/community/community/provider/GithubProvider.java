package luckycoffee.jnoro.community.community.provider;

import com.alibaba.fastjson.JSON;
import luckycoffee.jnoro.community.community.pojo.dto.AccessTokenDTO;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @Description:  Github 第三方服务
 * @Auther: jianrong.chen@luckincoffee.com
 * @Date: 2019/7/2 08:39
 */
@Component
public class GithubProvider {
    public String getAccessToken(AccessTokenDTO accessTokenDTO){
        MediaType  mediaType= MediaType.get("application/json; charset=utf-8");

        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
        Request request = new Request.Builder()
                    .url("https://github.com/login/oauth/access_token")
                    .post(body)
                    .build();
            try (Response response = client.newCall(request).execute()) {
                String string = response.body().string();
                String tokenStr = string.split("&")[0].split("=")[1];
                return tokenStr;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
    }
    public GithubUser getUser(String accessToken){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.github.com/user?access_token="+accessToken)
                .build();

        try (Response response = client.newCall(request).execute()) {
           String string = response.body().string();
           GithubUser githubUser = JSON.parseObject(string, GithubUser.class);
           return githubUser;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
