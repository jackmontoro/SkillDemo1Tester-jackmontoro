import static org.junit.Assert.*;
import org.junit.*;

public class skillDemoTester{
    @Test
    public skillDemoOutputTester(){
        String corrOutput = "Hello World";
        AssertEquals("Output of skillDemoOutput should be Hello World",corrOutput,skillDemoPlanning.skillDemoOutput());
    }
    
}