package sorting;

import java.io.*;
import java.util.*;
public class bubbleSort {
	void sort(Integer[] list){
		int length = list.length;
		int temp;
		for(int i= length-1;i>0;i--){
			int j =i;
			while(list[j] < list[j-1]){
				temp=list[j];
				list[j]=list[j-1];
				list[j-1]=temp;
				j--;
				if(j == 0) {
					break;
				}
			}
		}
	}
	public static void main(String[] args)throws FileNotFoundException{
		Scanner in = new Scanner(new File("input.txt"));
		int n = in.nextInt();
		ArrayList<Integer> list1 = new ArrayList<>();
		while(n != -1){
			list1.add(n);
			n= in.nextInt();
		}
		in.close();
		Integer[] bar = list1.toArray(new Integer[list1.size()]);
		for(int i=0;i<bar.length;i++){
			System.out.println(bar[i]);
		}
		System.out.println("!!!!");
		bubbleSort bs = new bubbleSort();
		bs.sort(bar);
		for(int i=0;i<bar.length;i++){
			System.out.println(bar[i]);
		}

	}
}
