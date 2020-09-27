package TestJava;

import java.util.HashSet;
import java.util.Set;

public class MergeUnsortedArray {

	public static void main(String[] args) {

		MergeUnsortedArray a = new MergeUnsortedArray();
		int [] arr1 = {4,2,3,5,4,2,3};
		int [] arr2 = {9,1,7,2,4,2,1,2};

		Set<Integer> finalunion= new HashSet<>();
		
		a.UnionofUnsortedArray(arr1, arr2, finalunion);
		System.out.println(finalunion);

	}
	
	public void UnionofUnsortedArray(int [] arr1,int [] arr2, Set<Integer> finallist) {
		
		
		int i=0;
		int j=0;
		
		while(i < arr1.length)
		{
			finallist.add(arr1[i++]);
			
		}
		
		while(j < arr2.length)
		{
			finallist.add(arr2[j++]);
			
		}
	}

}
