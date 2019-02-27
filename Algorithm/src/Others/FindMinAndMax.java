package Others;

public class FindMinAndMax {

    public static void main(String[] args) {
        int arr[] = {21, 4, 1, 2, 9, 6, 3, 5, 8, 11, 13};
        int smallestNumber = findMin(arr);
        int LargestNumber = findMax(arr);
        System.out.println("Smallest Number is:" + smallestNumber);
        System.out.println("Smallest Number is:" + LargestNumber);
    }

        public static int findMin(int arr[]){
            int smallestNum = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] < smallestNum) {
                    smallestNum = arr[i];
                }
            }
            return smallestNum;
        }

        public static int findMax(int arr[]) {
            int LargestNum = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > LargestNum) {
                    LargestNum = arr[i];
                }
            }
            return LargestNum;
        }
}