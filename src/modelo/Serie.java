package modelo;

public class Serie {
    private String nombre;
    private int fechaDeLanzamiento;
    private int temporadas;
    private int episodiosPorTemporadas;
    private int duracionEnMinutosPorEpisodio;

    // Constructor
    public Serie() {
        // Inicialización si es necesario
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getDuracionEnMinutosPorEpisodio() {
        return duracionEnMinutosPorEpisodio;
    }

    public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
        this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
    }

    // Método para calcular el tiempo total en minutos
    public int calcularTiempoTotalEnMinutos() {
        return temporadas * episodiosPorTemporadas * duracionEnMinutosPorEpisodio;
    }

    // Método para mostrar la ficha técnica de la serie
    public void muestraFichaTecnica() {
        System.out.printf("Serie: %s%n", nombre);
        System.out.printf("Año de lanzamiento: %d%n", fechaDeLanzamiento);
        System.out.printf("Temporadas: %d%n", temporadas);
        System.out.printf("Episodios por temporada: %d%n", episodiosPorTemporadas);
        System.out.printf("Duración de cada episodio: %d minutos%n", duracionEnMinutosPorEpisodio);
    }
}