import java.util.Scanner;

public class reversalCall {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("What do you want reversed?: ");
    String text = sc.nextLine();
    reversal r = new reversal(text);
    
    boolean again = true;
    
    while(again == true) {
    
        System.out.println("Go again? Y/N: ");
        String ans = sc.nextLine();
    
        if(ans.charAt(0) != 'N') 
    {
            System.out.println("What do you want reversed?: ");
            String txt = sc.nextLine();
            reversal r1 = new reversal(txt);
    }
        else 
    {
        System.out.println("Thanks for using!");
        again = false;
        sc.close();
    }
}
}
}