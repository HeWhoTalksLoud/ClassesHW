public class Book {
    private  String title;
    private  Author author;
    private  int year;

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Book b = (Book) obj;
        return author.equals(b.author) &&
                title.equals(b.title) &&
                year == b.year;
    }

    @Override
    public String toString() {
        return title + ", " + author.getFirstName() +
                " " + author.getLastName() + ", " + year + " г.";
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Напечатать сведения о книге
//    public void print() {
//        System.out.println(title + ", " + author.getFirstName() +
//                " " + author.getLastName() + ", " + year + " г.");
//    }
}