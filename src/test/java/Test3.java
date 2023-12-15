import org.example.AddBinary;
import org.junit.Assert;
import org.junit.Test;

public class Test3 {
    @Test
    public void Test3() {
        Assert.assertEquals("1101", AddBinary.addBinary("1001", "100"));
    }
}
