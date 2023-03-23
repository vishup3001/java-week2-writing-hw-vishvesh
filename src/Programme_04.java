/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme_04 {

    //4.1 Declare two instance and two static variables.
    //instance variable
    String Name = "Prime";
    String Surname = "Testing";
    //Static variable
    static boolean a = true;
    static boolean b = false;

    //4.2 Declare one instance method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(Name);
        System.out.println(Surname);
        System.out.println(Programme_04.a);
        System.out.println(Programme_04.b);
    }


    //4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod() {
        Programme_04 programme_04 = new Programme_04();
        System.out.println(programme_04.Name);
        System.out.println(programme_04.Surname);
        System.out.println(a);
        System.out.println(b);
    }


    //4.5 Declare the main method.
    //4.6 Call both instance and static methods into the main method and run the programme.
    public static void main(String[] args) {
        Programme_04 programme_04 = new Programme_04();
        staticMethod();
        programme_04.instanceMethod();
    }
}

