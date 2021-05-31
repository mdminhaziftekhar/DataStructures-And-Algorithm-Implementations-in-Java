import java.util.Scanner;

public class quick_Sort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of the array : ");
		for(int i = 0; i<size; i++) arr[i] = scan.nextInt();
		
		quicksort(arr, 0, arr.length-1);
		
		System.out.print("Array after sorting with quicksort : ");
		for(int it : arr) System.out.print(it + " ");
		
		System.out.println();

	}
	
	public static void quicksort(int[] arr, int low, int high) {
		if(low < high) {
			int loc = partition(arr, low, high);
			
			quicksort(arr, low, loc-1);
			quicksort(arr, loc+1, high);
		}
	}
	
	public static int partition(int[]arr, int low, int high) {
		 int pindex = low - 1;
		 int pivot = arr[high];
		 
		 for(int i = low; i<high; i++) {
			 if(arr[i] < pivot) {
				 pindex++;
				 
				 swap(arr, pindex, i);
			 }
		 }
		 
		 pindex++;
		 swap(arr, pindex, high);
		 
		 return pindex;
	}

	public static void swap(int[] arr, int pindex, int i) {
		
		int temp = arr[pindex];
		arr[pindex] = arr[i];
		arr[i] = temp;
		
	}
}
