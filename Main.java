import java.util.Scanner;

public class Main {

    static public void asigna(TablaDispersaEnlazada tabla, Scanner input){
        String name;
        int bandera = 0, controlar = 1, lugar = 0, edad, dia, mes, year, codigo, codigoDisperso;

        Dispersar dispersar = new Dispersar();
        Scanner scc = new Scanner(System.in);

        for(int i = lugar; i < tabla.M; i++){

            if(controlar == 1){

                System.out.println("Ingrese al Socio N: " + (i + 1) + "\n");

                System.out.println("Ingrese el nombre: \n");
                name = scc.nextLine();

                System.out.println("Ingrese el codigo: \n");
                codigo = scc.nextInt();

                System.out.println("Ingrese la edad: \n");
                edad = scc.nextInt();

                System.out.println("Ingrese el día: \n");
                dia = scc.nextInt();

                System.out.println("Ingrese el mes: \n");
                mes = scc.nextInt();

                System.out.println("Ingrese el year: \n");
                year = scc.nextInt();

                Dispersar d = new Dispersar();
                codigoDisperso = dispersar.dispersar(codigo);

                tipoSocio instanciar = new tipoSocio(name, codigo, edad, dia, mes, year);
                tabla.insertar(instanciar, codigoDisperso);

                lugar = lugar + 1;

                System.out.println("¿Usted quiere seguir cargando elementos?\n");
                System.out.println("1) Si.\n");
                System.out.println("2) No.\n");
                controlar = scc.nextInt();
                scc.nextLine();

            } else if (controlar == 2) {
                break;
            }

        }
    }
    


 public static void main(String[] args) throws Exception {

        Scanner scc = new Scanner(System.in);
        int opcion, flag = 0;
        TablaDispersaEnlazada tabla = new TablaDispersaEnlazada();
       

        do {
            
            System.out.println("Bienvenido... \n Presione...\n");
            System.out.println("1) Si desea Insertar Socio.\n");
            System.out.println("2) Si desea Eliminar Socio.\n");
            System.out.println("3) Si desea Mostrar Socios.\n");
            System.out.println("4) Si desea Salir.\n");
            opcion = scc.nextInt();

            switch (opcion) {
                case 1:
                    // insertar
                    asigna(tabla, scc);
                    flag = 1;
                    break;
                case 2:
                    if (flag == 1) {
                        // Eliminar
                        System.out.println("\nIngrese el codigo del socio a eliminar.\n");
                        int codigo = scc.nextInt();
                        tabla.eliminar(codigo);
                        
                    } else {
                        System.out.println("\nError. Primero debe cargar\n");
                    
                    }

                    break;
                case 3:
                    if (flag == 1) {
                        // mostrar
                        tabla.mostrar();
                    } else {

                        System.out.println("\nError. Primero debe cargar\n");
                       
                    }

                    break;
                case 4:
                    System.out.println("\nGracias por utilizar nuestro software, vuelva pronto\n");
                    break;

                default:
                    System.out.println("\nError. Esa opcion no existe\n");
                    break;
            }

        } while (opcion != 4);

    }
 }
