public class Ebook extends Book{
    private String size ;
    private String format;

    public Ebook(){}

    public Ebook(String size, String format){
        this.size = size;
        this.format = format;
    }
    public Ebook(String idBook, String title, String author,String publisher,String genre, String size, String format){
        super(idBook, title, author, publisher, genre);
        this.size = size;
        this.format = format;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    public void setEbook(String idBook , String title, String author, String publisher, String genre, String size, String format){
        setIdBook(idBook);
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setGenre(genre);
        setSize(size);
        setFormat(format);
    }
    public String toString(){
        return "Book [idBook = "+ getIdBook() + ", title " + getTitle() + ", author " + getAuthor() + ", publisher " + getPublisher() + ", genre " + getGenre() + ", size" + getSize() + ",format" + getFormat();

    }
}
