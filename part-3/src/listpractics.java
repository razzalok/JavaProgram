import java.util.Scanner;
import java.util.ArrayList;

public class listpractics {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> numList = new ArrayList<>();
        while (true) {
            System.out.print("Enter name : ");
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            }
            numList.add(name);
        }
        System.out.println("Value at 3rd index: " + numList.get(2));
    }
}
