package study;

public class Task extends Calculator{
	
	public void doTask() {
		
		protected int plus(int a) {
			int sum = this.plus(int a);
			System.out.println("plusメソッドの引数が一つの場合:" + sum);
		}
		
		protected int plus(int a, int b) {
			int sum = this.plus(int a, int b);
			System.out.println("plusメソッドの引数が二つの場合:" + sum);
		}
		
		protected int plus(int a, int b, int c) {
			int sum = this.plus(int a, int b, int c);
			System.out.println("plusメソッドの引数が三つの場合:" + sum);
		}
	}

}
