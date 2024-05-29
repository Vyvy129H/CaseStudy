class Book {
        private String idBook;
        private String title;
        private String author;
        private String publisher;
        private String genre;
    public Book(String idBook, String title, String author, String publisher, String genre) {
        this.idBook = idBook;
        this.title = title;
        this.author = author;
        this.publisher = publisher ;
        this.genre = genre ;
    }

        public Book() {

        }

        public String toString(){
        return "Book [idBook = "+ idBook + ", title " + title + ", author " + author + ", publisher " + publisher + ", genre " + genre + "]";
    }

        public String getIdBook() { return idBook; }
        public void setIdBook(String idBook) { this.idBook = idBook; }
        public String getTitle(){ return title; }
        public void setTitle(String title) { this.title = title; }
        public String getAuthor() { return author; }
        public void setAuthor(String author) { this.author = author; }
        public String getPublisher() { return publisher; }
        public void setPublisher(String publisher) { this.publisher = publisher; }
        public String getGenre() { return genre; }
        public void setGenre(String genre) { this.genre = genre;}
    }




