package com.qf.col;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


public class Demo1_Collection {
    public static void main(String[] args) {
        // Collection是接口，不能直接创建对象
        // 但是当作父类引用指向子类对象
        Collection col = new ArrayList(); // 向上转型

        // 存放元素 add(Object e)
        col.add(1); // 1-->自动装箱Integer对象-->Object
        col.add("a");
        col.add(new Date());
        System.out.println(col);

        // 再创建集合
        Collection col2 = new ArrayList();
        col2.add(11);
        col2.add(22);
        col2.add(33);

        // 批量添加 addAll(Collection c)
        // 将参数集合中的所有数据都添加到当前集合
        col.addAll(col2);
        System.out.println(col);

        // 移除元素
        // boolean remove(Object o) 删除指定元素
        boolean r1 = col.remove(-11);
        System.out.println("删除是否成功："+r1);
        System.out.println("删除后："+col);

        // boolean removeAll(Collection<?> c)
        // 批量删除
        //col.removeAll(col2); // 删除指定数据
        //System.out.println("批量删除后："+col);

        // 保留全部(反向删除)
        // boolean retainAll(Collection<?> c)
        col.retainAll(col2); // 保留指定数据，删除其他数据
        System.out.println("保留全部(反向删除)后："+col);

        // 删除全部数据(清空)
        // clear()
        //col.clear();
        //System.out.println("清空后："+col);

        // 获得集合大小(尺寸/容量)
        // size()
        int size = col.size();
        System.out.println(size);

        // 判断集合是否为空(没有元素，长度为0即为空)
        // isEmpty()
        boolean empty = col.isEmpty();
        System.out.println("集合是否为空："+empty);

        // 判断集合是否包含指定元素
        // contains(Object o)
        boolean contains = col.contains(11);
        System.out.println("集合是否包含指定元素："+contains);
    }
}
