package test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import main.JUnitHelloWorld;
import org.junit.*;

public class JUnitHelloWorldTest {

    static JUnitHelloWorld helloWorld;

    @BeforeClass
    public static void beforeClass() {
        helloWorld=new JUnitHelloWorld();
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void isGreaterTest() {
        assertTrue("Num 1 is greater than Num 2", helloWorld.isGreater(4, 3));
    }

    @Test
    public void addTest(){
        assertEquals(10 , helloWorld.add(5,5));
    }

    @Test
    public void mulTest(){
        assertEquals(50 , helloWorld.mul(5,10));
    }

    @Test
    public void advAddTest(){
        assertEquals(100 , helloWorld.addNum(10,90));
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