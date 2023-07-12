public class LinearSearch {
	public static void main(String[] args) {
		int[] a = {1, 2, 4, 6, 3, 9, 8};
		int search = 6, flag = 0;
		for(int i = 0;i < a.length; i++) 
			if(a[i] == search)
			{
				flag = 1;
				System.out.println("Element " + search + " is found at position " + (i + 1));
				break;
			}
		if(flag == 0)
			System.out.println("Element is not found in the array");
	}
}
