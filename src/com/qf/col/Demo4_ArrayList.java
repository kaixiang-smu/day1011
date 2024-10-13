package com.qf.col;

import java.util.ArrayList;

public class Demo4_ArrayList {
    public static void main(String[] args) {

        // 定义泛型
        // 空参构造，创建空集合(默认容量10)
        ArrayList<Integer> list = new ArrayList<>();
        // 最基本的添加方法
        list.add(3);
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(4);
        list.add(2);
        // 遍历(保证顺序-->有序)
        // 且允许重复元素
        for (Integer i : list) {
            System.out.println(i);
        }

        // 其他常规方法不再演示
        // 主要掌握关于下标的方法
        // 按照下标插入
        //void add(int index,E e) 按照下标位置加入元素(增)(Create创建/新增)
        // E在没学泛型之前认为是Object，学完泛型之后就是你指定的泛型
        // E就是一个标准的数据类型，此处E指Integer
        list.add(3,0);
        System.out.println(list);
        // 按照下标获得元素(取值)
        // E get(int index) 按照下标位置获得元素 (查)(Read读取/查询)
        Integer e = list.get(6);
        System.out.println("下标6的值："+e);

        // 按照下标修改值
        // E set(int index,E e) 按照下标位置设置(修改)元素(改)(Update更新/修改)
        Integer old = list.set(2, 5);
        System.out.println("修改后的集合:"+list);
        System.out.println("返回的数据:"+old); // 返回的是替换后的旧值

        // 按照下标删除
        // E remove(int index) 按照下标位置移除元素(删)(Delete删除)
        Integer remove = list.remove(4);
        System.out.println("删除后的集合:"+list);
        System.out.println("返回的数据:"+remove); // 返回的是删除的值
    }
}
