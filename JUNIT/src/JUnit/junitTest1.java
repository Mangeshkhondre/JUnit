package JUnit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class junitTest1 
{
	Addition add1=new Addition();
/*	@BeforeClass
	public static  void beforeClassTest()
	{
		System.out.println("Before Class Testing....");
	}
	@Before
	public void beforeTest()
	{
		System.out.println("Testing .....");
	} */
	@Test
	public void test_add()
	{
		
	}	
	
	@Test
	public void test_add1()
	{		
		assertEquals("eq string",10,add1.add(5,5));	
	}
	@Test
	public void test_add2()
	{
		assertNotEquals(12,add1.add(5, 5));
		
	}
	@Test
	public void test_Eq1()
	{
		assertTrue("Tested False but expected True",add1.areEqual(5,5));
	}
	@Test
	public void test_Eq2()
	{
		assertFalse(add1.areEqual(5, 7));
	}
	@Test
	public void testnull()
	{
		//String str="mangesh"; -> FAILURE
		String str=null;
		assertNull(str);
	}
	@Test
	public void testNotNUll()
	{
		String str="Mangesh";
		//String str=null;  ->> FAILURE
		assertNotNull(str);
	}
	@Test
	public void testArraySort()
	{
		int[] numbers= {24,4,1,6};
		int[] expected= {1,4,6,24};
		Arrays.sort(numbers);
		assertArrayEquals(expected,numbers);
	}
	@Test(expected=NullPointerException.class)  // if exception does not happen -> FAILURE
	public void testNullArray()
	{
		int[] numbers= null;
		//int[] numbers= {}; uncomment this line will cause Failure, bz empty array != null
		Arrays.sort(numbers);
		
	}
	@Test(timeout=100)
	public void testTimeout()
	{
		int[] a= {1,5,2};
		for(int i=0;i<=100000;i++)
		{
			a[0]=i;
			Arrays.sort(a);			
		}
	}
	/*	@After
	public void afterTest()
	{
		System.out.println("Test complete.");
	}
	@AfterClass
	public static void afterClassTest()
	{
		System.out.println("After Class Test!!!!");
	}*/
}
