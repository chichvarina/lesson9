package pro.sky.java.cource1.lesson10;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Author klychevsky = new Author("Василий", "Ключевский");
        Author bunin = new Author("Иван", "Бунин");

        Book book1 = new Book("Русская история", klychevsky, 2005);
        Book book2 = new Book("Деревня", bunin, 1885);
        book2.setPublicationYear(1985);

        System.out.println(klychevsky);
        System.out.println(bunin);

        System.out.println(book1);
        System.out.println(book2);

        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Александр", "Пушкин");

        System.out.println( author1.equals(author2) );

        Book book3=new Book("Евгений Онегин",author1,1980);
        Book book4=new Book("Евгений Онегин",author2,1980);
        System.out.println(book3.equals(book4));

        System.out.println(book3.hashCode());

    }
}
