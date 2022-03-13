package week2.LabAssignment.com.abc.Employees;

import java.security.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;


public class Password {

    private String passw ;
    public Password(Employee emp) {
        this.setPassw(this.generatePassword());
    }

    public String generatePassword() {
        SecureRandom securePassword = new SecureRandom();
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+_)(*&^%$#@!~:";
        return IntStream.range(0, 8)
                .map(i -> securePassword.nextInt(chars.length()))
                .mapToObj(randomIndex -> String.valueOf(chars.charAt(randomIndex)))

                .collect(Collectors.joining());

    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

}
