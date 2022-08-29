package pro.sky.java.cource1.lesson10;

public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;

    }

    public String getTitle(){
        return title;
    }
    public Author getAuthor(){
        return author;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear=publicationYear;
    }

    @Override
    public String toString(){
        return "Название книги "+title+", Автор "+author+", Год публикации "+publicationYear;
    }

    public boolean equals(Book anotherBook){
        return anotherBook.title.equals(this.title)
                && anotherBook.author.equals(this.author)
                && anotherBook.publicationYear==this.publicationYear;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title+author+publicationYear);
    }
}
