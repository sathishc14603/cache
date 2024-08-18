import java.util.*;
import java.lang.Thread;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu order = new Menu();
        while(true){
            System.out.println("1.breakfast"+"\n"+"2.lunch"+"\n"+"3.dinner"+"\n"+"4.snacks"+"\n"+"5.Finish the order");
            int n=sc.nextInt();
            if(n<=4){
                order.menu();
            }
            else if(n==5)break;
            else{
                System.out.println("Enter a  num correctly");
            }
        }
        System.out.println("Thank you");
    }
}
