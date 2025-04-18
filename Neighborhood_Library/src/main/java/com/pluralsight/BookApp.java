package com.pluralsight;

import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        String clear = "";
        Book[] library = new Book[20];
        Book book1 = new Book(2313, "Book", "Boook", false, "Me");
        System.out.println("Welcome to the book store!");
        System.out.println("Please select an option below: ");
        System.out.println("1 - Show Available Books ");
        System.out.println("2 - Show Checked Out Books ");
        System.out.println("3 - Exit Store");
        option = input.nextInt();

        clear = input.nextLine();
        switch (option) {
            case 1:
                //show books screen
            case 2:
                //Show Checked Out Books screen
            case 3:
                //Exit


        }

    }
}
