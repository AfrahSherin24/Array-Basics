package FirstProgram;

public class CountEveOdd {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,7,8,9,11,13};
		int CountEven = 0;
		int CountOdd = 0;
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i] % 2 ==0) {
				CountEven++;
			}else {
				CountOdd++;
			}
		}
		System.out.println("even count: " + CountEven);
		System.out.println("odd count: " + CountOdd);
		
	}

}
