/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme_03 {

    //3.1 Declare one instance and one static variable.
    String name = "Prime";
    static String surname = "Testing";


    //3.2 Declare one instance method.
    //3.4 Call both instance and static variable into both instance and static method inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Programme_03.surname);
    }


    //3.3 Declare one static method.
    //3.4 Call both instance and static variable into both instance and static methods inside the print statement.
    public static void staticMethod() {
        Programme_03 programme_03 = new Programme_03();
        System.out.println(programme_03.name);
        System.out.println(surname);
    }


    //3.5 Declare the main method.
    //3.6 Call both instance and static methods into the main method amd run the programme.
    public static void main(String[] args) {
        Programme_03 programme_03 = new Programme_03();
        programme_03.instanceMethod();
        staticMethod();
    }
}

