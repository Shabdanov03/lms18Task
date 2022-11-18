import java.util.Arrays;

public class Hostel  extends Apartment implements Rent{

    public Hostel(Person[] family) {
        super(family);
    }

    @Override
    public int getPeopleLength() {
        return getFamily().length;
    }

    @Override
    public String getRent() {
        return " Hostelde жашагандар rent толошот ";
    }


}
