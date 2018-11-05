public class Main {
    public static void main(String[] args) {
        var librarian = new BookLibrarian();
        BookSorter sorters[] = { new AuthorSort(), new YearSort(), new TitleSort() };
        
        for (var sorter : sorters) {
            librarian.setSorter(sorter);
            librarian.printList();
            System.out.println("-----------");
        }
    }
}
