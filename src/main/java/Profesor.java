public class Profesor extends Persona {
    private String[] registros;
    private String profesion;

    public Profesor(String nombre, String apellido, String fechaNacimiento, String genero, double estatura, double peso, String profesion) {
        super(nombre, apellido, fechaNacimiento, genero, estatura, peso);
        this.registros = new String[50];

        this.profesion = profesion;


    }
    public String getProfesion() {
        return profesion;
    }
    public String mostrarInformacion() {
        return String.format("Nombre: %s\nApellido: %s\nFecha de Nacimiento: %s\nGénero: %s\nEstatura: %.2f m\nPeso: %.2f kg\nProfesión: %s",
                getNombre(), getApellido(), getFechaNacimiento(), getGenero(), getEstatura(), getPeso(), getProfesion());
    }
}