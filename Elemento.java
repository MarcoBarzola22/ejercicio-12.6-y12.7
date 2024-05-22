/**
 * Elemento
 */
public class Elemento {
        tipoSocio socio;
        Elemento sgte;

        Dispersar dispersar = new Dispersar();

        public Elemento(tipoSocio e){   
            socio = e;
            sgte = null;
        }

        public tipoSocio getSocio() {
            return socio;
        }
}