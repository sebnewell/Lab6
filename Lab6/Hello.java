import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Hello. What is your name?");
        String name = scnr.next();
        System.out.println("It's nice to meet you, " + name + ". How old are you?");

        String age = scnr.next();
        System.out.println("I see that you are still quite young at only " + age + ".");
        System.out.println("Where do you live?");

        String home = scnr.next();
        System.out.println("Wow! I've always wanted to go to " + home + ". Thanks for chatting with me. Bye!");

        System.out.println();
        
    }
}
