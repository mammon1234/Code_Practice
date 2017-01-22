package sorting;
import java.util.*;
import java.io.*;
public class insertSort {
	void sort(Integer[] list){
		int length = list.length;
		int j,tmp;
		for(int i=0;i<length;i++){
			j=i;
			tmp=list[j];
			while(j>0 && tmp<=list[j]){
				j--;
			}
			if((j+1)!=i){			
				System.arraycopy(list, j, list, j+1, (i-j));
				list[j]=tmp;
			}
			System.out.println(list[i]);
		}
	}
	public static void main(String [] args) throws FileNotFoundException{
		Scanner in = new Scanner(new File("input.txt"));
		int n = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		while(n != -1){
			list.add(n);
			n= in.nextInt();
		}
		in.close();
		Integer[] bar = list.toArray(new Integer[list.size()]);
		for(int i=0;i<bar.length;i++){
			System.out.println(bar[i]);
		}
		System.out.println("!!!!");
		insertSort is = new insertSort();
		is.sort(bar);
		for(int i=0;i<bar.length;i++){
			System.out.println(bar[i]);
		}
	}
}
