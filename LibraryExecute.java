import java.util.Scanner;
public class LibraryExecute {

        Library admin = new Library();
        Scanner sc = new Scanner(System.in);

        public int menu() {
            System.out.println("---------------------------------------");
            System.out.println("1. Add new ebook to library.");
            System.out.println("2. Delete ebook from library.");
            System.out.println("3. Update ebook information.");
            System.out.println("4. Search ebook.");
            System.out.println("5. Sort ebook.");
            System.out.println("6. Show all ebook in library.");
            System.out.println("7. Exit.");
            return new Scanner(System.in).nextInt();
        }


        public void add() {
            System.out.print("Book ID: ");
            String eBookId = new Scanner(System.in).nextLine();
            while (admin.isExist(eBookId)) {
                System.out.println("This id have been existed.");
                eBookId = new Scanner(System.in).nextLine();
            }
            System.out.print("Title: ");
            String title = new Scanner(System.in).nextLine();
            System.out.print("Author: ");
            String author = new Scanner(System.in).nextLine();
            System.out.print("Release year: ");
            String releaseYear = new Scanner(System.in).nextLine();
            System.out.print("Genre: ");
            String genre = new Scanner(System.in).nextLine();
            System.out.print("Size: ");
            String size = new Scanner(System.in).nextLine();
            System.out.print("Format: ");
            String format = new Scanner(System.in).next();
            admin.add(new Ebook(eBookId, title, author, releaseYear, genre, size, format));
        }
    public void remove() {
        if (isEmpty()) return;
        System.out.print("Enter book id to delete: ");
        admin.remove(new Scanner(System.in).next());
    }

        public boolean isEmpty() {
            if (admin.getBookAmount() == 0) {
                System.out.println("The library is empty.");
                return true;
            }
            return false;
        }

        public String enterId() {
            System.out.print("Enter ebook id you want to update information: ");
            return sc.nextLine();
        }

        public int updateMenu() {
            System.out.println("What information do you want to update?");
            System.out.print("1. IdBook  ");
            System.out.print("2. Title  ");
            System.out.print("3. Author  ");
            System.out.println("4. Publisher.");
            System.out.print("5. Genre  ");
            System.out.print("6. Size  ");
            System.out.print("7. Format  ");
            System.out.println("8. All.");
            System.out.println("9. Cancel.");
            return new Scanner(System.in).nextInt();
        }

        public void setId(String id) {
            System.out.println("Enter new id: ");
            admin.getEbook(id).setIdBook(new Scanner(System.in).nextLine());
        }

        public void setAuthor(String id) {
            System.out.println("Enter new id: ");
            admin.getEbook(id).setAuthor(new Scanner(System.in).nextLine());
        }

        public void setTitle(String id) {
            System.out.println("Enter new id: ");
            admin.getEbook(id).setTitle(new Scanner(System.in).nextLine());
        }

        public void setReleaseYear(String id) {
            System.out.println("Enter new id: ");
            admin.getEbook(id).setPublisher(new Scanner(System.in).nextLine());
        }

        public void setGenre(String id) {
            System.out.println("Enter new id: ");
            admin.getEbook(id).setGenre(new Scanner(System.in).nextLine());
        }

        public void setSize(String id) {
            System.out.println("Enter new id: ");
            admin.getEbook(id).setSize(new Scanner(System.in).nextLine());
        }

        public void setFormat(String id) {
            System.out.println("Enter new id: ");
            admin.getEbook(id).setFormat(new Scanner(System.in).nextLine());
        }

        public void setAll(String id) {
            System.out.println("Enter new id: ");
            String updateNewId = new Scanner(System.in).nextLine();
            System.out.println("Enter new title: ");
            String updateNewTitle = new Scanner(System.in).nextLine();
            System.out.println("Enter new author: ");
            String updateNewAuthor = new Scanner(System.in).nextLine();
            System.out.println("Enter new publisher: ");
            String updateNewReleaseYear = new Scanner(System.in).next();
            System.out.println("Enter new genre: ");
            String updateNewGenre = new Scanner(System.in).nextLine();
            System.out.println("Enter new size: ");
            String updateNewSize = new Scanner(System.in).nextLine();
            System.out.println("Enter new format: ");
            String updateNewFormat = new Scanner(System.in).next();
            admin.getEbook(id).setEbook(updateNewId, updateNewTitle, updateNewAuthor, updateNewReleaseYear, updateNewGenre, updateNewSize, updateNewFormat);
        }

        public int searchMenu() {
            System.out.println("You want to find ebook by what?");
            System.out.println("1. Title.");
            System.out.println("2. Author.");
            System.out.println("3. Publisher.");
            System.out.println("4. Cancel.");
            return new Scanner(System.in).nextInt();
        }

        public void searchByTitle() {
            System.out.print("Enter title: ");
            for (Ebook e : admin.searchEbooks(new EbookSearchByTitle(), new Scanner(System.in).nextLine())) {
                System.out.println(e);
            }
        }

        public void searchByAuthor() {
            System.out.print("Enter author: ");
            for (Ebook e : admin.searchEbooks(new EbookSearchByAuthor(), new Scanner(System.in).nextLine())) {
                System.out.println(e);
            }
        }

        public void searchByReleaseYear() {
            System.out.print("Enter Publisher: ");
            for (Ebook e : admin.searchEbooks(new EbookSearchByPublisher(), new Scanner(System.in).nextLine())) {
                System.out.println(e);
            }
        }

        public int sortMenu() {
            System.out.println("You want to sort ebook by what?");
            System.out.println("1. Title.");
            System.out.println("2. Author.");
            System.out.println("3. Publisher.");
            System.out.println("4. Cancel.");
            return new Scanner(System.in).nextInt();
        }

        public void display() {
            if (isEmpty()) return;
            for (int i = 0; i < admin.getBookAmount(); i++) {
                System.out.println((admin.display())[i]);
            }
        }

        public void update() {
            if (isEmpty()) return;
            String id = enterId();
            if (admin.getEbook(id) != null) {
                int choiceUpdate = updateMenu();
                switch (choiceUpdate) {
                    case 1:
                        setId(id);
                        break;
                    case 2:
                        setTitle(id);
                        break;
                    case 3:
                        setAuthor(id);
                        break;
                    case 4:
                        setReleaseYear(id);
                        break;
                    case 5:
                        setGenre(id);
                        break;
                    case 6:
                        setSize(id);
                        break;
                    case 7:
                        setFormat(id);
                        break;
                    case 8:
                        setAll(id);
                        break;
                    case 9:
                        break;
                }
            } else {
                System.out.println("Your ebook id didn't match any id.");
            }
        }

        public void search() {
            if (isEmpty()) return;
            int choiceSearch = searchMenu();
            switch (choiceSearch) {
                case 1:
                    searchByTitle();
                    break;
                case 2:
                    searchByAuthor();
                    break;
                case 3:
                    searchByReleaseYear();
                    break;
                case 4:
                    break;
            }
        }

        public void sort() {
            if (isEmpty()) return;
            int choiceSort = sortMenu();
            switch (choiceSort) {
                case 1:
                    admin.sort(new EbookSortByTitle());
                    break;
                case 2:
                    admin.sort(new EbookSortByAuthor());
                    break;
                case 3:
                    admin.sort(new EbookSortByPublisher());
                    break;
                case 4:
                    break;
            }
        }
    }
