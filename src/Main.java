public class Main {
    public static void main(String[] args) {

        Author authorChekhov = new Author("Антон", "Чехов");
        Author authorLondon = new Author("Джек", "Лондон");

        Book bookCherryOrchid = new Book("Вишневый сад", authorChekhov, 1985);
        Book bookSnark = new Book("Путешествие на Снарке", authorLondon, 1911);

        bookCherryOrchid.print();
        bookSnark.print();

        System.out.println();

        bookSnark.setYear(1980);
        bookSnark.print();
        /*bookCherryOrchid.setYear(2005);
        bookCherryOrchid.print();*/
    }
}