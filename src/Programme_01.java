/**
 * /**
 * * Write a Java programme using the following steps.
 * * 1.1 Declare two instance variables.
 * * 1.2 Declare one instance method.
 * * 1.3 Call both instance variables into the instance method inside the print statement.
 * * 1.4 Declare the Main method.
 * * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Programme_01 {


    //1.1 Declare two instance variable.
    int a = 10;
    int b = 20;

    //1.2 Declare one instance method.
    //1.3 Call both instance variable into the instance method inside the print statement.

    public void instanceMethod() {
        System.out.println(a);
        System.out.println(b);
    }

    //1.4 Declare the main method.
    //1.5 call the above instance method into the main method and run the programme.


    public static void main(String[] args) {
        Programme_01 programme_01 = new Programme_01();
        programme_01.instanceMethod();
    }
}

