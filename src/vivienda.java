//Clase base vivienda
public class vivienda {
    //Atributos de la clase padre
    private String direccion;
    private int numHabitaciones;
    private String tipoVivienda;

    //Contructor de la clase vivienda
    public vivienda(String direccion, int numHabitaciones, String tipoVivienda) {
        this.direccion = direccion;
        this.numHabitaciones = numHabitaciones;
        this.tipoVivienda = tipoVivienda;
    }

    //getters y setters de la clase atributo
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    //metodo mostrar Informacion
    public void mostrarInfo() {
        System.out.print("La info de la vivienda es: ");
        System.out.print("Direccion: " + direccion);
        System.out.print("Numero de Habitaciones: " + numHabitaciones);
        System.out.print("Tipo de vivienda: " + tipoVivienda);
    }

    //nueva clase hija heredada de la clase vivienda
    class casa extends vivienda {
        //atributos de la clase casa
        private double areaConstruida;

        private int numBanos;

        //constructor de la clase hija
        public casa(String direccion, int numHabitaciones, String tipoVivienda, double areaConstruida, int numBanos) {
            super(direccion, numHabitaciones, tipoVivienda);
            this.areaConstruida = areaConstruida;
            this.numBanos = numBanos;
        }

        //getters y setters de la clase hija
        public double getAreaConstruida() {
            return areaConstruida;
        }

        public void setAreaConstruida(double areaConstruida) {
            this.areaConstruida = areaConstruida;
        }

        public int getNumBanos() {
            return numBanos;
        }

        public void setNumBanos(int numBanos) {
            this.numBanos = numBanos;
        }

        //metodo mostrar Informacion
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.print("Area Construida: " + areaConstruida);
            System.out.print("Numero de baños: " + numBanos);
        }


    }


//clase casaCiudad heredada de casa

    class casaCiudad extends casa {
        //atributos departamiento
        private String estadoCasaCiudad;
        private float precioCasaCiudad;

        //metodos clase departamiento
        //Constructor
        public casaCiudad(String direccion, int numHabitaciones, String tipoVivienda, double areaConstruida, int numBanos, String estadoCasaCiudad, float precioCasaCiudad) {
            super(direccion, numHabitaciones, tipoVivienda, areaConstruida, numBanos);
            this.estadoCasaCiudad = estadoCasaCiudad;
            this.precioCasaCiudad = precioCasaCiudad;
        }

        //getters y setters de la clase departamento
        //atributo estadoDepartamento
        public String getEstadoCasaCiudad() {
            return estadoCasaCiudad;
        }

        public void setEstadoCasaCiudad(String estadoCasaCiudad) {
            this.estadoCasaCiudad = estadoCasaCiudad;
        }
        //atributo precioDepartamento

        public float getPrecioCasaCiudad() {
            return precioCasaCiudad;
        }

        public void setPrecioCasaCiudad(float precioCasaCiudad) {
            this.precioCasaCiudad = precioCasaCiudad;
        }

        //metodo mostrar Informacion
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.print("Estado: " + estadoCasaCiudad);
            System.out.print("Precio: " + precioCasaCiudad);
        }

    }

    //tercer nivel de herencia
    class apartamentoCiudad extends casaCiudad {
        //atributos
        private String tipoAparcamiento;
        private String tipoSeguridad;
        private int numPersonasViviendo;

        //metodos
        //constructor
        public apartamentoCiudad(String direccion, int numHabitaciones, String tipoVivienda, double areaConstruida,
                                 int numBanos, String estadoCasaCiudad, float precioCasaCiudad, String tipoAparcamiento,
                                 String tipoSeguridad, int numPersonasViviendo) {
            super(direccion, numHabitaciones, tipoVivienda, areaConstruida, numBanos, estadoCasaCiudad, precioCasaCiudad);
            this.tipoAparcamiento = tipoAparcamiento;
            this.tipoSeguridad = tipoSeguridad;
            this.numPersonasViviendo = numPersonasViviendo;
        }

        //getters and setters clase apartamentoCiudad
        //atributo tipoAparcamiento
        public String getTipoAparcamiento() {
            return tipoAparcamiento;
        }

        public void setTipoAparcamiento(String tipoAparcamiento) {
            this.tipoAparcamiento = tipoAparcamiento;
        }

        //atributo tipoSeguridad
        public String getTipoSeguridad() {
            return tipoSeguridad;
        }

        public void setTipoSeguridad(String tipoSeguridad) {
            this.tipoSeguridad = tipoSeguridad;
        }

        //atributo numPersonasViviendo
        public int getNumPersonasViviendo() {
            return numPersonasViviendo;
        }

        public void setNumPersonasViviendo(int numPersonasViviendo) {
            this.numPersonasViviendo = numPersonasViviendo;
        }

        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.print("Tipo de aparcamiento: " + tipoAparcamiento);
            System.out.print("Tipo de seguridad: " + tipoSeguridad);
            System.out.print("Numero de personas viviendo: " + numPersonasViviendo);

        }

    }


    // 4 y 5 niveles


    //ejecucion main
}

