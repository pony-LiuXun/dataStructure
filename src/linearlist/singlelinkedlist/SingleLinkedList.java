package linearlist.singlelinkedlist;

import linearlist.LinearList;

/**
 * <p>线性表☞单链表(java-实现),此实现只是粗糙的实现，可自行完善</p>
 *
 * @author pony-liuxun
 * @date 2019/02/28
 */
public class SingleLinkedList implements LinearList {
    /**
     * 单链表的头指针
     */
    private Node head;

    public SingleLinkedList() {
        head = new Node();
    }

    public SingleLinkedList(int n, boolean order) {
        this();
        if (order) {
            createStern(n);
        } else {
            createHead(n);
        }

    }

    /**
     * 尾插法建立单链表
     *
     * @param n
     */
    private void createStern(int n) {
    }

    /**
     * 头插法建立单链表
     *
     * @param n
     */
    private void createHead(int n) {
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }

    /**
     * <p>算法核心:
     * 一、初始化一个结点对象
     * 二、定义一个遍历链表,初始位置下标
     * 三、依次往链表后方遍历，当
     * </p>
     *
     * @param index 线性变元素下标
     * @return
     * @throws Exception
     */
    @Override
    public Object get(int index) throws Exception {
        Node node = head.getNext();

        int startIndex = 0;

        while (startIndex < index && null != node) {
            node = node.getNext();
            startIndex++;
        }
        if (startIndex > index && null == node) {
            throw new Exception("元素不存在");
        }
        return node.getData();
    }

    @Override
    public void insert(int index, Object b) throws Exception {
        Node node = head;
        int startIndex = -1;
        while (null != node && startIndex < index - 1) {
            node = node.getNext();
            ++startIndex;
        }
        if (startIndex>index-1 || null == node ){
            throw new Exception("插入位置不合法");
        }
        Node newNode = new Node(b);
        newNode.setNext(node.getNext());
        node.setNext(newNode);

    }

    @Override
    public void remove(int index) throws Exception {
        Node node = head;
        int startIndex = -1;
        while (null != node.getNext() && startIndex<index-1){
            node = node.getNext();
            ++startIndex;
        }
        if(startIndex>index-1 || null == node.getNext()){
            throw new Exception("删除位置不合法");
        }else{
            node.setNext(node.getNext().getNext());
        }
    }

    @Override
    public void display() {

    }

    @Override
    public int indexOf(Object b) {
        //声明一个空节点,并且指向下一个结点
        Node node = head.getNext();
        //声明初始遍历位置
        int startIndex = 0;
        while (null != node && b.equals(node.getData())) {
            node = node.getNext();
            ++startIndex;
        }
        if (null != node) {
            return startIndex;
        } else {
            return -1;
        }
    }
}
