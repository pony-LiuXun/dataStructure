package linearlist.singlelinkedlist;

import linearlist.LinearList;

/**
 * <p>线性表☞单链表(java-实现),此实现只是粗糙的实现，可自行完善</p>
 * @author pony-liuxun
 * @date 2019/02/28
 */
public class SingleLinkedList implements LinearList {
    /**
     * 单链表的头指针
     */
    private Node head;

    public SingleLinkedList(){
        head = new Node();
    }

    public SingleLinkedList(int n,boolean order){
        this();
        if (order){
            createStern(n);
        }else{
            createHead(n);
        }

    }

    /**
     * 尾插法建立单链表
     * @param n
     */
    private void createStern(int n){}

    /**
     * 头插法建立单链表
     * @param n
     */
    private void createHead(int n){}

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

    @Override
    public Object get(int index) throws Exception {
        return null;
    }

    @Override
    public void insert(int index, Object b) throws Exception {

    }

    @Override
    public void remove(int index) throws Exception {

    }

    @Override
    public void display() {

    }

    @Override
    public int indexOf(Object b) {
        return 0;
    }
}
