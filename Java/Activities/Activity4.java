package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args){
        int[] Array= {4,3,2,10,12,1,5,6};
        System.out.println("Array Before Sorting: "+ Arrays.toString(Array));
        sort(Array);
        System.out.println("Array After Sorting: "+ Arrays.toString(Array));
    }
    static void sort(int array[]){
        int size = array.length,i;
        for(i=1;i<size;i++){
          int Value=array[i];
          int j=i-1;
          while(j>=0&&Value<array[j]){
              array[j+1]=array[j];
              --j;

          }
          array[j+1]=Value;
        }
    }
}
