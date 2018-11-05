import java.util.ArrayList;

public class YearSort implements BookSorter {
    @Override
    public ArrayList<BookInformation> sort(ArrayList<BookInformation> in) {
        var rv = new ArrayList<BookInformation>(in);
        rv.sort((BookInformation arg0, BookInformation arg1) -> {
            return Integer.compare(arg0.getYearPublished(), arg1.getYearPublished());
        });
        return rv;
    }
}
