public class EbookSearchByPublisher implements EbookSearch {
    public int search(Ebook ebook1, String publisher) {
        int publisherId = Integer.parseInt(ebook1.getPublisher());
        int inputPublisherId = Integer.parseInt(publisher);
        return publisherId - inputPublisherId;
    }
}
