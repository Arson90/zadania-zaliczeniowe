package main;

import set.Set;
import shop.Client;
import shop.Phone;
import shop.Shop;
import shop.TV;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //Phone
        Phone[] phones = new Phone[5];
        phones[0] = new Phone(1, "Samsung", "G20", 1999, 24);
        phones[1] = new Phone(2, "Nokia", "3310", 150, 1);
        phones[2] = new Phone(3, "Xiaomi", "A4", 499, 13);
        phones[3] = new Phone(4, "Huawei", "P30", 2399, 48);
        phones[4] = new Phone(5, "Razor", "Phone", 1650, 20);

        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].showDetails());
        }

    //TV
        TV tv1 = new TV(1, "Samsung", "6650", 3500, 65);
        TV tv2 = new TV(2, "Philips", "7000SX", 2500, 55);
        TV tv3 = new TV(3, "Lenovo", "Z333", 1500, 60);
        TV tv4 = new TV(4, "HP", "XP0099", 4500, 57);
        TV tv5 = new TV(5, "Sony", "OPX1650", 5500, 75);

    //Client
        Client client1 = new Client(1 , "Jan" , "Kowalski");
        Client client2 = new Client(2 , "Adam" , "Nowak");

        client1.buyPhone(phones[0]);
        client1.buyPhone(phones[4]);

        client2.buyPhone(phones[0]);
        client2.buyPhone(phones[1]);
        client2.buyPhone(phones[2]);
        client2.buyPhone(phones[3]);
        client2.buyPhone(phones[4]);
        client2.buyPhone(phones[1]);

    //Shop

        Shop shop = new Shop("MediaElectronic");
        shop.addNewPhone(phones[0]);
        shop.addNewPhone(phones[2]);
        shop.addNewPhone(phones[4]);
        shop.addNewTV(tv1);
        shop.addNewTV(tv3);
        shop.addNewTV(tv5);

        Phone phone1 = shop.getPhoneById(1);

        if (phone1 != null) {
            client1.buyPhone(phone1);
        }

        Phone phone2 = shop.getPhoneById(3);

        if (phone2 != null) {
            client1.buyPhone(phone2);
        }

        Phone phone3 = shop.getPhoneById(0);

        if (phone3 != null) {
            client2.buyPhone(phone3);
        }

    //SET

        Set set = new Set();

        set.add("Tomek");
        set.add("Natalia");
        set.add("Roman");
        set.add("Tomek");
        set.add("Anna");
        set.add("Natalia");
        set.add("Anna");

        set.remove("Anna");
        System.out.println(set.toString());
    }
}
