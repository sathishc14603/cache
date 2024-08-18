import java.util.Scanner;
public class Food {
    Scanner sc = new Scanner(System.in);
    Cache cache = new Cache();
    public void Starters(){
        while(true){
            System.out.println("1.Samosa"+"\n"+
            "2.Vegetable Kebabs"+"\n"+
           "3.Chicken Tikka Masala"+"\n"+
            "4.Jalfrezi"+"\n"+
            "5.Dal Makhani"+"\n"+"6.Finish");
            System.out.println("-->>press 6 Finish the order");
            int star=sc.nextInt();
            if(star==6)break;

            switch(star){
                case 1:cache.addData("Samosa");
                break;
                case 2:cache.addData("Vegetable Kebabs");
                break;
                case 3:cache.addData("Chicken Tikka Masala");
                break;
                case 4:cache.addData("Jalfrezi");
                break;
                case 5:cache.addData("Dal Makhani");
                break;
                default :System.out.println("Enter a number correctly"); break;
            }
        }
    }
    public void Maincourse(){
        while(true) {
            System.out.println("1.Chicken Briyani" + "\n" +
                    "2.Mutton Briyani" + "\n" +
                    "3.Meals" + "\n" +
                    "4.parotta" + "\n" +
                    "5.Grill"+"\n"+"6.Finish");
            // Enter a number  for your order
            System.out.println("->>>press 6 Finish the order");
            int main = sc.nextInt();

            if(main==6)break;
            switch (main) {
                case 1:cache.addData("ChickerBriyani");
                break;
                case 2:cache.addData("Mutton Briyani");
                break;
                case 3:cache.addData("Meals");
                break;
                case 4:cache.addData("parotta");
                break;
                case 5:cache.addData("grill");
                break;
                default :System.out.println("Enter a number correctly"); break;
            }
        }
    }
    public void Dessert(){
        while(true) {
            System.out.println("1.Tea" + "\n" +
                    "2.Coffee" + "\n" +
                    "3.Apple Juice" + "\n" +
                    "4.Coconut water" + "\n" +
                    "5.Smoothie"+"\n"+"6.Finish");
            System.out.println("-->>press 6 Finish the order");
            int Dess = sc.nextInt();
             if(Dess==6)break;
            switch (Dess) {
                case 1:cache.addData("Tea");
                break;
                case 2:cache.addData("Coffee");
                break;
                case 3:cache.addData("Apple juice");
                break;
                case 4:cache.addData("coconut water");
                break;
                case 5:cache.addData("Smoothie");
                break;
                default :System.out.println("Enter a number correctly"); break;
            }
        }

    }
    public void  Beverages() {
        while (true) {
            System.out.println("1.Cake" + "\n" +
                    "2.Browni" + "\n" +
                    "3.Cookies" + "\n" +
                    "4.Candies" + "\n" +
                    "5.Biscuits"+"\n"+"6.Finish");
            System.out.println("->>>press 6 Finish the order");

            int bever = sc.nextInt();
            if(bever==6)break;
            switch (bever) {
                case 1:cache.addData("Cake");
                break;
                case 2:cache.addData("Browni");
                break;
                case 3:cache.addData("Cookies");
                break;
                case 4:cache.addData("Candies");
                break;
                case 5:cache.addData("Biscuits");
                break;
                default :System.out.println("Enter a number correctly"); break;
            }

        }
    }
}




