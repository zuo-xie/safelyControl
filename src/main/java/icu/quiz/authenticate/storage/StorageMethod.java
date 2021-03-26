package icu.quiz.authenticate.storage;

/**
 * 存储方式顶层接口
 * value为存储的格式
 * @param <T> value类型
 */
public interface StorageMethod {

    String getValue();

    void setValue(String s);
}
