import java.util.*;

public class Q2_b {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a para: ");
        String para = sc.next();

        int count = 1;
        for (int i = 0; i < para.length(); i++) {
            if (para.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Total number of char is: "+ count);

    }

}
