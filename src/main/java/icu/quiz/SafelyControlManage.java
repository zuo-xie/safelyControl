package icu.quiz;

import icu.quiz.authenticate.storage.StorageMethod;
import lombok.Data;
import org.springframework.cache.Cache;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 该类为框架管理器
 *
 * @author zuo
 */
@Data
public class SafelyControlManage {

    //使用的缓存方法
    private Cache quizCache;

    //存储方式
    private StorageMethod storageMethod;

    //所有的权限接口管理 （key为权限，value为接口路径）
    private Map<String, String> autoMap = new ConcurrentHashMap<>(256);

    private Map<String, String> roleMap = new ConcurrentHashMap<>(256);

    private volatile static SafelyControlManage safelyControlManage;

    private SafelyControlManage() {
    }

    public static SafelyControlManage getSafelyControlManage() {
        if (safelyControlManage == null) {
            synchronized (SafelyControlManage.class) {
                if (safelyControlManage == null) {
                    safelyControlManage = new SafelyControlManage();
                }
            }
        }
        return safelyControlManage;
    }

    public SafelyControlManage addAutoMap(String key, String value) {
        autoMap.put(key, value);
        return this;
    }

    public Boolean containsKey(String key) {
        return safelyControlManage.containsKey(key);
    }

    public Boolean containsKey(Collection<String> keys) {
        return keys.stream().anyMatch(this::containsKey);
    }
}
