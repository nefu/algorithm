package com.practice;

/**
 * Created by jay on 2018/4/1.
 * 所谓冒泡就是挨着的两个比较（用一个两格的比较框）然后一轮下来最大的出现在最右端
 * 这时候里层循环的范围就小了外层结束一次 里层范围减一
 * 外层循环只是记录冒了几次
 *
 *
 */
public class BubbleSort {
 public void sort(int[] arrs){
     for(int i=0;i<arrs.length;i++){

         for(int j=0;j<arrs.length-i-1;j++){
             if(arrs[j]>arrs[j+1]){
                 int temp=arrs[j+1];
                 arrs[j+1]=arrs[j];
                 arrs[j]=temp;

             }
         }



     }
 }
    public static void main(String[] args){
        int [] arrs={12,44,5,665,7,876,3};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arrs);
        for(int i:arrs){
            System.out.println(i);
        }
    }

}
