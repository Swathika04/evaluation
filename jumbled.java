import java.util.Scanner;

public class Jumbled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int num = scanner.nextInt();

        if (isJumbled(num)) {
            System.out.println(num + " is a jumbled number.");
        } else {
            System.out.println(num + " is not a jumbled number.");
        }

        scanner.close();
    }

    private static boolean isJumbled(int num) {
        String strNum = String.valueOf(num);

        for (int i = 0; i < strNum.length() - 1; i++) {
            int dig1 = Character.getNumericValue(strNum.charAt(i));
            int dig2 = Character.getNumericValue(strNum.charAt(i + 1));

            
            if (Math.abs(dig1 - dig2) > 1) {
                return false;
            }
        }

        return true;
    }
}
