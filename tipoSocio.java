public class tipoSocio {
    
    class Fecha{
        private int dia;
        private int mes;
        private int year;

        Fecha (int d, int m, int y){
            dia = d;
            mes = m;
            year = y;
        }

        public String toString () {
            return " " + this.dia + "-" + this.mes + "-" + this.year;
        }
    }

    public int codigo;
    private String nombre;
    private int edad;
    Fecha f;

    public tipoSocio (String name, int codigo, int edad, int dia, int mes, int year){
        this.codigo = codigo;
        this.nombre = name;
        this.edad = edad;
        f = new Fecha(dia,mes,year);
    }

    public int getCodigo(){
        return codigo;
    }

    public int getEdad(){
        return edad;
    }

    public String getNombre(){
        return nombre;
    }

}



