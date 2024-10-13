package com.qf.col;

import java.util.ArrayList;
import java.util.Collection;

// 泛型
public class Demo3 {
    public static void main(String[] args) {
        // 没有泛型
        Collection col = new ArrayList();
        // 类型没有限制
        col.add(1);
        col.add("2");
        col.add(1.1);
        for (Object e:col){
            System.out.println(e);
        }
        // 使用泛型
        Collection<String> col2 = new ArrayList<>();
        // 就可以限制数据类型
        col2.add("A");
        col2.add("B");
        col2.add("C");
        for (String s:col2){
            System.out.println(s);
        }

        Collection<Integer> col3 = new ArrayList<>();
        col3.add(1);
        col3.add(2);
        col3.add(3);
        for (Integer i:col3){
            System.out.println(i);
        }
        /**
         * 为什么要用泛型？
         * 1）经验：虽然集合可以存储多种数据类型，但是大部分场景都只是存储同一种数据
         * 2）最主要的原因：没有泛型，类型太杂，需要使用指定类型还需要强制转换
         *   强制转换还容易报错
         *   所以：泛型的好处就会可以约定数据类型，从而减少数据类型转型
         */
    }
}
