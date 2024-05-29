public class EbookSortByPublisher implements EbookSort {
    @Override
    public int sort(Ebook ebook1, Ebook ebook2) {
        int publisherId1 = Integer.parseInt(ebook1.getPublisher());
        int publisherId2 = Integer.parseInt(ebook2.getPublisher());
        return publisherId1 - publisherId2;
    }
}
