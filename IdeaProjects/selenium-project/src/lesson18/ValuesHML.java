package lesson18;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ValuesHML {

    @Test(dependsOnMethods = {"Sum2"}) //turn off test (enabled = false)
    @Parameters({"val1", "val2","val3", "val4"})
    public void Sum(int v1, int v2,int v3, int v4) {
        int finalsum = v1 + v2;
        System.out.println("Final Sum is  " + finalsum);
        int prod = v3 * v4;
        System.out.println("The Value Of Product  " + prod);
    }
    @Test(dependsOnMethods = {"Sum"})  //turn off test (enabled = false)
    @Parameters({"val1", "val2","val3", "val4"})
    public void Sum1(int v1, int v2,int v3, int v4) {
        int finalsum = v3 + v4;
        System.out.println("Final Sum is  " + finalsum);
        int prod = v1 * v2;
        System.out.println("The Value Of Product  " + prod);
    }
    @Test() //turn off test (enabled = false)
    @Parameters({"val1", "val2","val3", "val4"})
    public void Sum2(int v1, int v2,int v3, int v4) {
        int finalsum = v1 + v3;
        System.out.println("Final Sum is  " + finalsum);
        int prod = v2 * v4;
        System.out.println("The Value Of Product  " + prod);
    }

    }




