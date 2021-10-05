public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
        display(list);
    }
    public static void display(int[] ar){
        for (int a:ar
             ) {
            System.out.println(a);
        }
    }
    public static void bubbleSort(int[] ar){
        for (int i = ar.length-1; i >1; i--) {
            for (int j = 0; j < i ; j++) {
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
    }
}
