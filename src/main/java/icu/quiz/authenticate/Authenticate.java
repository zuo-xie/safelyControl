package icu.quiz.authenticate;

import org.springframework.http.HttpRequest;
import org.springframework.web.HttpRequestHandler;

import javax.security.auth.Subject;

/**
 * 认证部分
 */
public interface Authenticate {

    /**
     * 认证是否拥有权限
     * @param userName 账号
     * @param password 密码
     * @return 是否拥有权限
     */
    UserInfo authenticate(String userName,String password);

}
