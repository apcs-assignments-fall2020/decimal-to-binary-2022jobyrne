import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) {
        int binnum = Integer.parseInt(binary);
        int length = binary.length();
        int counter = 0;
        int i = 0;
        int base = 2;
        int power = 0;
        int val = 0;
        int list = 0;
        while (counter <= length) {
            i = binnum % 10; //0
            binnum /= 10;
            power = counter; //0
            if (i == 1) {
                val = (int) Math.pow(base, power);
            }
            else {
                val = 0;
            }
            counter = counter + 1;
            list = list + val;
        }
        return list;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a binary number to find the value of:");
        String binnumber = scan.next();
        System.out.println(binnumber + "'s regular value is " + binaryToDecimal(binnumber));
        //should equal 10
    }
}
