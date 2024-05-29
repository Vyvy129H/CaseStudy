public class EbookSearchByAuthor implements EbookSearch{
    public int search(Ebook ebook1, String author) {
        return (ebook1.getAuthor()).toLowerCase().compareTo(author.toLowerCase());
    }
}