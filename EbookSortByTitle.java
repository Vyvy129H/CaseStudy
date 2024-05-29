public class EbookSortByTitle implements EbookSort {
    @Override
    public int sort(Ebook ebook1, Ebook ebook2) {
        return ebook1.getTitle().compareTo(ebook2.getTitle());
    }
}
