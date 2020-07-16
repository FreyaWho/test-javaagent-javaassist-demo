package com.icbc.test;

public class Person {
    public void test() {
        System.out.println("执行test方法中：计算1到10000累加和");
        int sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);
    }
}
