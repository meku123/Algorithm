package lab3;

import java.util.Arrays;
import runtime.Sorter;

public class ShellSort extends Sorter {
	int[] arr;

	@Override
	public int[] sort(int[] arr) {
		this.arr = arr;
		shellSort();
		return this.arr;

	}

	public void shellSort() {
		int inner, outer;
		int temp;

		int nElems = arr.length;
		int h = 1; // find initial value of h
		while (h <= nElems / 3)
			h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)

		while (h > 0) {// decreasing h, until h=1	
			for (outer = h; outer < nElems; outer++) {
				temp = arr[outer];
				inner = outer;
				while (inner > h - 1 && arr[inner - h] >= temp) {
					arr[inner] = arr[inner - h];
					inner -= h;				
				}
				arr[inner] = temp;
				System.out.println("G 3" + Arrays.toString(arr));
			}
			
			h = (h - 1) / 3;
		
		}
		System.out.println("Final result");
	}
	public static void main(String[] args) {
		int[] test = {13, 2, 8, 7, 3, 1, 5, 9, 10, 4,12, 6, 11 };
		
		ShellSort ss = new ShellSort();
		System.out.println(Arrays.toString(ss.sort(test)));
	}
}
