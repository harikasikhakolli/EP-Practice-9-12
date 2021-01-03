import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class validation {
	public static void main(String args[])
	{
		Result res=JUnitCore.runClasses(SumofNumbers.class);
		for(Failure failure:res.getFailures())
		{
			System.out.println(failure.toString());
		}
		System.out.println("Result:"+res.wasSuccessful());
		
	}

}
