import java.util.*;

class QuickSort
{
	
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(int[] arr, int low, int high)
	{

		int rIndex = (low) + (int)(Math.random() * (high - low + 1));
        //System.out.print(rIndex+" ");
		swap(arr, low, rIndex); 
		int pivot = arr[low];
		int i = low - 1, j = high + 1;

		while (true) {
			do {
				i++;
			} while (arr[i] < pivot);

			do {
				j--;
			} while (arr[j] > pivot);

			if (i >= j) 
				return j;

			swap(arr, i, j);
			
		}
	}
	static void quickSort(int[] arr, int low, int high)
	{
		if (low < high) {
			int p = partition(arr, low, high);
			quickSort(arr, low, p);
			quickSort(arr, p + 1, high);
		}
	}

	public static void main(String[] args)
	{
    Scanner in=new Scanner(System.in);
    System.out.println("Enter length: ");
    int n=in.nextInt();
		int[] arr = new int[n];
    System.out.println("Enter elements:");
    for(int i=0;i<n;i++)
        arr[i]=in.nextInt();
		quickSort(arr, 0, arr.length - 1);

		System.out.println("Sorted array : ");
		System.out.print(Arrays.toString(arr));
    System.out.println();
    in.close();
	}
}

