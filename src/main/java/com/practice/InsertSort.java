package com.practice;

import java.util.Arrays;

/**
 * Created by jay on 2018/3/22.
 */
public class InsertSort {

    /**
     * 这是一个直接插入排序 思想是默认被插入的队列是有序的
     * 然后取当前被插入值 当前位置开始 从后往前进行值的比较
     *
     * */
    public void sort(int[] arrs){
        int temp;
        int j;
        //遍历数组 依次拿到需要插入的值 并且默认第一个有序
        for(int i=1;i<arrs.length;i++){
            temp=arrs[i];
            //从后往前遍历 插入值之前的队列值
            for(j=i-1;j>=0;j--){
                if(arrs[j]>temp){
                    arrs[i]=arrs[j];
                }
                else{
                    /**
                     * 因为默认被插入的队列是有序的 所以 只要有一个数是小于被插入的数的
                     * 那么这个数之前的就没必要在比了 都比被插入数小
                     * */
                    break;
                }
            }
            /**
             *之所以是j+1是因为在最后一次的for循环失败时j 多减了一个1
             * */
            arrs[j+1]=temp;
            System.out.println(i + ":" + Arrays.toString(arrs));
        }




    }

    public static void main(String[] args) {
        int [] arr={23,453,3,12,566};
       new InsertSort().sort(arr);
    }
}
