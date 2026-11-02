//Write a program to find the largest number in an array.

package FirstProgram;

public class Largest {

	public static void main(String[] args) {
		
		int[] arr = {50,45,80,10,20,30,40};
		int largest = arr[0];

		for(int i=0; i<arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
			
		}
		System.out.println("largest: " + largest);
}
}
