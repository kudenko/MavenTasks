import org.junit.Test;
import utils.PrintModule;

public class AppTest {

    @Test
    public void testPrintingMethodFromAppModule() {
        PrintModule.print("Test from printing method of App class");
    }

    @Test
    public void testConstantValueFromAppModule() {
        System.out.println("String from App module printing");
    }
}
