import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class Anotaciones {
    public static <T> boolean validador(T objeto) {
        Class<?> clase = objeto.getClass();
        for (Field field : clase.getDeclaredFields()) {
            if (field.isAnnotationPresent(EdadMinima.class)) {
                EdadMinima edadMinima = field.getAnnotation(EdadMinima.class);
                try{
                    field.setAccessible(true);
                    LocalDate fechaNacimiento = (LocalDate) field.get(objeto);
                    return Period.between(fechaNacimiento, LocalDate.now()).getYears() >= edadMinima.valor();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

/*    public boolean usuarioValido(Usuario usuario){
        if(!usuario.getNombre().matches("[a-zA-Záàâãéèêíïóôõöúçñ\\s]+")){
            return false;
        }
        if(!usuario.getIdentidad().matches("[^0-9]+")){
            return false;
        }
        return Period.between(usuario.getFechaNacimiento(), LocalDate.now()).getYears() >= 18;
    }*/
}
