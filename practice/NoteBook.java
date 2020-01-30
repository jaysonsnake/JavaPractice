package practice;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * 实现记事本功能
 * */
public class NoteBook {

    public ArrayList<String> notes = new ArrayList<>();

    /**
     * 添加一条记录
     * */
    public void add(String s) {
        notes.add(s);
    }


    /**
     * @return 记录条数
     */
    public int getSize() {
        return notes.size();
    }


    /**
     * 根据index，获取某一条记录
     * @param index 某条记录的下标
     */
    public String getNote(int index) {
        return notes.get(index);
    }

    /**
     * 根据index，删除某一条记录
     * @param index 某条记录的下标
     */
    public void removeNote(int index) {
        notes.remove(index);
    }

    /**
     * 将记录打包成一个数组，方便其他组件调用
     * @return 存放记录の数组
     */
    public String[] list() {
        String[] a = new String[notes.size()];
        notes.toArray(a);
        return a;
    }





    public static void main(String[] args) {
        NoteBook nb = new NoteBook();

        nb.add("first");
        nb.add("second");
        System.out.println("note book size = " + nb.getSize());
        System.out.println("note book = " + nb.notes);

    }
}
