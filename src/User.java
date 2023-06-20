import java.time.LocalDate;
public class User {
    private String nombre;
    private String identidad;
    @EdadMinima
    private LocalDate fechaNacimiento;

    public User(String nombre, String identidad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.fechaNacimiento = fechaNacimiento;
    }
}
