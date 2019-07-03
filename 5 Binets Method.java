//斐波那契数列--矩阵法
public class Solution {
	public static void main(String []args) {
		//矩阵法将斐波那契数列转换成求q的n-1次方的问题。
		int[][] q = {{1, 1}, {1, 0}};
		System.out.print(fibonacci(10, q));
	}
	
	public static int fibonacci(int n, int[][] q) {
		if(n<2)return n;
		//求n次方的方法pow()有二分法递归和二进制指数拆解两种方法，这里分别实现了
		//int[][] res = powRecursion(n-1, q);
		int[][] res = powBinary(n-1, q);
		return res[0][0];
	}
	//递归实现的pow()，每次将指数二分
	public static int[][] powRecursion(int n, int[][] q) {
		if(n == 1)return q;
		//每次指数/2
		int[][] r = powRecursion(n>>1, q);
		//奇数的话要多乘一个底数，偶数则不用
		if ((n & 1) == 1){
			return multiply(multiply(r,r), q);
		}else{
			return multiply(r,r);
		}
	}
	//二进制指数拆解
	public static int[][] powBinary(int n, int[][] a) {
		//初始化矩阵
		int[][] ret = {{1, 0}, {0, 1}};
		while (n > 0) {
			if ((n & 1) == 1) {
				//二进制中1的位置需要乘入结果，其结果等于低（前）一位结果的平方
				ret = multiply(ret, a);
			}
			//右移，看二进制指数高一位是否为1
			n >>= 1;
			//无论高一位是否为1，都先算出结果，等于当前结果的平方
			a = multiply(a, a);
		}
		return ret;
	}

	//数组乘法的实现
	public static int[][] multiply(int[][] a, int[][] b) {
		int[][] c = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
			}
		}
		return c;
	}
}
