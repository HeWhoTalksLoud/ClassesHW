public class Main {
    public static void main(String[] args) {

        Author authorChekhov = new Author("Антон", "Чехов");
        Author authorLondon = new Author("Джек", "Лондон");

        Book bookCherryOrchid = new Book("Вишневый сад", authorChekhov, 1985);
        Book bookCherryOrchid2 = new Book("Вишневый сад", authorChekhov, 2021);
        Book bookSnark = new Book("Путешествие на Снарке", authorLondon, 1911);

        System.out.println(bookCherryOrchid);
        System.out.println(bookSnark);

        System.out.println();

        bookSnark.setYear(1980);
        System.out.println(bookSnark);
        bookCherryOrchid.setYear(2005);
        System.out.println(bookCherryOrchid);

        System.out.println(bookCherryOrchid.equals(bookCherryOrchid2));
        bookCherryOrchid2.setYear(2005);
        System.out.println(bookCherryOrchid.equals(bookCherryOrchid2));

        System.out.println();
        System.out.println(bookSnark.hashCode());
        System.out.println(authorLondon.hashCode());
        System.out.println(authorLondon);
        System.out.println(bookCherryOrchid.hashCode());
        System.out.println(bookCherryOrchid2.hashCode());
    }
}