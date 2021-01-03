import static org.junit.Assert.*;

import org.junit.Test;

public class SumofNumbers {
	
	public int add(int a,int b) {
		return (a+b);
	}
	@Test
	public void test1()
	{
		SumofNumbers s=new SumofNumbers();
		assertEquals(9,s.add(5, 4));
	}

}
