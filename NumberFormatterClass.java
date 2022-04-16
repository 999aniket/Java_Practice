import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        
        
        System.out.println("US: " + numberFormat.format(payment));
        System.out.println("India: " + numberFormat4.format(payment));
        System.out.println("China: " + numberFormat2.format(payment));
        
        System.out.println("France: " + numberFormat3.format(payment));
    }
}
