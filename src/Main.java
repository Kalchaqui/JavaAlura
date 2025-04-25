//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Bienvenido a Screen March");
        System.out.println("Película: Matrix");

       int fechaDeLanzamiento = 1999;
       boolean incluioEnElPlan = true;
       double notaDeLaPelicula = 8.2;

       double media = (8.2 + 6.0 + 9.0) / 3 ;
       System.out.println(media);

       String sinopsis = """
               Matrix es una paradoja
               La mejor película del fin del milenio
               Fué lanzada en:
               """ + fechaDeLanzamiento ;
       System.out.println(sinopsis);

       int clasificacion = (int) (media / 2);
       System.out.println(clasificacion);

        String saludo = "Hola, mi nombre es ";
        String nombre = "Alicia y tengo  ";
        int    edad = 17;
        String continuacion = saludo + nombre + edad;

        System.out.println(continuacion);

    }
}