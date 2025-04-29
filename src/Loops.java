import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i = 0; i < 3; i++) { //recordar que el 0 siempre cuanta como 1 en esta condición
            System.out.println("Ingrese un nota que le darias a la pelicula matrix: ");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }
        System.out.println("La media de evaluaciones para Matrix es: " + mediaEvaluaciones / 3);
    }
}
