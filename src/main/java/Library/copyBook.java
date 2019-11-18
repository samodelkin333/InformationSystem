package Library;

public class copyBook {
    private Book book;
    private int number;
    private boolean output;
    private  static final boolean standartOutput = false;

    public copyBook(int number,Book book){
        this(number,book,standartOutput);
    }

    public copyBook(int number,Book book, boolean output ){
        this.book = book;
        this.number = number;
        this.output = output;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isOutput() {
        return output;
    }

    public void setOutput(boolean output) {
        this.output = output;
    }

    public static boolean isStandartOutput() {
        return standartOutput;
    }
}
