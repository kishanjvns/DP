
package com.tech.kj.dp;

class BubbleSort {
  
  public static void main(String[] args) {
    
   int[] array= {20,54,-15,-9,0,45,2,11};
    
    for(int index = array.length-1; index > 0; index--){
      
      for(int i= 0; i < index; i++){
        
        if(array[i]>array[i+1]){
          swap(array,i,i+1);
        }
        
      }
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
