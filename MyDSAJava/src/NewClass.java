////{4,5,6,0,2,3}
//// given target key
//
//public class NewClass {
//
//    public static void main(String[] args){
//        int[] inputArray = {4,5,6,0,2,3};
//        int key = 0;
//        int pivotIndex = findPivot(inputArray, 0, inputArray.length, key);
//        System.out.println("Element at = " + pivotIndex);
//        // 2 == pivot
//        // 6,n key = 0
//        // 4
//        // 3
//
//    }
//
//    private static int findPivot(int[] arr, int startIndex, int lastIndex, int key) {
//        int mid = (startIndex + lastIndex)/2;
//        int index = -1;
//        if(mid < lastIndex && arr[mid] > arr[mid+1]){
//            index = binarySearch(arr, startIndex, mid, key);
//            return index;
//        }
//        if (mid > startIndex && arr[mid] < arr[mid-1]){
//            index = binarySearch(arr, mid-1, lastIndex, key);
//            return index;
//        }
//        if(arr[startIndex] >= arr[mid]){
//            return findPivot(arr, startIndex, mid-1, key);
//        } else {
//            return findPivot(arr, mid+1, lastIndex, key);
//        }
//    }
//
//    private static int binarySearch(int[] arr, int startIndex, int lastIndex, int key) {
//        if(lastIndex <startIndex){
//            return  -1;
//        }
//        int midIndex = (startIndex + lastIndex)/2;
//
//        if(arr[midIndex] == key){
//            return midIndex;
//        }
//        if(key > arr[midIndex]){
//            return binarySearch(arr, midIndex +1, lastIndex, key);
//        } else {
//            return binarySearch(arr, startIndex, midIndex-1, key);
//        }
//    }
//}
