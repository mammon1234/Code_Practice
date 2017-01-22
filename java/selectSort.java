package sorting;
import java.io.*;
import java.util.*;
public class selectSort {
	void sort(Integer[] list){
		int length = list.length;
		int min;
		int index=0;
		for(int i=0;i<list.length;i++){
			int j=i;
			min = Integer.MAX_VALUE;
			while(j<list.length){
				if(list[j]<min){
					min =list[j];
					index= j;
				}
				j++;
			}
			int tmp = list[index];
			list[index]=list[i];
			list[i]=tmp;
		}
	}
	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(new File("input.txt"));
		int n = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		while( n!= -1){
			list.add(n);
			n=in.nextInt();
		}
		in.close();
		Integer[] bar = list.toArray(new Integer[list.size()]);
		for(int i=0;i<bar.length;i++){
			System.out.println(bar[i]);
		}
		System.out.println("!!!!");
		selectSort ss = new selectSort();
		ss.sort(bar);
		for(int i=0;i<bar.length;i++){
			System.out.println(bar[i]);
		}

	}
}
