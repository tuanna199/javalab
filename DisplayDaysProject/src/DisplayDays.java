import java.util.Scanner;

public class DisplayDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the number of days in each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (true) {
            System.out.print("Enter the month (full name, abbreviation, 3 letters, or number): ");
            String monthInput = scanner.nextLine().toLowerCase().trim();

            System.out.print("Enter the year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Check if the year is non-negative
            if (year < 0) {
                System.out.println("Please enter a non-negative year.");
                continue;
            }

            int monthIndex;
            // Determine the month index based on user input
            switch (monthInput) {
                case "january":
                case "jan":
                case "1":
                    monthIndex = 0;
                    break;
                case "february":
                case "feb":
                case "2":
                    monthIndex = 1;
                    break;
                case "march":
                case "mar":
                case "3":
                    monthIndex = 2;
                    break;
                case "april":
                case "apr":
                case "4":
                    monthIndex = 3;
                    break;
                case "may":
                case "5":
                    monthIndex = 4;
                    break;
                case "june":
                case "jun":
                case "6":
                    monthIndex = 5;
                    break;
                case "july":
                case "jul":
                case "7":
                    monthIndex = 6;
                    break;
                case "august":
                case "aug":
                case "8":
                    monthIndex = 7;
                    break;
                case "september":
                case "sep":
                case "9":
                    monthIndex = 8;
                    break;
                case "october":
                case "oct":
                case "10":
                    monthIndex = 9;
                    break;
                case "november":
                case "nov":
                case "11":
                    monthIndex = 10;
                    break;
                case "december":
                case "dec":
                case "12":
                    monthIndex = 11;
                    break;
                default:
                    System.out.println("Invalid month. Please enter a valid month.");
                    continue;
            }

            // Check if it's a leap year and update the number of days in February accordingly
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                daysInMonth[1] = 29; // Leap year, February has 29 days
            } else {
                daysInMonth[1] = 28; // Common year, February has 28 days
            }

            // Check if the month index is valid
            if (monthIndex >= 0 && monthIndex < 12) {
                System.out.println("Number of days in " + capitalizeFirstLetter(monthInput) + " " + year +
                        ": " + daysInMonth[monthIndex]);
                break;
            } else {
                System.out.println("Invalid month. Please enter a valid month.");
            }
        }

        scanner.close();
    }

    // Method to capitalize the first letter of a string
    private static String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}

