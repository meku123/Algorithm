package sortroutines;

import runtime.Sorter;

public class InsertionSort extends Sorter  {
	
	int[] arr;

	public int[] sort(int[] anArray) {
		this.arr = anArray;
		insertionSort();
		return arr;
	}

	private void insertionSort() {
		
		int len = arr.length;
		int temp = 0;
		int j = 0;
		for (int i = 1; i < len; ++i) {
			temp = arr[i];
			j = i;
			while (j > 0 && temp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}


}
