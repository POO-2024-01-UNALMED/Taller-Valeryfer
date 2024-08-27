package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;


    //Constructor
    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }


    //Getters y Setters
    public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

    public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
    }


    //Metodos
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina * 1;
    }

    public String interpretacion() {
        return interpretacion;
    }

	public String toString() {
        return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + getEnsenanza();
    }
}