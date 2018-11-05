import java.util.ArrayList;

public class AuthorSort implements BookSorter {
    @Override
    public ArrayList<BookInformation> sort(ArrayList<BookInformation> in) {
        var rv = new ArrayList<BookInformation>(in);
        rv.sort((BookInformation arg0, BookInformation arg1) -> {
            return String.CASE_INSENSITIVE_ORDER.compare(arg0.getAuthor(),
                arg1.getAuthor());
        });
        return rv;
    }
}
