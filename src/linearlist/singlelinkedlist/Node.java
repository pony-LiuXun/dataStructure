package linearlist.singlelinkedlist;

/**
 * <p>单链表结点类
 *
 * </p>
 *
 * @author pony-liuxun
 * @date 2019/02/28
 */
public class Node {
    /**
     * 数据域(用于存放结点数据元素的值)
     */
    private Object data;
    /**
     * 数据域指针(用于存放结点后驱元素的内存地址)
     */
    private Node next;

    /**
     * 初始化一个空的结点(指针域为空)
     *
     * @param data 数据元素值
     */
    public Node(Object data) {
        this(data, null);
    }

    /**
     * 初始化一个完整的结点
     *
     * @param data 数据元素值
     * @param next 后继元素地址
     */
    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    /**
     * 初始化空结点
     */
    public Node() {
        this(null, null);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
