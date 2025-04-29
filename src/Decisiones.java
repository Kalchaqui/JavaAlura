public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluioEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        //CODIGO QUE PRUEBA LOS OPERADORES RELACIONALES
        if (fechaDeLanzamiento >= 2024) {
            System.out.println("Peliculas mas populares");
        }else {
            System.out.println("Peliculas retro que aún valen la pena ver");
        }
        if(incluioEnElPlan || tipoPlan.equals("plus")){ //Si es veradera o si el tipo de plan es igual a "plus"
            System.out.println("Disfrutá de la película");
        }else {
            System.out.println("Pelicula no displonible para su plan actual");
        }
        }
    }


