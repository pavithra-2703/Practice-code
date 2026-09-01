import java.util.Scanner;

public class MaxNonOverlapping {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] price={10,20,30,40,50};
        int money=100;
        int chocolateprice = 50;
        int noOfChoco = money/chocolateprice;
        System.out.println("chocolate price: " + noOfChoco);
        int moneySpent=noOfChoco * chocolateprice;
        System.out.println("money spent: "+ moneySpent);
        int moneyLeft=money - moneySpent;
        System.out.println("money left: " + moneyLeft);
    }
}
