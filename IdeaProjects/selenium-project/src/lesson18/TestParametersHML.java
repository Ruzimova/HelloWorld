package lesson18;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersHML {
    public String username = "Abc";
    @Parameters({"username", "password"})
    @Test
    public void testUsingParams(String username, String password){

        System.out.println("Test With Parameters: " + username + "/" + password);
    }
}
