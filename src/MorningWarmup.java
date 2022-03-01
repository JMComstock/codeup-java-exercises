import java.util.Arrays;

public class MorningWarmup {

    // TODO: Write a program that creates an array, and then prints the sum of the even and odd integers in a new array [sumOdd, sumEven]
    //example: [2,4,8,5,1,2];
    //output; [6,16]
    //reason: 2+4+8+2 = 16
    //5+1 = 6 (edited)


//    public static int sumOdd() {
//        int oddSum = 0;
//        for(int num : nums) {
//            if (num % 2 != 0) {
//               oddSum += num;
//            }
//        }
//        return oddSum;
//    }
//
//    public static int sumEven() {
//        int evenSum = 0;
//        for(int num : nums) {
//            if (num % 2 == 0) {
//                evenSum += num;
//            }
//        }
//        return evenSum;
//    }

    public static int[] warmupMethod (int[] ogArr) {
        int[] oddEven = new int[2];
        int odd = 0;
        int even = 0;

        for(int num : ogArr) {
            if(num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
        }
        oddEven[0] = odd;
        oddEven[1] = even;
        System.out.println("should be: 6, 12");
        System.out.println(Arrays.toString(oddEven));
        return oddEven;
    }


    public static void main(String[] args) {


//        int[] sumArr = new int[1];
//
//        System.out.println("sumOdd() = " + sumOdd());
//        System.out.println("sumEven() = " + sumEven());
//
//        nums = append(nums, sumOdd());

        int[] warmup = {2,4,8,5,1,2};
        int [] solution = warmupMethod(warmup);
        System.out.println(Arrays.toString(solution));

//        int[] oddEven = new int[2];
//        int odd = 0;
//        int even = 0;
//
//        for(int num : warmup) {
//            if(num % 2 == 0) {
//                even += num;
//            } else {
//                odd += num;
//            }
//        }
//        oddEven[0] = odd;
//        oddEven[1] = even;
//        System.out.println("should be: 6, 12");
//        System.out.println(Arrays.toString(oddEven));


    }
}
