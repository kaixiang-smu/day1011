package com.qf.col;

import java.util.ArrayList;

public class Demo5_Arraylist {
    public static void main(String[] args) {
        // 1) 创建空集合，底层是空数组，容量是0
        ArrayList<Integer> list = new ArrayList<>();
        // 2) 当向集合存储数据，即向数组存储数据时发现容量不够
        // 此时会扩容为10
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        // 存放第11个时会扩容，扩容为原来的1.5倍
        //  elementData = Arrays.copyOf(elementData, newCapacity);
        // “扩容”是创建新的数组，容量是原来的1.5倍，将老数组数据拷贝到新数组
        list.add(11);
        System.out.println(list);
    }
}
