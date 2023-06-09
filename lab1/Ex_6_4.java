import java.util.Scanner;

public class Ex_6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month: ");
        String monthInput = scanner.nextLine();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        scanner.close();

        int month = -1;
        try {
            month = Integer.parseInt(monthInput);
        } catch (NumberFormatException e) {
            String[] months = {"january", "february", "march", "april", "may", "june", "july",
                    "august", "september", "october", "november", "december"};
            monthInput = monthInput.toLowerCase();
            for (int i = 0; i < months.length; i++) {
                if (months[i].startsWith(monthInput)) {
                    month = i + 1;
                    break;
                }
            }
        }

        int numDays;
        if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                numDays = 29;
            } else {
                numDays = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            numDays = 30;
        } else {
            numDays = 31;
        }
        System.out.println("There are " + numDays + " days in " + monthInput + " " + year + ".");

    }
}
