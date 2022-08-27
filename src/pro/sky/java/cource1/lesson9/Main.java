package pro.sky.java.cource1.lesson9;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Author klychevsky = new Author("Василий", "Ключевский");
        Author bunin = new Author("Иван", "Бунин");

        System.out.println(klychevsky.getName() +" "+klychevsky.getSurname());
        System.out.println(bunin.getName()+" "+bunin.getSurname());

        Book book1 = new Book("Русская история", klychevsky, 2005);
        Book book2 = new Book("Деревня", bunin, 1885);
        book2.setPublicationYear(1985);

        System.out.println("Название книги "+book2.getTitle()+", "
                +"Автор "+book2.getAuthor().getName()
                + " "+book2.getAuthor().getSurname()+" Год публикации "+book2.getPublicationYear());

        System.out.println("Название книги "+book1.getTitle()+", "
                +"Автор "+book1.getAuthor().getName()
                + " "+book1.getAuthor().getSurname()+" Год публикации "+book1.getPublicationYear());


    }
}
