package com.pluralsight;

import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        String clear = "";
        Book[] library = new Book[20];
        Book book1 = new Book(1, "9780439064866", "Harry Potter and the Chamber of Secrets", false, "");
        Book book2 = new Book(2, "9780439136358", "Harry Potter and the Prisoner of Azkaban", false, "");
        Book book3 = new Book(3, "9780545791427", "Harry Potter and the Goblet of Fire", false, "");
        Book book4 = new Book(4, "9780439358064", "Harry Potter and the Order of the Phoenix", false, "");
        Book book5 = new Book(5, "9781338596700", "Harry Potter and the Sorcerer's Stone", false, "");
        Book book6 = new Book(6, "9781451627282", "11/22/63", false, "");
        Book book7 = new Book(7, "9781501192265", "The Green Mile", false, "");
        Book book8 = new Book(8, "9781501143106", "Misery", false, "");
        Book book9 = new Book(9, "9781982127794", "IT", false, "");
        Book book10 = new Book(10, "9780345806789", "The Shining", false, "");
        Book book11 = new Book(11, "97814516998855", "Doctor Sleep", false, "");
        Book book12 = new Book(12, "9781668075760", "Pet Sematary", false, "");
        Book book13 = new Book(13, "9780307947307", "The Stand", false, "");
        Book book14 = new Book(14, "9780345806796", "Salem's Lot", false, "");
        Book book15 = new Book(15, "9780451524935", "1984", false, "");
        Book book16 = new Book(16, "9780810993136", "Diary of a Wimpy Kid", false, "");
        Book book17 = new Book(17, "9780393324815", "Moneyball", false, "");
        Book book18 = new Book(18, "9780553380163", "A Brief History of Time", false, "");
        Book book19= new Book(19, "9781982103538", "The Body", false, "");
        Book book20 = new Book(20, "9780307743664", "Carrie", false, "");

        System.out.println("Welcome to the book store!");
        System.out.println("Please select an option below: ");
        System.out.println("1 - Show Available Books ");
        System.out.println("2 - Show Checked Out Books ");
        System.out.println("3 - Exit Store");
        option = input.nextInt();

        clear = input.nextLine();
        switch (option) {
            case 1:
                System.out.println("Here is all of our available books:");
                for(Book book : library) {
                    System.out.println(library[book]);
                }
                //show books screen
            case 2:
                //Show Checked Out Books screen
            case 3:
                //Exit


        }

    }
}
