public class Second_largest {
    public static void main(String args[]){
        int arr[] = {4,3,2,1,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        // System.out.println();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                  int temp =arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                }
            }
        }
        System.out.println();
         
        System.out.println("After Shorting");
        for(int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Second largest Number of this array is: "+arr[arr.length-2]);
    }
}
