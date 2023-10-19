import java.util.*;
// Q->
public class Q2_a {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = sc.next();
    int vowel = 0, cons = 0;

    for (int i = 0; i < word.length(); i++) {
        if(word.charAt(i)=='a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
               vowel++;
        }
        else{
            cons++;
        }
    }
    System.out.println("The number of vowel is: " + vowel);
    System.out.println("The number of consonent is: " + cons);
   } 
}
