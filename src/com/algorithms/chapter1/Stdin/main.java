package com.algorithms.chapter1.Stdin;

public class main {
	public static void main(String[] args) {
		System.out.println(abs(4));
		System.out.println(abs(-4));
		System.out.println(isPrime(4));
		System.out.println(isPrime(13));
	}

	// 计算一个整数的绝对值
	private static int abs(int x) {
		if (x>=0){
			return x;
		}else {
			return -x;
		}
	}

	// 判断一个数是不是素数
	private static boolean isPrime(int N) {
		if (N<2) return false;
		for (int i=2; i*i<=N; i++){
			if (N%i==0) return false;
		}
		return true;
	}

	// 计算平方根
	private static double sqrt(double c){
		if (c < 0) return Double.NaN;
		double err = 1e-15;
		double t = c;
		while (Math.abs(t-c/t) > err * t)
			t = (c/t + t) / 2.0;
		return t;
	}


}
