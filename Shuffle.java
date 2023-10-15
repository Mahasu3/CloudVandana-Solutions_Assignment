package Java;

public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int []arr={1,2,3,4,5,6,7};
		
	shuffle(arr);
	
	for(int res:arr) System.out.print(res+" ");
		
	}

	private static void shuffle(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			int j= (int) (Math.random()*(i+1));
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		
	}

}
