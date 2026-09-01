import java.util.Scanner;

class CabDriver {
    String name;
    String mobile;

    CabDriver(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    void handleRequest(String request) {
        if (request.equalsIgnoreCase("yes")) {
            System.out.println("Order Accepted");
        } else {
            System.out.println("Order Rejected");
        }
    }
}

public class CabBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CabDriver driver = new CabDriver("Anirudh", "9876543210");

        System.out.println("Cab Driver: " + driver.name + ", Mobile: " + driver.mobile);
        System.out.print("Do you want to accept the order? (yes/no): ");
        String request = sc.nextLine();

        driver.handleRequest(request);

        sc.close();
    }
}
