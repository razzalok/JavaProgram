import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int age = 0;
        String name = "";
        while (true) {
            String details = reader.nextLine();
            if (details.equals("")) {
                break;
            }
            String[] splitDetails = details.split(",");
            if (Integer.parseInt(splitDetails[1]) > age) {
                age = Integer.parseInt(splitDetails[1]);
                name = splitDetails[0];
            }
        }
        System.out.println(name + " is elder among all his age is " + age);
    }
}
