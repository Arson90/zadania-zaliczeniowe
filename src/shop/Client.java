package shop;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int id;
    private String name;
    private String lastname;
    private List<Phone> boughtPhones;

    public Client(int id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.boughtPhones = new ArrayList<>();
    }

    public void buyPhone(Phone phone) {
        if (this.boughtPhones.size() >= 5) {
            System.out.println("Client " + this.name + " " + this.lastname + " cannot buy more phones...");
        } else {
            this.boughtPhones.add(phone);
        }
    }
}
