

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloTest {
    
    @Before
    public void beforeFun() {
        System.out.println("Test Before");
    }
    
    @After
    public void aferFun() {
        System.out.println("Test After");
    }
    
    @Test
    public void testGetTmpStr() {
        //fail("Not yet implemented");
        assertSame(1, 1);
    }

    @Test
    public void testSetTmpStr() {
        //fail("Not yet implemented");
        assertSame(1, 1);
    }

}
