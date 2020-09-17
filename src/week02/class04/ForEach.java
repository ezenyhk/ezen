package week02.class04;

public class ForEach {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int sum = 0;
		
		for (int i : a) {
			i = 1;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
