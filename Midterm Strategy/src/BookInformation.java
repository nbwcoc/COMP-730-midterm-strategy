public class BookInformation {
    private String author;
    private String title;
    private int yearPublished;
    private String summary;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getSummary() {
        return summary;
    }
    
    public BookInformation(String author, int yearPublished, String title,
        String summary) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
        this.summary = summary;
    }
    
    @Override
    public String toString() {
        return String.format("%s, by %s. Published %d\n\t%s", title, author, yearPublished, summary);
    }
}
