package dbc.app;

import java.util.regex.Pattern;

public class ValidateInput {
    public boolean phoneNumber(String phone) {
        String pattern = "^[0-9+;,*#]+$";
        boolean matches = Pattern.matches(pattern, phone);
        return matches;
    }

    public boolean email(String mail) {
        String pattern = "^[\\w\\d_][\\w\\d_.]*@[\\w\\d_.]+$";
        boolean matches = Pattern.matches(pattern, mail);
        return matches;
    }
}
