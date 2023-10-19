package EmailApp;

import java.util.Scanner;

public class Email {
    private String lastName;
    private String firstName;
    private String accountPurpose;
    private String password;
    private int defaultPasswordLength = 15;
    private String  otherEmail;
    private int mailboxCapacity;

    public Email (String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        System.out.println("Email created: " + this.lastName + " " + this.firstName);

        this.accountPurpose = setAccountPurpose();
        System.out.println("Account Purpose: " + this.accountPurpose);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
    }

    private String setAccountPurpose() {
        System.out.print("Enter the purpose of this email account:\n1 for Business,\n2 for Personal,\n3 for Education");
        Scanner in = new Scanner(System.in);

        int accountPurposeChoice = in.nextInt();
        if (accountPurposeChoice == 1) {
            return "Business";
        } else if (accountPurposeChoice == 2) {
            return "Personal";
        } else {
            return "Education";
        }
    }

    private String randomPassword(int length) {
        String passwordSet = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%&";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}
