//package General;
//
//import java.util.Arrays;
//
//public class SomeRecursion {
//
//
//    public boolean someRecursive(int[] arr, OddFunction odd) {
//        if (arr.length == 0 ) {
//            return false;
//        } else if (odd.run(arr[0]) == false) {
//            return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
//        } else {
//            return true;
//        }
//    }
//}
