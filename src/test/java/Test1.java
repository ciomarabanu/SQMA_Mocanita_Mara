import org.example.AddBinary;
import org.junit.Assert;
import org.junit.Test;

public class Test1 {
    @Test
    public void Test1() {
        Assert.assertEquals("100", AddBinary.addBinary("11", "1"));
    }
}
