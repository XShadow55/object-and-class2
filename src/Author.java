
public class Author {
    private String firstName;
    private String lastName;

    public Author(String fistName, String lastName) {
        this.firstName = fistName;
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public boolean equals(Object a) {
        if (this.getClass() != a.getClass()) {
            return false;
        }
        Author c2 = (Author) a;
        return firstName.equals(c2.firstName) && lastName.equals(c2.lastName);
    }

    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }
}
