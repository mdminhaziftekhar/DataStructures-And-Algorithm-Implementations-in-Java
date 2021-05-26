import java.util.*;

public class bubbleSort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of the array : ");
		int size = scan.nextInt();
		
		int []arr = new int[size];
		
		System.out.println("Enter the elements of the array : ");
		
		for(int i = 0; i<size ; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i<arr.length; i++) {
			
			for(int j = 1; j<size-i; j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		System.out.println("Array after sorting with bubble sort : ");
		
		for(int it : arr) System.out.println(it);

	}

}
