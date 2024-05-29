
public class Main {
    public static void main(String[] args) {
        LibraryExecute adminConsole = new LibraryExecute();
        while (true) {
            int choice = adminConsole.menu();
            switch (choice) {
                case 1:
                    adminConsole.add();
                    break;
                case 2:
                    adminConsole.remove();
                    break;
                case 3:
                    adminConsole.update();
                    break;
                case 4:
                    adminConsole.search();
                    break;
                case 5:
                    adminConsole.sort();
                    break;
                case 6:
                    adminConsole.display();
                    break;
                case 7:
                    return;
            }
        }
    }
}
