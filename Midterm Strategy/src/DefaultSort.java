import java.util.ArrayList;

public class DefaultSort implements BookSorter {

    @Override
    public ArrayList<BookInformation> sort(ArrayList<BookInformation> in) {
        return in;
    }

}
