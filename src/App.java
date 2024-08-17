
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String firstName = "Jose";
        String lastName = "Rodriguez";
        System.out.println(firstName + lastName);

        // One value to multiple variables
        int x, y, z;
        x = y = z= 50;
        System.out.println(x + y + z);

        Person person = new Person("Jose", "Rodriguez", 41);
        System.out.printf("My name is %s!", person.firstName);
    }
}
