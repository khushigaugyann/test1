public class reverse {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5 };
        int j = arr.length - 1;
        for (int i = 0; i <= j; i++) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i] + " ");
    }

}
