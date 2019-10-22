package UPCNumber;

public class IsValidUPC {
    private int[] upcList;
    private int oddSum;
    private int evenSum;
    private int totalSum;
    private int count;


    public IsValidUPC(int[] upcList) {
        this.upcList = upcList;
        // Initialize odd_sum
        this.oddSum = 0;
        // Initialize even_sum
        this.evenSum = 0;
        // Initialize totalSum
        this.totalSum = 0;
        // Initialize count
        this.count = 0;
    }

    public boolean is_valid_upc() {
        // If the input is less than 2 digits long, or if all the digits have value 0,
        // the code is ​not valid
        if (upcList.length < 2) {
            return false;
        }

        for (int number : upcList) {
            if (number == 0) {
                count++;
            }
        }

        if (count == upcList.length) {
            return false;
        }

        // The number above is written from left to right,
        // but the algorithm goes right to left,
        // so we say 9 is at position 0, 8 is at position 1, etc.
        // Reverse the upc_list.
        for (int i = 0; i < upcList.length / 2; i++) {
            int temp = upcList[i];
            upcList[i] = upcList[upcList.length - i - 1];
            upcList[upcList.length - i - 1] = temp;
        }

//        // Reverse the upc_list.
//        int[] reversed_upc_list = new int[upcList.length];
//        int reversedIndex = upcList.length;
//        for (int i = 0; i < upcList.length; i++) {
//            reversed_upc_list[reversedIndex - 1] = upcList[i];
//            reversedIndex = reversedIndex - 1;
//        }
//
////        // This is a shallow copy. The change in reversed_upc_list would cause the change in upc_list.
////        upcList = reversed_upc_list;
//        // This is a deep copy. The change in reversed_upc_list would not cause the change in upc_list.
//        upcList = reversed_upc_list.clone();

        // Use a loop to find the UPC number sum result.
        for (int i = 0; i < upcList.length; i++) {
            if (i % 2 == 0) {
                evenSum += upcList[i];
            } else {
                oddSum += (upcList[i]) * 3;
            }
        }

        totalSum = evenSum + oddSum;

        return totalSum % 10 == 0;


    }
}
