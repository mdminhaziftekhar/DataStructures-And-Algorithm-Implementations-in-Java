import java.util.Scanner;

public class mergeSort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of the array : ");
		int size = scan.nextInt();
	
		
		int[] arr = new int[size];
		
		
		System.out.println("Enter the elements of the array : ");
		
		for(int i = 0; i<size; i++) {
			arr[i] = scan.nextInt();
		}
		
		
		mergeSort(arr, 0, arr.length-1);
		
		
		System.out.println("Array after sorting : ");
		
		for(int it : arr) System.out.print(it+" ");
		
		System.out.println();
		
		scan.close();
		
	}
	
	public static void mergeSort(int[] arr, int low, int high) {
		
		if(low < high) {
			int mid = (low + high) / 2;
			
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr, low, mid, high);
		}
		
	}
	
	public static void merge(int []arr, int low, int mid, int high) {
		int i = low;
		int j = mid+1;
		int k = low;
		
		
		int []b = new int[arr.length];
		
		while(i<=mid && j<=high) {
			if(arr[i] <= arr[j]) {
				b[k] = arr[i];
				i++;
				k++;
			}
			else {
				b[k] = arr[j];
				j++;
				k++;
			}
		}
		
		if(i>mid) {
			while(j <= high) {
				b[k] = arr[j];
				j++;
				k++;
			}
		}
		else {
			while(i<=mid) {
				b[k] = arr[i];
				i++;
				k++;
			}
		}
		
		for(k = low; k<=high; k++) {
			arr[k] = b[k];
		}
	}

}
