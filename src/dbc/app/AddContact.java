package dbc.app;

public class AddContact {
    Person ob = new Person();
    ValidateInput ob1 = new ValidateInput();

    public void addFirstName(String fn) {
        ob.setFirstName(fn);
    }

    public void addLastName(String ln) {
        ob.setLastName(ln);
    }

    public boolean addNumber(String number) {
        if (ob1.phoneNumber(number)) {
            ob.setContactNumbers(number);
            return true;
        }
        return false;
    }

    public boolean addEmail(String mail) {
        if (ob1.email(mail)) {
            ob.setEmailAddress(mail);
            return true;
        }
        return false;
    }
}
