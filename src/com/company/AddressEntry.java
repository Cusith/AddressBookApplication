package com.company;
import java.util.*;
public class AddressEntry {
    static Scanner scanner = new Scanner(System.in);

    public String prompt_FirstName() {
        String FirstName = scanner.nextLine();
        return FirstName;
    }
    public String prompt_LastName() {
        String LastName = scanner.nextLine();
        return LastName;
    }
    public String prompt_Street() {
        String Street = scanner.nextLine();
        return Street;
    }
    public String prompt_City() {
        String City = scanner.nextLine();
        return City;
    }
    public String prompt_State() {
        String State = scanner.nextLine();
        return State;
    }
    public String prompt_Zip() {
        String Zip = scanner.nextLine();
        return Zip;
    }
    public String prompt_Telephone() {
        String Telephone = scanner.nextLine();
        return Telephone;
    }
    public String prompt_Email() {
        String Email = scanner.nextLine();
        return Email;
    }
}
