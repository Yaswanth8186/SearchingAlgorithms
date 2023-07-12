public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,9,20};
		int search = 1, low = 0, high = arr.length - 1, mid, flag = 0;
		while(low <= high) {
			mid = (low + high) / 2;
			if(arr[mid] == search) {
				flag = 1;
				System.out.println("Number " + search + " is found at " + (mid + 1) + "th position");
				break;
			}else if(arr[mid] < search) {
				low = mid + 1;
			}else { 
					high = mid - 1;
			}
		}
		if(flag == 0) 
			System.out.println("Number " + search + " is not found in the array");
	}
}
