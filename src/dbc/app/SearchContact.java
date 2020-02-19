package dbc.app;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchContact {
    public void searchContact(ArrayList<Person> ob) {
        System.out.println("You could search for a contact from their first names:");
        Scanner sc = new Scanner(System.in);
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
            ViewContact object = new ViewContact();
            object.viewDetails(ob.get(index));

        }

    }
}
