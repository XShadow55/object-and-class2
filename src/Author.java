public class Author {
    private String firstName;
    private String lastName;

    public Author(String fistName, String lastName) {
        this.firstName = fistName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
