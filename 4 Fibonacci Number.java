//斐波那契数列--斐波那契数
public class Solution {
	public static void main(String []args) {
		System.out.print(fibonacciNumber(10));
	}
	//用两个int存储代替memo数组
	public static int fibonacciNumber(int n) {
		if (n < 2) {
			return n;
		}
		//用first和second存储每次的memo[n-1]和memo[n-2],不断更新first和second的值，代替memo数组
		int first = 0;
		int second = 1;
		for (int i = 2; i <= n; i++) {
			int third = first + second;
			first = second;
			second = third;
		}
		//最后一次循环交换后，f(n)==second
		return second;
	}
}
