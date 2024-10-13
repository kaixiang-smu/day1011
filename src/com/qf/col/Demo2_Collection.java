package com.qf.col;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// 集合的迭代
public class Demo2_Collection {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(1);
        col.add(2);
        col.add(3);
        col.add(4);

        // 遍历(迭代)集合
        // 1、获得迭代器
        Iterator iterator = col.iterator();
        // 2、通过迭代器完成迭代(遍历)
        while (iterator.hasNext()){ // hasNext()判断有无下一个元素
            Object o = iterator.next(); // next()取出下一个元素
            //System.out.println(o);
        }


        // 使用增强for循环(foreach)改写迭代器遍历
        /**
         * for(遍历得到的结果:要被遍历的集合/数组)
         * 结果就需要数据类型修饰，变量存储
         * 数据类型修饰变量，变量存储数据
         * for(数据类型 变量:集合/数组){
         *
         * }
         * 1）冒号右边是写要被遍历的集合或者数组对象
         * 2）每次从集合或者数组取出的值赋值给左边变量
         */
        for (Object e:col){
            System.out.println(e);
        }
        System.out.println("-------------------");
        int[] arr = {11,22,33};
        for (int i:arr){
            System.out.println(i);
        }
    }
}
