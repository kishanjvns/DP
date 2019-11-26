package com.tech.kj.dp.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 4 };

//		for (int i = prices.length; i > prices.length / 2; i--) {
//			int temp = prices[prices.length - i];
//			prices[prices.length - i] = prices[i - 1];
//			prices[i - 1] = temp;
//		}
//		for (int x : prices)
//			System.out.print(x);
		System.out.println(factorial(6));
		char[] binary =Integer.toBinaryString(6).toCharArray();			
		int count=0;
		int lastCount=0;
		int x=0;
		 for(int i=0;i<binary.length;i++){                        
	            if(binary[i]=='1'){                
	                x=i;
	                count++;
	                continue;
	            }
	            if(count>lastCount)
	            	lastCount=count;
	            count=0;
	        }
		 if(count>lastCount)
         	lastCount=count;
		System.out.println("\n count" +lastCount);

	}
	static int factorial(int n) {
        if(n==1)
            return 1;        
        return  factorial(n-1)*n;
        
    }

}
