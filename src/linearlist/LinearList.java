package linearlist;

/**
 * <p>线性表的抽象数据类型(基本API操作)</p>
 *
 * @author pony-liuxun
 * @date 2019/02/26
 */
public interface LinearList {
    /**
     * <p>清空线性表</p>
     */
    void clear();

    /**
     * <p>判断线性表是否为空</p>
     *
     * @return <p>空返回true,否则返回false</p>
     */
    boolean isEmpty();

    /**
     * <p>获取线性表的元素个数</p>
     *
     * @return <p>返回线性表的元素个数</p>
     */
    int length();

    /**
     * <p>获取线性表的中某个元素</p>
     *
     * @param index 线性变元素下标
     * @return <p>返回对应的下标元素</p>
     */
    Object get(int index) throws Exception;

    /**
     * <p>在线性表中的某个位置插入元素</p>
     *
     * @param index 插入位置
     * @param b     插入的元素
     */
    void insert(int index, Object b) throws Exception;

    /**
     * <p>删除指定位置的元素</p>
     *
     * @param index 元素下标
     */
    void remove(int index) throws Exception;

    /**
     * <p>输出表中的内容</p>
     */
    void display();

    /**
     * <p>判断该元素是否存在于表中，若存在返回元素下标,不存在返回-1</p>
     *
     * @param b 验证元素
     * @return
     */
    int indexOf(Object b);


}
