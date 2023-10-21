public class Reverse_array {
    public static void main(String args[]){
        int arr[] = {21,32,34,54,67};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // int n = arr.length;
        System.out.println();
        System.out.println("After reverse");
        for (int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i] +" ");
        }
    }
}
