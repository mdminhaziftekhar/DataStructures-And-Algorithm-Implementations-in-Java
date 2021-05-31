import java.util.*;

public class selection_Sort {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of the array : ");
		
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of the array : ");
		
		for(int i = 0; i<size; i++) {
			arr[i] = scan.nextInt();
		}
		
		selectionSort(arr);
		
		System.out.print("Array after sorting with selection sort : ");
		
		for(int it : arr) System.out.print(it+" ");

	}

	public static void selectionSort(int[] arr) {
		int i, j;
		
		for(i = 0; i<arr.length; i++) {
			
			int min = i;
			
			for(j = i+1; j<arr.length; j++) {
				
				if(arr[min] > arr[j]) {
					min = j;
				}
				
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

}
