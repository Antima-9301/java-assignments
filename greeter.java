import java.lang.*;
import  java.util.*;


public class Greeter {
    public String greet(String name) {
        return "Hello, " + name;
    }
}
public static void main(String[]args){
Greeter greeter = new   Greeter();
String massage = greeter.greet("antima");
System.out.println(massage);
}

public class GreeterTest {

    public void testGreet() {
        Greeter greeter = new Greeter();
        String result = greeter.greet("antima");
        assertequals("Hello, antima", result);
    }
}