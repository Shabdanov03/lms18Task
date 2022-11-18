public class Flat extends Apartment implements ComService {

    public Flat(Person[] family) {
        super(family);
    }

    @Override
    public int getPeopleLength() {
        return getFamily().length;
    }


    @Override
    public String getComService() {
        return " Flatte жашагандар com service толошот ";
    }


}
