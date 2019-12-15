# JUnit

Java test works

1 We are using JUnit 
2 Need the dependencies for JUit 
		
	If maven
		
		<dependencies>
			<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.12</version>
			</dependency>
		</dependencies>
		
3 Important annotations

		@BeforeClass: It is used to write code that we want to run before all test cases.
		@Before: It will run before every test case.
		@Test: This is actual test case.
		@After: It will run after every test case.
		@AfterClass: It is used to write code that we want to run after all test cases.
	
4 Create new Java class with one method

		public class JUnitHelloWorld {

			public boolean isGreater(int num1, int num2){
			return   num1 > num2;
    }
   }
   
5 create new test class

	public class JUnitHelloWorldTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@Before
	public void before() {
		System.out.println("Before Test Case");
	}

	@Test
	public void isGreaterTest() {
		System.out.println("Test");
		JUnitHelloWorld helloWorld = new JUnitHelloWorld();
		assertTrue("Num 1 is greater than Num 2", helloWorld.isGreater(4, 3));
	}

	@After
	public void after() {
		System.out.println("After Test Case");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	}
