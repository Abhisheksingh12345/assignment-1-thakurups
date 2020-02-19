package dbc.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        ArrayList<Person> ob = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to _u._p._s._ Contact List App");
        int a = 0;
        while (a != 5) {
            System.out.println("Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            int ch = sc.nextInt();
            a = ch;
            switch (ch) {
                case 1:
                    AddContact ob1 = new AddContact();
                    ob.add(ob1.addContact());
                    break;
                case 2:
                    System.out.println("---Here are all your contacts---");
                    for (Person oj : ob) {
                        System.out.println("-------- * -------- * -------- * --------");
                        System.out.println("First Name: " + oj.getFirstName());
                        System.out.println("Last Name: " + oj.getLastName());
                        System.out.println("Contact Number(s): " + oj.getContactNumbers());
                        System.out.println("Email address: " + oj.getEmailAddress());
                        System.out.println("-------- * -------- * -------- * --------");
                    }
                case 3:
                    System.out.println("You could search for a contact from their first names:");
                    String searchName = sc.nextLine();
                    int count = 0;
                    ArrayList<Integer> ar = new ArrayList<>();
                    int i = 0;
                    for (Person oj : ob) {
                        if (oj.getFirstName().equals(searchName)) {
                            ar.add(i);
                            count++;
                        }
                        i++;
                    }
                    System.out.println(count + "match found!");
                    for (Integer index : ar) {

                    }

            }

        }
    }
}
