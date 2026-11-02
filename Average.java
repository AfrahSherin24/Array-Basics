package FirstProgram;

public class Average {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,7};
		int sum =0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			}
		
		double average = (double) sum / arr.length;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + average);
		
	}
}
