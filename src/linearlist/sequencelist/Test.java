package linearlist.sequencelist;

import linearlist.LinearList;

public class Test {
    public static void main(String[] args) throws Exception {
        LinearList list = new SequenceList(10);
        list.insert(0,"A1");
        list.insert(1,"c");
        list.insert(2,"A3");
        list.insert(3,"B");
        list.insert(4,"B");
        list.remove(2);
        list.remove(2);
        list.remove(2);
        int order =  list.indexOf("B");
        System.out.println("线性表中第一次出现的位置:"+order);

    }
}
