package UPCNumber;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        int[] upc_list = new int[] {0, 7, 3, 8, 5, 4, 0, 0, 8, 0, 8, 9};
        // User would enter the pure digit upc number.
        System.out.println("Enter upc number ");
        Scanner scanner = new Scanner(System.in);
        String upc_number = scanner.nextLine();
//        // Count the digits in integer. This would be the size of array.
//        int countDigit = String.valueOf(upc_number).length();
        int countDigit = upc_number.length();
        // String to array of integer.
        int[] upc_list = new int[countDigit];
        for (int i = 0; i < upc_list.length; i++) {
            // Add integer to int array
            upc_list[i] = Integer.parseInt(String.valueOf(upc_number.charAt(i)));
        }


        IsValidUPC isValidUPC = new IsValidUPC(upc_list);
        boolean test_input = isValidUPC.is_valid_upc();
        System.out.println(test_input);


    }
}
