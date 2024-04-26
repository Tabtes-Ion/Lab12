
public class Lab12Prob01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recursiveAbstract(1));
	}
	
	public static long recursiveAbstract(long num) {
		if (num == 0) {
			return 1;
		}
		else {
			return recursiveAbstract(num - 3) * recursiveAbstract(num - 2) - recursiveAbstract(num - 1);
		}
	}
}
