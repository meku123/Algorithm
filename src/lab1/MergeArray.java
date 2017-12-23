package lab1;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
			
		int [] arra = {1,4,5,8,17};
		int [] arrb ={2,4,8,11,13,21,23,25};
		System.out.println(Arrays.toString((mergeArray(arra,arrb))));
  }
	public static int [] mergeArray(int [] arr1, int [] arr2){
		int [] arr3 = new int [arr1.length + arr2.length ];
		int L1 = arr1.length, L2 = arr2.length;
		int count = 0, i = 0, j = 0;
		
		while(i < L1-1 && j < L2-1){
			if(arr1[i] < arr2[j]){
				arr3[count] = arr1[i];
				i++;
				count++;
			}else{
				arr3[count] = arr2[j];
				j++;
				count++;
				
			}
		
		}
		while(i < L1){
			arr3[count] = arr1[i];
			i++;
			count++;
		}	
		while(j < L2){
			arr3[count] = arr2[j];
			j++;
			count++;
		}
		return arr3;
	}
}
