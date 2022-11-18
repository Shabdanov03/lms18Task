import java.util.Arrays;

public abstract class Apartment {
    private Person[] family;


    public Apartment(Person[] family) {
        this.family = family;

    }

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    public abstract int getPeopleLength();

    public static Apartment findByName(String name,Apartment [] apartments){
        for (Apartment apartment:apartments) {
            for (Person person:apartment.getFamily()) {
                if (person.getName().equals(name)){
                    return apartment;
                }
            }
        }return null;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "family=" + Arrays.toString(family) +
                '}';
    }
}
