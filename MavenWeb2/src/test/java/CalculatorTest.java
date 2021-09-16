import static org.junit.Assert.*;

import org.junit.Test;

import com.jenkins.Calculator;

public class CalculatorTest {

	@Test
	public void test1() {
		assertEquals(10,new Calculator().getSum(5, 5));
	}
	
	public void test2(){
		assertEquals(5,new Calculator().getSum(5, 0));
	}
	
	public void test3() {
		assertEquals(10,new Calculator().getDiff(50, 40));
	}
	
	public void test4() {
		assertEquals(0,new Calculator().getDiff(5, 5));
	}
	
	
	
	

}
