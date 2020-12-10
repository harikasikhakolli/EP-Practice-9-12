import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class AddTest {
	@Test
	void test() {
		Add a=new Add();
		assertEquals(0,a.prime(2));
		assertEquals(0,a.prime(9));
	}

}
