import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiffofNumbers {
	public int diff(int a,int b)
	{
		return (a-b);
	}
	@Test
	public void test2()
	{
		DiffofNumbers s=new DiffofNumbers();
		assertEquals(1,s.diff(5, 4));
	}

}
