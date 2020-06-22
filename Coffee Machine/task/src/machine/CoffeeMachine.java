package machine;
import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int coffeeBeans = 120;
        int dispCaps = 9;
        int money = 550;
        boolean exit = false;

        while (exit == false) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String answer = scan.next();

            if (answer.equals("buy")) {
                System.out.println();
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String typeOfCoffee = scan.next();

                if(typeOfCoffee.equals("1")){
                    if (water < 250 || coffeeBeans < 16 || dispCaps < 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        System.out.println();
                        continue;
                    }
                    water -= 250;
                    coffeeBeans -= 16;
                    dispCaps -= 1;
                    money += 4;
                } else if (typeOfCoffee.equals("2")) {
                    if (water < 350 || milk < 75 || coffeeBeans < 20 || dispCaps < 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        System.out.println();
                        continue;
                    }
                    water -= 350;
                    milk -= 75;
                    coffeeBeans -= 20;
                    dispCaps -= 1;
                    money += 7;
                } else if (typeOfCoffee.equals("3")) {
                    if (water < 200 || milk < 100 || coffeeBeans < 12 || dispCaps < 1) {
                        System.out.println("I have enough resources, making you a coffee!");
                        System.out.println();
                        continue;
                    }
                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    dispCaps -= 1;
                    money += 6;
                } else if (typeOfCoffee.equals("back")) {
                    System.out.println();
                    continue;
                }
            } else if (answer.equals("fill")) {
                System.out.println();

                System.out.println("Write how many ml of water do you want to add:");
                int fillWater = scan.nextInt();
                water += fillWater;

                System.out.println("Write how many ml of milk do you want to add:");
                int fillMilk = scan.nextInt();
                milk += fillMilk;

                System.out.println("Write how many grams of coffee beans do you want to add:");
                int fillCoffeeBeans = scan.nextInt();
                coffeeBeans += fillCoffeeBeans;

                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int fillDispCaps = scan.nextInt();
                dispCaps += fillDispCaps;
                System.out.println();

            } else if (answer.equals("take")) {
                System.out.println();
                System.out.println("I gave you $" + money);
                money -= money;
                System.out.println();
            } else if (answer.equals("remaining")) {
                System.out.println();
                System.out.println("The coffee machine has:");
                System.out.println(water + " of water");
                System.out.println(milk + " of milk");
                System.out.println(coffeeBeans + " of coffee beans");
                System.out.println(dispCaps + " of disposable cups");
                System.out.println(money + " of money");
                System.out.println();
            } else if (answer.equals("exit")) {
                exit = true;
            }
        }


    }
}
