package pro.sky.java.cource1.lesson10;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname){
        this.name=name;
        this.surname=surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString(){
        return name + " "+ surname;
    }

    public boolean equals(Author anotherAutor){
        return anotherAutor.name==this.name && anotherAutor.surname==this.surname;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name+surname);
    }

}
