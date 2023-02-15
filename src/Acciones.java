public class Acciones {



    public static Espada forjar(String tipoDeEspada){
        if (tipoDeEspada=="Gladius"){
            return new Gladius("Gladius");
        }
        else if (tipoDeEspada=="Hanzo"){
            return new Hanzo("Hanzo");
        } else if (tipoDeEspada=="Spatha") {
            return  new Spatha("Spatha");
        }
        else {
            System.out.println("Fallo al forjar la espada");
        }
        return null;
    }
}
