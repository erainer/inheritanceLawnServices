package com.example.java;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int answer;
        boolean senior = false;
        //validates the users menu choice until they choose exit.
        do {
            //get users input
            System.out.println("Welcome to Emily's Lawn Service");
            System.out.println("1. Residential Customer\n2. Commercial Customer\n3. Exit");
            choice = scanner.nextInt();
            System.out.println("What is your name? ");
            String name = scanner.next();
            System.out.println("What is your phone number? xxx-xxx-xxxx");
            String phone = scanner.next();
            System.out.println("What is your address?");
            scanner.nextLine();
            String address = scanner.nextLine();
            System.out.println("How many square feet is your lawn?");
            double sqft = scanner.nextDouble();

            //determines the choice made from menu
            if(choice == 1) {
                System.out.println("What is your age?");
                answer = scanner.nextInt();
                //determines the senior discount
                if (answer >= 60) {
                    senior = true;
                }
                else if (answer < 60 && answer > 0) {
                    System.out.println("You don't qualify for any discounts.");
                    senior = false;
                }
                else{
                    System.out.println("Invalid answer");
                    System.out.println("What is your age?");
                    answer = scanner.nextInt();
                }
                //creates a residential object
                Residential res = new Residential(senior, name, phone, address, sqft);
                //calls a function from residential class
                res.calulate(senior, name, phone, address, sqft);
            }
            else if(choice == 2){
                System.out.println("What is your property name?");
                scanner.nextLine();
                String pName = scanner.next();
                System.out.println("How many properties do you have?");
                int many = scanner.nextInt();
                boolean multiple = false;
                //determines multiple properties discount
                if(many > 0)
                    multiple = true;
                //creates a commerical object
                Commercial com = new Commercial(pName, multiple, name, phone, address, sqft);
                //calls a function from the commercial class
                com.calulate(multiple, name, phone, address, sqft);
            }
        }while(choice != 3);
    }
}
