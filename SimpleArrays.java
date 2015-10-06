import java.util.Arrays;


public class SimpleArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Array of primitives");
		int[] ints = {9,6,3};
		Arrays.sort(ints);
		for(int i=0; i < ints.length ; i++){
			System.out.println(ints[i]);
		}
		
		System.out.println("\nArray of Strings");
		String[] strings = {"Red","Green","Blue"};
		Arrays.sort(strings);
		for(String colors : strings){
			System.out.println(colors);
		}
		
		
		System.out.println("Setting an Initial size");
		int[] sized = new int[10];
		
		for(int i = 0; i < sized.length; i++){
			sized[i] = i * 100;
			System.out.println(sized[i]);
		}
		
		System.out.println("Copying an array");
		int[] copied = new int[5];
		System.arraycopy(sized, 5, copied, 0, 5);
		for(int value : copied){
			System.out.println(value);
		}
		
		

	}

}
