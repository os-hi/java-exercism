package HelloWorld;


import java.util.Scanner;

//        An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits.
//
//        For example:
//
//        9 is an Armstrong number, because 9 = 9^1 = 9
//        10 is not an Armstrong number, because 10 != 1^2 + 0^2 = 1
//        153 is an Armstrong number, because: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
//        154 is not an Armstrong number, because: 154 != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("enter a number: ");;
        String number = reader.nextLine();

        String[]splitNumber = number.split("");
        int sum = 0;
        for(int i = 0; i<splitNumber.length;i++){
            int intNumber = Integer.parseInt(splitNumber[i]);
            sum += Math.pow(intNumber, splitNumber.length);
        }
        int parseNumber = Integer.parseInt(number);
        if(parseNumber == sum){
            System.out.println(parseNumber + " is an Armstrong");
        }else{
            System.out.println(parseNumber + " is not an Armstrong");
        }

    }

}
