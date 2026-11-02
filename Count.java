package FirstProgram;

public class Count {

	public static void main(String[] args) {
		int[] arr = {2,3,-4,8,0,-5,0,4,5};
		int CountPos = 0;
		int CountNeg = 0;
		int CountZero = 0;
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i] > 0) {
				CountPos++;
			}else if(arr[i] < 0) {
				CountNeg++;
			}else {
				CountZero++;
			}
		}
		System.out.println("positive count: " + CountPos);
		System.out.println("negative count: " + CountNeg);
		System.out.println("negative count: " + CountZero);
		
	}

	}


