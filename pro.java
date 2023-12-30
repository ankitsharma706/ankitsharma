import java.util.Scanner;

class pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of times : ");
        int n = sc.nextInt();
        System.out.print("enter the messages : ");
        String text = sc.next();
        for (int i = 1; i <= n; i++) {
            System.out.println(getOrdinalIndicator(i) + " " + text);
        }
    }

    // Method to get the ordinal indicator for a given number
    private static String getOrdinalIndicator(int number) {
        if (number % 100 >= 11 && number % 100 <= 13) {
            return number + "th";
        } else {
            switch (number % 10) {
                case 1:
                    return number + "st";
                case 2:
                    return number + "nd";
                case 3:
                    return number + "rd";
                default:
                    return number + "th";
            }
        }
    }
}
