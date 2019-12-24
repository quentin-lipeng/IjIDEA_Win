package com.company;

public class Copy {
    public static void main(String[] args) {
        String[] arr1 = new String[] { "neusofteducation" };
        String[] arr2 = new String[]{"a","b","c","d"};

        System.out.println("复制前的数组：" + arr2[0]);
        System.arraycopy(arr1, 0, arr2, 0, 1);
        System.out.println("复制后的数组：" + arr2[0]);
    }
}
