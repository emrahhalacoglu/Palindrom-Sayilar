import java.util.Scanner;
public class Code {

    static void isPalindrom(int number) {
        int tempNumber = number;
        int reverseNumber = 0;
        while (tempNumber != 0) {
            int lastN = tempNumber % 10;
            reverseNumber =reverseNumber * 10 + lastN;
            tempNumber /= 10;
        }
        if (reverseNumber == number) {
            System.out.println(number + " is a palindrom number.");
            return;
        } else {
            System.out.println(number + " is not a palindrom number.");
            return;
        }
        
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a number : ");
        int number=input.nextInt();
        isPalindrom(number);
        
    }
    
}
