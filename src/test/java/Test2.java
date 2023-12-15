import org.example.AddBinary;
import org.junit.Assert;
import org.junit.Test;

public class Test2 {
    @Test
    public void Test2() {
        //this should fail
        Assert.assertEquals("1101", AddBinary.addBinary("1001", "10"));
    }
}
