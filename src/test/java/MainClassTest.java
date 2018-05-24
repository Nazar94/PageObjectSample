import org.junit.*;
@Ignore
public class MainClassTest {
/*
    //before all methods
    @BeforeClass
    public void beforeClassMethod(){

    }

    //before every test method
    @Before
    public void setUp(){

    }
*/
    @Test
    public void method(){
        Assert.assertTrue("Value are not equals",1+1==2);
      //  Assert.assertFalse(1+1==10);
    }

    @Test
    @Ignore //ignores this test method
    public void method2(){
   //     Assert.assertNull();
   //     Assert.assertNotNull();
    }

    @Test
    public void method3(){
        Assert.assertEquals(10, 5+5);
      //  Assert.assertNotEquals(10, 2+2);
    }

    @Test
    public void method4(){
        Assert.assertEquals("Value are not equals",10, 2+5);
        //  Assert.assertNotEquals(10, 2+2);
    }

    @Test
    public void method5(){
        Assert.assertFalse("Value are not equals",7==2+5);
        //  Assert.assertNotEquals(10, 2+2);
    }
/*
    //after every test method
    @After
    public void tearDown(){

    }

    //after all methods
    @AfterClass
    public void afterClassMethod(){

    }
*/
}
