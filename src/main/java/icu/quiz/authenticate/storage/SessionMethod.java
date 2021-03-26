package icu.quiz.authenticate.storage;

import org.springframework.util.StringUtils;

/**
 * 默认存储使用session存储
 */
public class SessionMethod  implements StorageMethod{

    private String sessionId = "-1";

    @Override
    public String getValue() {
        return sessionId;
    }

    @Override
    public void setValue(String s) {
        this.sessionId = s;
    }
}
