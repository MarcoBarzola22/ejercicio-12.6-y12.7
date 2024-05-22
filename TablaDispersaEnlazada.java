public class TablaDispersaEnlazada { //metodo de multiplicacion


    static final int M = 101;
    private Elemento tabla[];
    private int numElementos;

    // private static final double R = 0.618034;

    Dispersar dispersar = new Dispersar();
    Elemento elemento = new Elemento(null);
    
    public TablaDispersaEnlazada(){
        tabla = new Elemento[M];

        for(int k = 0; k < M; k++){
            tabla[k] = null;
            numElementos = 0;
        }
        
    }

    // static int dispersion(long x){
    //     double t;
    //     int v;
    //     t = R * x - Math.floor(R * x); // es la parte decimal
    //     v = (int) (M * t);
    //     return v;
    // }

    public void insertar(tipoSocio	s, int posicion){
        
        Elemento nuevo;
        posicion = dispersar.dispersar(s.getCodigo());
        nuevo = new Elemento(s);
        nuevo.sgte = tabla[posicion];
        tabla[posicion] = nuevo;
        numElementos++;
        
    }

    boolean conforme(tipoSocio a){
        return true;
    }

    public void eliminar(int codigo) { 
        int posicion = dispersar.dispersar(codigo);
    
        if (tabla[posicion] != null) { // si no está vacía      
            Elemento anterior = null;
            Elemento actual = tabla[posicion];
            
            while (actual != null && actual.getSocio().getCodigo() != codigo) {
                anterior = actual;
                actual = actual.sgte;   
            }
    
            if (actual == null || actual.getSocio().getCodigo() != codigo) {
                System.out.println("No se encuentra en la tabla el socio\n");
            } else if (conforme(actual.getSocio())) {
                if (anterior == null) {
                    tabla[posicion] = actual.sgte;
                } else {
                    anterior.sgte = actual.sgte;
                }
                numElementos--;
                System.out.println("Se ha eliminado el socio\n");
            }
        } else {
            System.out.println("Error. No se pudo eliminar el socio\n");
        }
    }

    public Elemento buscar(int codigo) {
        Elemento p = null;
        int posicion = dispersar.dispersar(codigo);
    
        if (tabla[posicion] != null) {
            p = tabla[posicion];
    
            while (p != null && p.socio.codigo != codigo) {
                p = p.sgte;
            }
    
            if (p == null || p.socio.codigo != codigo) {
                p = null;
            }
        }
        return p;
    }

    public void mostrar(){

        for(int posicion = 0; posicion < M; posicion++){

            Elemento actual = tabla[posicion];
             if(actual != null){
                System.out.println("Persona numero : " + posicion + "\n");//muestra el numero de la persona en la tabla hash
                System.out.println("Codigo: " + actual.getSocio().getCodigo() + "\n");//muestra el codigo
                System.out.println("Edad: " + actual.getSocio().getEdad() + "\n");//mmuestra la edad
                System.out.println("Nombre: " + actual.getSocio().getNombre() + "\n");//muestra el nombre
            
                actual = actual.sgte;
            } else {
                System.out.println("Persona numero : " + posicion + " es null\n");
            }
        }

    }

}
    


