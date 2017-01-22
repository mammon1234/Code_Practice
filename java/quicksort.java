package sorting;

import java.io.*;
import java.util.*;

public class quicksort {
	void sort(Integer[] list,int low,int high){
		if(low >= high) return;
		int low1=low;
		int high1=high;
		int pivot = list[low];
		int tmp;
		while(low < high){
			while(high>low&&list[high]>=pivot ) high--;
			tmp=list[high];
			list[high]=list[low];
			list[low]=tmp;
			
			while(low <high&&list[low]<pivot ) low++;
			tmp=list[high];
			list[high]=list[low];
			list[low]=tmp;
		}
		System.out.println(low);
		System.out.println(high);
		System.out.println("!!!!");
		sort(list,low1,high-1);
		sort(list,high+1,high1);
	}
	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(new File("input.txt"));
		int n = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		while(n!=-1){
			list.add(n);
			n=in.nextInt();
		}
		in.close();
		Integer[] bar = list.toArray(new Integer[list.size()]);
		for(int i=0;i<bar.length;i++){
			System.out.println(bar[i]);
		}
		System.out.println("!!!!");
		quicksort qs= new quicksort();
		qs.sort(bar,0,bar.length-1);
		for(int i=0;i<bar.length;i++){
			System.out.println(bar[i]);
		}
	}
}
