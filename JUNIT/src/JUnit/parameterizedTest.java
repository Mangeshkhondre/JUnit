package JUnit;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
 
@RunWith(Parameterized.class)
public class parameterizedTest
{
	Addition obj=new Addition();
	
	private int input1;
	private int input2;
	private int answer;
	
	public parameterizedTest(int input1, int input2, int answer) 
	{
		this.input1 = input1;
		this.input2 = input2;
		this.answer = answer;
	}

	@Parameters
	public static Collection<Integer[]> testCondition()
	{
		Integer inputValues[][]= {
				{5,5,10},{10,10,20}
		};
		return Arrays.asList(inputValues);
	}
	
	@Test
	public void test1()
	{
		assertEquals(answer,obj.add(input1,input2));
		
	}
}
