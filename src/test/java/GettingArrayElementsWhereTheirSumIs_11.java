public class GettingArrayElementsWhereTheirSumIs_11 {

    public static void main(String[] args) {
        int[] arr = {9, 4, 8, 2, 7};
        int target = 11;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i]);
                    System.out.println(arr[j]);
                }
            }
        }
    }
}