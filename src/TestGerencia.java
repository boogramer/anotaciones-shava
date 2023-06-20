import java.time.LocalDate;
import java.time.Month;

public class TestGerencia {
    public static void main(String[] args) {
        LogGerencia albertito = new LogGerencia("Mario", "45454578123", LocalDate.of(1990, Month.MARCH, 14));
        System.out.println(Anotaciones.validador(albertito));
    }
}
