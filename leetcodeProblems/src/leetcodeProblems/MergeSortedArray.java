package leetcodeProblems;
import java.util.Arrays;


public class MergeSortedArray {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
		int m = 3, n = 3;
		mergeSortedArrays(nums1, nums2, m, n);
		for(int i=0; i<m+n; i++) {
			System.out.print(nums1[i]+" ");
		}
	}
	
	public static void mergeSortedArrays(int[] nums1, int[] nums2, int m,  int n) {
		int p1 = m-1, p2 = n-1;
		int p = m+n-1;
		
		 while (p1 >= 0 && p2 >= 0) {
	            if (nums1[p1] > nums2[p2]) {
	                nums1[p] = nums1[p1];
	                p1--;
	            } else {
	                nums1[p] = nums2[p2];
	                p2--;
	            }
	            p--;
	        }

	        // Copy remaining elements of nums2 (if any)
	        while (p2 >= 0) {
	            nums1[p] = nums2[p2];
	            p2--;
	            p--;
	        }
	
		
	}
}
