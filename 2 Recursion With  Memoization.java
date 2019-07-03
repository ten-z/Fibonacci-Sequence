//斐波那契数列--记忆化搜索
public class Solution {
	public static void main(String []args) {
		System.out.print(fibonacci(10));
	}
	
	public static int fibonacci(int n) {
		if(n<2)
			return n;
		//初始化memo数组,从1～n，所以长度为n+1
		int[] memo = new int[n+1];
		return fibonacciMemorize(n, memo);
	}
	
	//用memo数组存储计算结果
	public static int fibonacciMemorize(int n, int[] memo) {
		if(n==1 || n==2){
			return 1;
		}
 
		//如果memo(n)有值，直接返回memo[n]，减少递归次数，由于n从1开始，memo[0]=0不受影响。
		if(memo[n]==0){
			//如果当前f(n)没被计算过，则计算后将结果存入memo[n]
			memo[n] = fibonacciMemorize(n-1, memo) + fibonacciMemorize(n-2, memo);
		}
		return memo[n];
	}
}
