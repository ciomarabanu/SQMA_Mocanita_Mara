import org.example.AddBinary;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class AddBinaryTest {
    @Test
    public void Test1() {
        Assert.assertEquals("100", AddBinary.addBinary("11", "1"));
    }

    @Test
    public void Test2() {
        //this should fail
        Assert.assertEquals("1101", AddBinary.addBinary("1001", "10"));
    }

    @Test
    public void Test3() {
        Assert.assertEquals("1101", AddBinary.addBinary("1001", "100"));
    }

}
