import java.time.LocalDate;
public class LogGerencia {
    private String nombre;
    private String identidad;
    @EdadMinima(valor = 30)
    private LocalDate fechaNacimiento;

    public LogGerencia(String nombre, String identidad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.fechaNacimiento = fechaNacimiento;
    }
}
