//斐波那契数列--递归
public class Solution {
	public static void main(String []args) {
		for(int i=1; i<10; i++){
			System.out.print(fibonacci(i));
			System.out.print(",");
		}
	}
	//输入n，返回f(n)
	//根据递归关系和终止条件很容易写出递归逻辑
	public static int fibonacci(int n) {
		if (n < 2) {
			return n;
		} 
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}
