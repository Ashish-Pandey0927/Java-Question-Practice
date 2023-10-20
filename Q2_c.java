import java.util.*;

public class Q2_c {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a para: ");
    String para = sc.nextLine();
    int arr[] = new int[256];

    for (int i = 0; i < para.length(); i++) {
        arr[(int)para.charAt(i)]++;
    }
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>0){
            System.out.println("The character "+(char)i+" is occured "+arr[i]+ "times.");
        }
    }
   } 
}
