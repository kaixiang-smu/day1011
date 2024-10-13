package com.qf.list;

import java.util.LinkedList;

public class Demo1_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(4);
        list.add(2);
        // 有序，允许重复
        System.out.println(list);
        // 且也有关于下标的操作方法
        list.add(0,0);
        System.out.println(list);
        Integer e = list.get(1);
        System.out.println(e);
        // 也可以遍历
        for (Integer i:list){
            System.out.println(i);
        }
        // 专门提供了关于头尾的操作
        list.addFirst(-1);
        list.addLast(8);
        System.out.println(list);
        /**
         * 类似地还有
         * getFirst()
         * getLast()
         * removeFirst()
         * removeLast()
         */
    }
}
