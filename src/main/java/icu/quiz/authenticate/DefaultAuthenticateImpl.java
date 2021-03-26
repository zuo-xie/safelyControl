package icu.quiz.authenticate;


import icu.quiz.SafelyControlManage;
import org.springframework.cache.Cache;

public class DefaultAuthenticateImpl implements Authenticate {

    /**
     * 类实现描述
     *
     * @param userName 账号
     * @param password 密码
     * @return 用户存储信息
     */
    @Override
    public UserInfo authenticate(String userName,String password) {
        SafelyControlManage safelyControlManage = SafelyControlManage.getSafelyControlManage();
        Cache quizCache = safelyControlManage.getQuizCache();
        //TODO:获取该用户的角色


        return null;
    }
}
