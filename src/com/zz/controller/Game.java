package com.zz.controller;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("媛媛你好！");
        System.out.println("我在0-200之间随机想了一个整数，看看你能不能猜对");
        int answer = (int)(Math.random() * 201);
        System.out.println("媛媛玩这个游戏掉了");
        System.out.println(answer * 4 -10);
        System.out.println("头发");
//        int answer = 67;
        int count = 1;
        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入你猜的数字！");
            int guessNum = scan.nextInt();
            if (guessNum == answer){
                System.out.println("恭喜你猜对了！");
                System.out.println("只用了" + count + "次，牛逼！");
                break;
            }else if (guessNum > answer){
                System.out.println("猜大了，再试试吧");
                count++;
                continue;
            }else if (guessNum < answer){
                System.out.println("猜小了，再试试吧");
                count++;
                continue;
            }
        }


    }
}
