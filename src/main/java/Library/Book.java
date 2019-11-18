package Library;

public class Book {
    private String[] authors;
    private String title;
    private int year, countPages;

    public Book(String author, String title, int year, int countPages){
        this(new String[]{author},title,year,countPages);
    }

    public Book(String[] authors, String title, int year, int countPages){
        String[] copyAuthors = new String[authors.length];
        System.arraycopy(authors,0,copyAuthors,0,authors.length);
        this.authors = copyAuthors;
        this.title = title;
        this.year = year;
        this.countPages = countPages;
    }

    public String[] getAuthor() {
        return authors;
    }

    public void setAuthor(String[] authors) {
        String[] copyAuthors = new String[authors.length];
        System.arraycopy(copyAuthors,0,authors,0,authors.length);
        this.authors = copyAuthors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }
}
