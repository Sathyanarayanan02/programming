import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int num =sc.nextInt();
        int reverse = 0;
        int temp = num;
        while (temp>0){
            int rem = temp % 10;
            reverse = (reverse * 10) + rem;
            temp = temp / 10;
        }
        if(num==reverse){
            System.out.println("PalindromeNum");
        }
    else{
            System.out.println("Not a palindrome");
        }
   }
}
