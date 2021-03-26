package icu.quiz;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import java.util.List;

/**
 * 该类生成工厂
 */
public class SafelyControlManageFactory {

    private SafelyControlManage safelyControlManage;

    private List<HandlerInterceptorAdapter> interceptorList;

    public SafelyControlManage getSafelyControlManage() {
        if (this.safelyControlManage == null) {
            //TODO:不存在，配置默认值
            return null;
        }
        return this.safelyControlManage;
    }


}
