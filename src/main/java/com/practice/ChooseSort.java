package com.practice;

/**
 * Created by jay on 2018/4/1.
 *
 * 选择排序 最简单的排序 从i=0开始取数比较 根据大小交换位置
 *每经过一次内层循环就得到了当前从i+1到尾端的最小值
 *时间复杂度为O(N^2)
 *
 */
public class ChooseSort {
   //原始
    public void sort(int[] arrs){
        for(int i=0;i<arrs.length-1;i++){

            for(int j=i+1;j<arrs.length;j++){
                if(arrs[i]>arrs[j]){
                    int temp=arrs[j];
                    arrs[j]=arrs[i];
                    arrs[i]=temp;
                }
            }


        }
    }
    //优化 没有必要每次比较就交换 可以留下最小的位置 然后在整个比较完之后再替换
    public void upgradeSort(int[] arrs){
        for(int i=0;i<arrs.length-1;i++){
               int temp=i;
            for(int j=i+1;j<arrs.length;j++){
                if(arrs[temp]>arrs[j]){
                    temp=j;
                }

            }
            if(temp!=i){
                int num=arrs[i];
                 arrs[i]= arrs[temp];
                arrs[temp]=num;
            }


        }





    }





    public static void main(String[] args){
        int [] arrs={12,44,5,665,7,876,3};
        ChooseSort chooseSort = new ChooseSort();
        chooseSort.upgradeSort(arrs);
        for(int i:arrs){
            System.out.println(i);
        }
    }


}
