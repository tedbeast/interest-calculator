import java.util.Scanner;

public class Interest {
/**
 * Ask the user for a initial balance and an annual interest rate,
 * and print to the console the balance after 1 year
 * @param args
 */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // ask the user for initial balance and annual interest rate
        System.out.println("input balance:");
        String balanceInput = sc.nextLine();
        // convert the received string into a double
        double balance = Double.parseDouble(balanceInput);
        System.out.println("input interest rate");
        String interestInput = sc.nextLine();
        double interest = Double.parseDouble(interestInput);


        double result = calculateBalanceAfterYear(balance, interest);
        // perform the interest calculation
        // send that data back to the console
        System.out.println(result);
    }
    /**
     * add the amount received from interest to the original amount
     * @param principal the starting balance
     * @param apy the interest rate
     * @return the final balance after interest
     */
    public static double calculateBalanceAfterYear(double principal, double apy){
        return principal + calculateProfit(principal, apy);
    }
    /**
     * 
     * @param principal
     * @param apy
     * @return the profit gained from principal * apy
     */
    public static double calculateProfit(double principal, double apy){
        return principal * apy;
    }
    /*
     * whole numbers:
     * byte
     * short
     * int (!)
     * long (sometimes)
     * decimal numbers:
     * float
     * double (!)
     * characters:
     * char (sometimes)
     * true/false:
     * booleans (!)
     */
    public static boolean isEqual(int a, int b){
        boolean result;
        if(a==b){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
    public static boolean and(boolean a, boolean b){
        // && is a specific way to say 'AND'
        // a && b is true if and only if both a and b are true
        // a == b is true when a and b are the same 
        return (a && b) ;
    }
}