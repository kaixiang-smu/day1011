package com.qf.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        System.out.println("----------欢迎来到点歌系统----------");
        System.out.println("0.添加歌曲至列表");
        System.out.println("1.将歌曲置顶");
        System.out.println("2.将歌曲前移一位");
        System.out.println("3.退出");
        ArrayList<String> songList = new ArrayList<>();
        songList.add("奇迹再现");
        songList.add("夜空中最亮的星");
        songList.add("姐就是女王");
        songList.add("甜蜜蜜");
        songList.add("月半小夜曲");
        System.out.println("初始歌曲列表："+songList);
        System.out.println("请输入要执行的操作序号：");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i<0 || i>3){
            System.out.println("操作序号输入错误，请重新输入");
        }
        if (i==0){
            System.out.println("请输入要添加的歌曲名称：");
            Scanner song = new Scanner(System.in);
            String s = song.nextLine();
            System.out.println("已添加歌曲："+s);
            songList.add(s);
            System.out.println("当前歌曲列表："+songList);
        }
        if (i==1){
            System.out.println("请输入要置顶的歌曲名称：");
            Scanner song = new Scanner(System.in);
            String s = song.nextLine();
            System.out.println("已将歌曲"+s+"置顶");
            songList.remove(s);
            songList.add(0,s);
            System.out.println("当前歌曲列表："+songList);
        }
        if (i==2){
            System.out.println("请输入要置前的歌曲名称：");
            Scanner song = new Scanner(System.in);
            String s = song.nextLine();
            System.out.println("已将歌曲"+s+"置前一位");
            int index = songList.indexOf(s);
            songList.remove(s);
            songList.add(index-1,s);
            System.out.println("当前歌曲列表："+songList);
        }
        if (i==3){
            System.out.println("----------退出----------");
        }

    }
}
