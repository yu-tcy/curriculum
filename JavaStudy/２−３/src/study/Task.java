package study;

public class Task extends Calculator{
	
	public void doTask() {
		
		System.out.println("Plusメソッドの引数が一つの場合:"+super.plus(10) );

    	System.out.println("Plusメソッドの引数が二つの場合:"+super.plus(10,20));

    	System.out.println("Plusメソッドの引数が三つの場合:"+super.plus(10,20,30));

	}

}
