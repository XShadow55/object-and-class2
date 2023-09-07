// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Author nameAuthor = new Author("Боб","Ватсон");
        Book name = new Book("Война и мир ", nameAuthor);
        System.out.println(name.toString());

        name.setYear(1333);
        System.out.println(name.toString());
        Author nameAuthor1 = new Author("Вован","Витчер");
        Book name1 = new Book("Смерть в луже ", nameAuthor1);
        System.out.println(name1.equals(name));
        System.out.println(name1.hashCode());
        System.out.println(name1.toString());
        name1.setYear(2023);
        System.out.println(name1.toString());



        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

    }
}
