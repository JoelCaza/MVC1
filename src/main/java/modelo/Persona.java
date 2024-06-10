package modelo;

/*
 * Clase que representa a una persona.
 */
public class Persona {
    private String nombre; // Nombre de la persona
    private String sexo; // Sexo de la persona
    private int edad; // Edad de la persona
    private double sueldoMensual; // Sueldo mensual de la persona

    /*
     * Constructor de la clase Persona.
     * @param nombre Nombre de la persona.
     * @param sexo Sexo de la persona.
     * @param edad Edad de la persona.
     * @param sueldoMensual Sueldo mensual de la persona.
     */
    public Persona(String nombre, String sexo, int edad, double sueldoMensual) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.sueldoMensual = sueldoMensual;
    }

    /*
     * Método getter para obtener el nombre de la persona.
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /*
     * Método setter para establecer el nombre de la persona.
     * @param nombre Nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
     * Método getter para obtener el sexo de la persona.
     * @return Sexo de la persona.
     */
    public String getSexo() {
        return sexo;
    }

    /*
     * Método setter para establecer el sexo de la persona.
     * @param sexo Sexo de la persona.
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /*
     * Metodo getter para obtener la edad de la persona.
     * @return Edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /*
     * Método setter para establecer la edad de la persona.
     * @param edad Edad de la persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /*
     * Método getter para obtener el sueldo mensual de la persona.
     * @return Sueldo mensual de la persona.
     */
    public double getSueldoMensual() {
        return sueldoMensual;
    }

    /*
     * Método setter para establecer el sueldo mensual de la persona.
     * @param sueldoMensual Sueldo mensual de la persona.
     */
    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
