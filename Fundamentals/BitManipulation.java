/*
Operations:
1. Get BitManipulation
2. Set Bit(converting to 1)
3. Clear Bit
4. Update Bit

*/

package Fundamentals;

public class BitManipulation {
    public static void main(String[] args) {

        // Q: get the 3rd bit(position:2nd) of number 0101
        int n = 5;

        // step 1 : Create a Bit Mask
        // step 2 : AND Operation of bit mask with Original number
        // step 3 :If Result = >= 0 then original number was 0 else 1

        int bitMask = 1 << 3;
        int result = bitMask & n;
        if (result != 0) {
            System.out.println("bit was 1");
        } else {
            System.out.println("bit was 0");

        }
        // Q: set the 2nd bit(position:1st) of number 0101
        int n1 = 5;

        // step 1 : Create a Bit Mask
        // step 2 : OR Operation of Bit Mask with Original number
        // step 3 :Print result

        int bitMask1 = 1 << 1;
        int result1 = bitMask1 | n1;
        System.out.println(result1);

        // Q: Clear the 3rd bit(position:2) of number 0101
        int n2 = 5;

        // step 1 : Create a Bit Mask
        // step 2 : AND Operation of NOT Bitmask with  Original number
        // step 3 :Print result

        int bitMask2 = 1 << 2;
        int result2 = (~bitMask2) & n2;
        System.out.println(result2);

    }
}
