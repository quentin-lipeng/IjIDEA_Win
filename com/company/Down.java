package com.company;

import java.util.Scanner;
public class Down {
    public static void main(String[] args) {
        int i;
        int[] arr;
        System.out.println("请输入数组的长度");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        arr = new int[num];
        System.out.println("请输入" + num + "个数");
        Scanner in = new Scanner(System.in);
        for (i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (i = 0; i < arr.length / 2; i++) {
            int m = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = m;
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

