import java.util.Scanner;

public class Main { //En este programa se muestra los tipos de datos, el uso de variables y su impresion de pantalla
    public static void main(String[] args) {
        System.out.println("Bienvidos a la inmersiòn en Java");
      //  System.out.println("Pelicula Matrix");

        // Declaración de variables
        int fechaDeLanzamiento = 1999; // dato primitivo
        double evaluacion = 4.5; //dato primitivo
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("película: "+nombre);
        System.out.println("Fecha de lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Evaluacion por la critica: "+evaluacion);
        System.out.println("Esta incluido en el plan basico: "+incluidoEnElPlanBasico);
        System.out.println("Sinopsis de la pelicula: "+ sinopsis);

        double mediaEvaluacion = (4.5 + 4.8 + 3) /3;

        System.out.println("Media de evaluciòn de Matrix "+mediaEvaluacion);

        if (fechaDeLanzamiento > 2023){
            System.out.println("Película Popular en el momento");
        }
        else{
            System.out.println("Película Retro que vale la pena ver ");
        }
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }

        System.out.println("La media de la película " +
                "Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);

    }
}