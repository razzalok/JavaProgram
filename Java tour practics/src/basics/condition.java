import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        System.out.println("LogIn to your Account");
        String userName = "alok";
        String password = "#45rajALOK";
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter username: ");
        String enterUserName = reader.nextLine();
        System.out.print("Enter Password: ");
        String enterPassword = reader.nextLine();

        if (userName.equals(enterUserName) && password.equals(enterPassword)) {
            System.out.println("Great! You are logged in " + userName);
        } else if (userName.endsWith(enterUserName) &&
                (!password.equals(enterPassword))) {
            System.out.println("Wrong Password");
        } else if ((!userName.equals(enterUserName)) &&
                password.equals(enterPassword)) {
            System.out.println("User not found --Register Here--");
        } else {
            System.out.println("Account not found --Register Here--");
        }
    }
    // public static void main(String[] args) {
    // Scanner reader = new Scanner(System.in);
    // int num = 0;
    // while (true) {
    // System.out.println("Give a number: ");
    // num = reader.nextInt();
    // if (num == 4) {
    // break;
    // }
    // }
    // }
}