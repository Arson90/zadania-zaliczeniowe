package shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private List<Phone> phones;
    private List<TV> tvs;

    public Shop(String name) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.tvs = new ArrayList<>();
    }

    public void addNewPhone(Phone phone) {
        this.phones.add(phone);
    }

    public void addNewTV(TV tv) {
        this.tvs.add(tv);
    }

    public Phone getPhoneById(int phoneId) {

        for(Phone p : this.phones) {
            if (p.getId() == phoneId){
                return p;
            }
        }
        System.out.println("There is no such phone...");
        return null;
    }
}
