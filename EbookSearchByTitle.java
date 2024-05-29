public class EbookSearchByTitle implements EbookSearch{
    @Override
    public int search(Ebook ebook1, String title) {
        return (ebook1.getTitle()).toLowerCase().compareTo(title.toLowerCase());
    }
}