public class Book {
    private Author nameAuthor;
    private String nameBook;
    private int year;

    public String toString(){
        return "Автор: " + this.nameAuthor.toString() + " Книга: " + this.nameBook + " Год выпуска: " + this.year;
    }
    public Book(String name, Author nameAuthor) {
        this.nameBook = name;
        this.nameAuthor = nameAuthor;


    }
    public boolean equals(Object a){
        if (this.getClass() != a.getClass()){
            return false;
        }
        Book c2 = (Book) a;
        return nameBook.equals(c2.nameBook);
    }
    public int hashCode(){
        return java.util.Objects.hashCode(nameBook);
    }
    public String getNameBook() {
        return this.nameBook;
    }

    public Author getNameAuthor() {
        return this.nameAuthor;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
