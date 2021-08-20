

package com.example;

class SelectionSort {
  
  public static void main(String[] args) {
    
   int[] array= {20,54,-15,-9,0,45,2,11};
    
    for(int index = array.length-1; index > 0; index--){
      int max = 0;
      for(int i= 1; i <= index; i++){
        if(array[max]<array[i]){
          max = i;
        }
      }
      swap(array,max,index);
      
    }
    show(array);
  }
  
  public static void swap(int[] array,int i,int j){
    if(i==j){
      return;
    }
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
  
  public static void show(int[] array){
    for(int i=0;i<array.length;i++){
      	System.out.print(array[i]+"\t");
    }
    System.out.println();
  }
  
}
