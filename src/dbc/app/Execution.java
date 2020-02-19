package dbc.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        ArrayList<Person> ob = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to _u._p._s._ Contact List App\nPress 1 to add a new contact\n" +
                "Press 2 to view all contacts\n" +
                "Press 3 to search for a contact\n" +
                "Press 4 to delete a contact\n" +
                "Press 5 to exit program ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                AddContact ob1 = new AddContact();
                ob.add(ob1.addContact());
        }
        System.out.println(ob.get(0).getContactNumbers());
    }
}
