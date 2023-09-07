// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Author nameAuthor = new Author("Боб","Ватсон");
        Book name = new Book("Война и мир ", nameAuthor);
        System.out.println(name.getNameBook());
        System.out.println(name.getNameAuthor().getFirstName()+" "+ name.getNameAuthor().getLastName());
        name.setYear(1333);
        System.out.println(name.getYear());
        Author nameAuthor1 = new Author("Вован","Витчер");
        Book name1 = new Book("Смерть в луже ", nameAuthor1);
        System.out.println(name1.getNameBook());
        System.out.println(name1.getNameAuthor().getFirstName()+" "+ name1.getNameAuthor().getLastName());
        name1.setYear(2023);
        System.out.println(name1.getYear());



        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

    }
}
