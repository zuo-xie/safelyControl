package icu.quiz.authenticate;

import java.util.List;

public interface UserInfo {

    /**
     * 获取用户的所有权限
     * @return 用户的所有权限
     */
    List<String> getAuthList();

    /**
     * 获取用户账号
     * @return 用户账号
     */
    String getUserName();

    /**
     * 获取用户密码
     * @return 用户密码
     */
    String getPassword();
}
