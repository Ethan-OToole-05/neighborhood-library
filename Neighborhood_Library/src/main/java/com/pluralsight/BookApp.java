package com.pluralsight;

import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0, bookOption = 0;
        boolean continueOption = true;
        String clear = "", letterOption, continueLetterOption, userName;
        Book[] library = new Book[20];
        library[0] = new Book(1, "9780439064866", "Harry Potter and the Chamber of Secrets", false, "");
        library[1] = new Book(2, "9780439136358", "Harry Potter and the Prisoner of Azkaban", false, "");
        library[2]= new Book(3, "9780545791427", "Harry Potter and the Goblet of Fire", false, "");
        library[3] = new Book(4, "9780439358064", "Harry Potter and the Order of the Phoenix", false, "");
        library[4] = new Book(5, "9781338596700", "Harry Potter and the Sorcerer's Stone", false, "");
        library[5] = new Book(6, "9781451627282", "11/22/63", false, "");
        library[6] = new Book(7, "9781501192265", "The Green Mile", false, "");
        library[7] = new Book(8, "9781501143106", "Misery", false, "");
        library[8] = new Book(9, "9781982127794", "IT", false, "");
        library[9] = new Book(10, "9780345806789", "The Shining", false, "");
        library[10] = new Book(11, "97814516998855", "Doctor Sleep", false, "");
        library[11] = new Book(12, "9781668075760", "Pet Sematary", false, "");
        library[12] = new Book(13, "9780307947307", "The Stand", false, "");
        library[13] = new Book(14, "9780345806796", "Salem's Lot", false, "");
        library[14] = new Book(15, "9780451524935", "1984", false, "");
        library[15] = new Book(16, "9780810993136", "Diary of a Wimpy Kid", false, "");
        library[16] = new Book(17, "9780393324815", "Moneyball", false, "");
        library[17] = new Book(18, "9780553380163", "A Brief History of Time", false, "");
        library[18] = new Book(19, "9781982103538", "The Body", false, "");
        library[19] = new Book(20, "9780307743664", "Carrie", true, "Ethan");
    while(continueOption) {


        System.out.println("Welcome to the book store!");
        optionsDisplay();
        option = input.nextInt();

        clear = input.nextLine();
        switch (option) {
            case 1:
                System.out.println("Here is all of our available books:");
                for (Book book : library) {
                    if (!book.isCheckedOut()) {
                        System.out.println("ID: " + book.getId() + " ISBN: " + book.getIsbn() + " Title: " + book.getTitle());
                    } else {
                        continue;
                    }
                }
                System.out.println("Would you like to check out a book? (Y/N)");
                letterOption = input.nextLine().toUpperCase();
                if (letterOption.charAt(0) == 'Y') {
                    System.out.print("Please enter your name to check out: ");
                    userName = input.nextLine();
                    System.out.println("What book would you like to check out? (please select by ID number): ");
                    bookOption = input.nextInt();
                    clear = input.nextLine();
                    for (Book book : library) {
                        if (book.getId() == bookOption) {
                            book.checkOut(userName);
                        }
                    }
                    System.out.println("Thank you!");

                }
                break;


            case 2:
                System.out.println("Here are all the checked out books: ");
                for(Book book : library) {
                    if(book.isCheckedOut()) {
                        System.out.println("ID: " + book.getId() + " ISBN: " + book.getIsbn() + " Title: " + book.getTitle() + " Name of checked out owner: " + book.getCheckedOutTo());
                    }
                }
                System.out.print("Would you like to check in a book? (Y/N): ");
                letterOption = input.nextLine().trim().toUpperCase();
                if(letterOption.charAt(0) == 'Y'){
                    System.out.print("Please enter the ID number of the book you want to check in: ");
                    bookOption = input.nextInt();
                    clear = input.nextLine();
                    for(Book book : library) {
                        if(book.getId() == bookOption) {
                            book.checkIn();
                        }
                    }
                    System.out.println("Thank you!");
                }
                break;
            case 3:
                continueOption = false;
                break;

        }
        System.out.print("Would you like to continue? ");
        continueLetterOption = input.nextLine().trim().toUpperCase();
        if(!continueLetterOption.equals("Y")) {
            continueOption = false;
        }
    }
        }
    public static void optionsDisplay() {
        System.out.println("Please select an option below: ");
        System.out.println("1 - Show Available Books ");
        System.out.println("2 - Show Checked Out Books ");
        System.out.println("3 - Exit Store");
    }
    }

