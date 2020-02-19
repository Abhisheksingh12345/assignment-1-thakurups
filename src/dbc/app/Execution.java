package dbc.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        ArrayList<Person> ob = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to _u._p._s._ Contact List App");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                AddContact ob1 = new AddContact();
                ob.add(ob1.addContact());
        }

    }
}
