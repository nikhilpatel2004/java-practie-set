import java.util.Scanner;

public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal_num = sc.nextInt();

        int ans =0; //converted decimal number
        int ni =1; //2^0 = 1 power of 2

        while(decimal_num>0){
            int parity = decimal_num%2;
            ans += (parity *ni);
       
            ni *=10;
            decimal_num /= 2;
        }
        System.out.println(ans);

        
        
    }
    
}
