package sorting;
import java.util.*;
import java.io.*;

public class mergeSort {
	void sort(Integer[] list,int low,int high){
		if(low>=high) return;
		int mid = (low+high)>>>1;
		sort(list,low,mid);
		sort(list,mid+1,high);
		int low1=low;
		int low2=mid+1;
		int i=0;
		Integer[] temp= new Integer[high-low+1];
		while(low1 <= mid && low2<=high){
			//System.out.println(high);
			if(list[low1]<list[low2]){
				temp[i]=list[low1];
				low1++;
			}else{
				temp[i]=list[low2];
				low2++;
			}
			i++;
		}
		int dst,length;
		if(low1>mid){
			dst=low2;
			length=high-low2+1;
		}else{
			dst=low1;
			length=mid-low1+1;
		}
		System.arraycopy(list, dst, temp, i, length);
		System.arraycopy(temp, 0, list, low, high-low+1);
	}
	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(new File("input.txt"));
		int n= in.nextInt();
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
		mergeSort ms =new mergeSort();
		ms.sort(bar, 0, bar.length-1);
		for(int i=0;i<bar.length;i++){
			System.out.println(bar[i]);
		}
	}
}
