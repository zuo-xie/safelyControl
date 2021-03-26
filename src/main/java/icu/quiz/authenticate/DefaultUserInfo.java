package icu.quiz.authenticate;

import lombok.Data;

import java.util.List;

public class DefaultUserInfo implements UserInfo {

    @Override
    public List<String> getAuthList() {
        return null;
    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }
}
