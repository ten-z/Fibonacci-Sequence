//斐波那契数列--公式法
public class Solution {
	public static void main(String []args) {
		System.out.print(fibonacci(10));
	}
	
	//公式法的代码是最短的，本身也没有什么需要注释的。具体的推理过程请看我的博客
	public static int fibonacci(int n) {
		if(n < 2)
			return n;
		
		double sqrt5=Math.sqrt(5);
		double fibn=Math.pow((1+sqrt5)/2,n)-Math.pow((1-sqrt5)/2,n);
		return (int)(fibn/sqrt5);
	}
}
