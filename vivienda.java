//Clase base vivienda
public class vivienda(){
    //Atributos de la clase padre
    private String direccion;
    private int numHabitaciones;
    private String tipoVivienda;
    //Contructor de la clase vivienda
    public vivienda(String direccion, int numHabitaciones, String tipoVivienda){
        this.direccion = direccion;
        this.numHabitaciones = numHabitaciones;
        this.tipoVivienda = tipoVivienda;
    }
    //getters y setters de la clase atributo
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        return direccion;
    }
    public int getNumHabitaciones(){
        return numHabitaciones;
    }
    public void setNumHabitaciones(int numHabitaciones){
        return numHabitaciones;
    }
    public int getTipoVivienda(){
        return tipoVivienda;
    }
    public void setTipoVivienda(int tipoVivienda){
        return tipoVivienda;
    }
}
//nueva clase hija heredada de la clase vivienda
class casa extends vivienda{
//atributos de la clase casa
    private double areaConstruida;
    private int numBanos;
    //constructor de la clase hija
    public casa(String direccion, int numHabitaciones, String tipoVivienda, double areaConstruida, int numBanos){
        super(direccion, numHabitaciones, tipoVivienda)
        this.areaConstruida = areaConstruida;
        this.numBanos = numBanos;
    } 
    //getters y setters de la clase hija
    public int getAreaConstruida(){
        return areaConstruida;
    }
    public void setAreaConstruida(int areaConstruida){
        return areaConstruida;
    }
    public int getNumBanos(){
        return numBanos;
    }
    public void setNumBanos(int numBanos){
        return numBanos;
    }
}