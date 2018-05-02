package com.practice;

/**
 * Created by jay on 2018/5/2.
 */
public class HalfSelect {

    public static void sort(int a,int[] arr){
        int low=0;
        int high=arr.length-1;
        int mid;
        while(low<high){
            mid=(low+high)/2;
            if(arr[mid]==a){
                System.out.println("是第"+(mid+1)+"个");
                break;
            }
            else if(arr[mid]>a){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }



    }

    public static void main(String[] args) {
        int [] arr={0,1,2,3,4,5,6,7,8,9,10};
        sort(3,arr);
    }






}
