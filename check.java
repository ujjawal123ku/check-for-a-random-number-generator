import java.util.Scanner;
import java.util.Scanner;
public class check {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int urNumber;
        int myNumber=(int)(Math.random()*10);
         urNumber=0;
        do {
            System.out.println("guess the number ....");
             urNumber=input.nextInt();
            if (urNumber==myNumber){
                System.out.println("o u got the number");
              break;
            } else if (urNumber>myNumber) {
                System.out.println("number is greater");

            }
            else {
                System.out.println("number is small");
            }

        }while (urNumber>=0);
        System.out.println("my number was");
        System.out.println(myNumber);
    }
}
