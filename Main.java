import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");

        int size = scan.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }
        arr = Sorting.insertionSort(arr);

        System.out.println("Array after sorting with insertion sort : ");

        for (int it:arr) {
            System.out.println(it);
        }
    }
}