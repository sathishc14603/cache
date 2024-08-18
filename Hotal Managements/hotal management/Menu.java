import java.util.*;
import static java.lang.System.out;
public class Menu {
    public void menu() {
        Food food = new Food();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Starters" + "\n" + "2.Maincourse" + "\n" + "3.Dessert" + "\n" + "4.Beverages"+"\n"+"5.Finish");
            System.out.println("Enter your category");
            System.out.println("--->>>press 5 finish the orders");
            int cat = sc.nextInt();
            if (cat == 5) {
                break;
            }
            switch (cat) {
                case 1:
                    food.Starters();
                    break;
                case 2:
                    food.Maincourse();
                    break;
                case 3:
                    food.Dessert();
                    break;
                case 4:
                    food.Beverages();
                    break;
                default:
                    break;
            }
        }
    }
}
