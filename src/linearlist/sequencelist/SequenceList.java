package linearlist.sequencelist;

import linearlist.LinearList;

/**
 * <p>线性表☞顺序表(java-实现),此实现只是粗糙的实现，可自行完善</p>
 *
 * @author pony-liuxun
 * @date 2019/02/26
 */
public class SequenceList implements LinearList {
    /**
     * 线性表的存储空间
     */
    private Object[] listElem;

    /**
     * 线性表的当前长度
     */
    private int curLen;

    private static int MAXSIZE = 10;

    /**
     * <p>顺序表类的构造函数,构造一个存储空间容量为maxSize的线性表</p>
     *
     * @param maxSize 初始化线性表长度
     */
    public SequenceList(int maxSize) {
        curLen = 0;
        //初始化一个空线性表
        listElem = new Object[maxSize];
    }

    /**
     * <p>清空线性表</p>
     */
    @Override
    public void clear() {
        curLen = 0;
    }

    /**
     * <p>判断线性表是否为空</p>
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return curLen == 0;
    }

    /**
     * <p>获取线性表中的元素个数</p>
     *
     * @return
     */
    @Override
    public int length() {
        return curLen;
    }

    /**
     * <p>根据数组下标获取元素</p>
     *
     * @param index 线性变元素下标
     * @return
     * @throws Exception
     */
    @Override
    public Object get(int index) throws Exception {
        //判断获取位置是否合法  判断准则: 0<index<curlen -1;
        if (index < 0 || index > curLen - 1) {
            throw new Exception("获取元素不存在");
        }
        return listElem[index];
    }

    /**
     * <p>指定位置插入元素</p>
     *
     * @param index 插入位置
     * @param b     插入的元素
     * @throws Exception
     */
    @Override
    public void insert(int index, Object b) throws Exception {
        //判断线性表是否已满
        if (curLen == listElem.length) {
            throw new Exception("线性表空间已满");
        }
        if (index < 0 || index > curLen) {
            throw new Exception("插入位置不合法");
        }
        //插入位置以后的所有元素，必须往后移动一位
        for (int i = curLen; i>index; i--) {
            listElem[i] = listElem[i -1];
        }
        listElem[index] = b;
        curLen++;
    }

    @Override
    public void remove(int index) throws Exception {
        if (index < 0 || index > curLen - 1) {
            throw new Exception("删除位置不合法");
        }
        //删除位置右边的元素必须向左移动一位
        for (int i = index; i <curLen-1; i++) {
            listElem[i] = listElem[i + 1];
        }
        curLen--;
    }


    @Override
    public void display() {

    }

    @Override
    public int indexOf(Object b) {
        //定义一个其实搜索的索引
        int index = 0;
        while (index < curLen && !(listElem[index].equals(b))) {
            index++;
        }
        if (index < curLen) {
            return index;
        } else {
            return -1;
        }
    }
}
