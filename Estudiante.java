// clase de estudiante donde registra los datos principales y de la sede
public class Estudiante {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String correo;
    private String codUnico;
    private Sede sede;

    private Examen resultadosExamen;

    public Examen getResultadosExamen() {
        return resultadosExamen;
    }

    public void setResultadosExamen(Examen resultadosExamen) {
        this.resultadosExamen = resultadosExamen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCodUnico() {
        return codUnico;
    }
    public Sede getSede() {
        return sede;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCodUnico(String codUnico) {
        this.codUnico = codUnico;
    }
    public void setSede(Sede sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Estudiante: "+this.nombre + " " + this.apellido + ", codigo unico: "+this.codUnico;
    }
}
