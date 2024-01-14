/* Write a program to know if the sum of all the digits 
of the number is even or not. The program should return true or false.*/
public class tryoutOne {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        boolean isSumEven = (sum % 2 == 0);
        System.out.println(isSumEven);
    }
}

