import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flat flat = new Flat(new Person[]{
                new Person("Ilim", 19),
                new Person("Nurik", 18),
                new Person("Sanjar", 20),
                new Person("Dastan", 19)});

        Hotel hotel = new Hotel(new Person[]{
                new Person("Zhenis", 18),
                new Person("Kairat", 20),
                new Person("Yntymak", 20)});

        Hostel hostel = new Hostel(new Person[]{
                new Person("Mukhammed", 25),
                new Person("Rahim", 20)});

        Apartment[] apartments = {flat, hotel, hostel};

        for (Apartment apartment : apartments) {
            if (apartment instanceof Flat) {
                System.out.println(apartment);
                System.out.println(" People length : " + apartment.getPeopleLength());
            }
        }
        System.out.println(flat.getComService());
        System.out.println();

        for (Apartment apartment1 : apartments) {
            if (apartment1 instanceof Hotel) {
                System.out.println(apartment1);
                System.out.println(" People length : " + apartment1.getPeopleLength());
            }
        }
        System.out.println(hotel.getRent());
        System.out.println();

        for (Apartment apartment2 : apartments) {
            if (apartment2 instanceof Hostel) {
                System.out.println(apartment2);
                System.out.println(" People length : " + apartment2.getPeopleLength());
            }
        }
        System.out.println(hostel.getRent());
        System.out.println();


        System.out.println(" Enter name : ");
        String name = new Scanner(System.in).nextLine();
        System.out.println(Apartment.findByName(name, apartments));
    }

}

