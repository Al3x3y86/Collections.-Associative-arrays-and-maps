import java.util.Objects;

public class FullName {

    private final String surname;
    private final String name;

    public FullName(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FullName fullName = (FullName) o;
        return Objects.equals(surname, fullName.surname) && Objects.equals(name, fullName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name);
    }

    @Override
    public String toString() {
        return surname + " " + name;
    }
}

