import java.time.LocalDate;
import java.time.Month;

public class TestUser {
    public static void main(String[] args) {
        User usuario = new User("Maria", "42198284863", LocalDate.of(2005, Month.MAY, 30));
        System.out.println(Anotaciones.validador(usuario));
    }
}
