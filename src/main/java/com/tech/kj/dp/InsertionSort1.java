
package com.tech.kj.dp;

class InsertionSort1 {
  
  public static void main(String[] args) {
    
   int[] array= {20,54,-15,-9,0,45,2,11};
    
    
    for(int index = 1; index < array.length; index++){
     
      int nextElement = array[index];
      for(int i=0;i<index;i++){
        int sorted=array[i];
        if(nextElement<sorted){
          swap(array,index,i);
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

