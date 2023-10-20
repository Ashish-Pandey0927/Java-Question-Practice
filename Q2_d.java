import java.util.*;

public class Q2_d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a para: ");
        String para = sc.nextLine();
        
        String lowerPara = para.toLowerCase();
        String UpperPara = para.toUpperCase();
        String newPara = para.trim();

        System.out.println(UpperPara);
        System.out.println(lowerPara);
        System.out.println(newPara);
        System.out.println(newPara.contains("s"));
        System.out.println(newPara.startsWith("He"));
        System.out.println(newPara.endsWith("ji"));

    }
}
