import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        Serie serieUsuario = null; // Declarar serieUsuario aquí para que sea accesible en todo el método

        while (opcion != 9) {
            String menu = """
                    \nBienvenido(a) a Screenmach
                    1) Registrar nueva pelicula
                    2) Registrar nueva serie
                    3) Calcular tiempo necesario para terminar una serie en días
                    9) Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la pelicula");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la pelicula");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duracion en minutos de la pelicula");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la serie");
                    String nombreSerie = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la serie");
                    int fechaDeLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa el número de temporadas para esta serie");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa la cantidad de episodios por cada temporada");
                    int episodiosPorTemporada = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa la duración en minutos de cada episodio");
                    int minutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();
                    serieUsuario = new Serie(); // Aquí se inicializa serieUsuario
                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporadas(episodiosPorTemporada);
                    serieUsuario.setDuracionEnMinutosPorEpisodio(minutosPorEpisodio);
                    serieUsuario.muestraFichaTecnica();
                    break;

                case 3:
                    if (serieUsuario != null) { // Verificar si hay una serie registrada
                        int tiempoTotalEnMinutos = serieUsuario.calcularTiempoTotalEnMinutos(); // Usar el método de la clase Serie

                        // Convertir el tiempo total a días (ajustado a 12 horas)
                        int minutosPorDia = 720; // 12 horas * 60 minutos
                        double diasNecesarios = (double) tiempoTotalEnMinutos / minutosPorDia;

                        // Calcular cuántos episodios se pueden ver en un día
                        int episodiosPorDia = minutosPorDia / serieUsuario.getDuracionEnMinutosPorEpisodio();

                        // Calcular cuántos días tardarías en terminar la serie
                        int totalEpisodios = serieUsuario.getEpisodiosPorTemporadas() * serieUsuario.getTemporadas();
                        double diasParaTerminar = (double) totalEpisodios / episodiosPorDia;

                        // Mostrar solo días enteros
                        int diasEnterosNecesarios = (int) Math.floor(diasNecesarios);
                        int diasEnterosParaTerminar = (int) Math.floor(diasParaTerminar);

                        if (diasEnterosNecesarios > 0) {
                            System.out.printf("Necesitarás aproximadamente %d días para terminar la serie.%n", diasEnterosNecesarios);
                        } else {
                            System.out.println("El tiempo total es insuficiente para completar al menos un día de visualización.");
                        }

                        System.out.printf("Puedes ver aproximadamente %d episodios en un día.%n", episodiosPorDia);

                        // Se eliminó la impresión repetitiva
                    } else {
                        System.out.println("No hay ninguna serie registrada.");
                    }
                    break;

                case 9:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}