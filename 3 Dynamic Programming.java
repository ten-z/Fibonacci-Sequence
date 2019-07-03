//斐波那契数列--动态规划
public class Solution {
	public static void main(String []args) {
		System.out.print(fibonacciDynamic(10));
	}
	//用循环代替递归思路，从memo[2]求至memo[n]
	public static int fibonacciDynamic(int n) {
		if (n < 2) {
			return n;
		}
		//初始化memo数组,从1～n，所以长度为n+1
		int[] memo = new int[n + 1];
		//已知的0和1位置的值，代替递归终止条件。
		memo[0] = 0;
		memo[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			memo[i] = memo[i - 1] + memo[i - 2];
		}
		//memo[n]即f(n)的值
		return memo[n];
	}
}
