import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class DisExample {
    public double sealX(double money,double price) {
        return money * price;
    }
    public double sealAndCut(double money,double price) {
        double sealPrice=100;
        return (money * price)-sealPrice;
    }

    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }

        double pr =0.0;
        double price=0.9;
        DisExample disExample= new DisExample();
        Scanner sc= new Scanner(System.in);
        System.out.println("输入价格：=");
        double money= sc.nextInt();
        pr =disExample.sealX(money,price);
        if (money>=5000){
            pr =  disExample.sealAndCut(money,price);
        }
        System.out.println("结算价格："+pr);
    }
}
