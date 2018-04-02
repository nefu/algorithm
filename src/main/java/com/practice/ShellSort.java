package com.practice;

/**
 * Created by jay on 2018/4/2.
 * 希尔排序的核心思想是将一个长得数组分割成越来越散的小数组们 最后散到一就是有序数组了
 * 对子数组中相对位置相同的进行排序 有效的降低了在普通的插入算法里类似{198,32,5，0}这种后面
 * 都是特别小的值的时间复杂度
 * 如何划分子数组的大小 引入了一个增量的概念 现在采用动态增量
 *
 *
 * 两个for 一个while
 * 第二层for 控制间隔为gap 的两个框位移
 *
 *
 */
public class ShellSort {

    public void sort(int[] arrs){
        //控制比较框的大小
        for(int gap=arrs.length/2;gap>0;gap/=2){
            //控制比较框的移动
            for(int i=gap;i<arrs.length;i++){
                int j = i;
                //使用while循环是因为要比较多个子数组中的对应位置的值
              while(j-gap>=0 && arrs[j]<arrs[j-gap]){
                    //插入排序采用交换法
                    int temp = arrs[j - gap];
                    arrs[j - gap] = arrs[j];
                    arrs[j] = temp;
                    //为了跳出循环
                    j-=gap;
                }




            }
        }




    }/*{
        //第一步 将原数组分段
        for (int gap = arrs.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < arrs.length; i++) {
                int j = i;
                while (j - gap > 0 && arrs[j - gap] > arrs[j]) {
                    int temp = arrs[j - gap];
                    arrs[j - gap] = arrs[j];
                    arrs[j] = temp;
                    j--;
                }
            }


        }
    }*/


    public static void main(String[] args){
      int[] arrs={213,34,5,354,6645,75,85,9,676};
        new ShellSort().sort(arrs);
        for(int i:arrs){
            System.out.println(i);
        }
    }




    }




