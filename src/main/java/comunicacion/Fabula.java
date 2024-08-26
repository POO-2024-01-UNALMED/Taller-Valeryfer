package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;


    //Constructor
    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = this.toString();
    }


    //Getters y Setters
    public String getEnsenanza() {
		return this.ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

    public String getInterpretacion() {
		return this.interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
    }


    //Metodos
    public int palabrasTotales(int palabrasPagina) {
        return this.getPaginas() * palabrasPagina * 1;
    }

    public String interpretacion() {
        return this.interpretacion;
    }

	public String toString() {
        return (this.getOrigen() + "\n" + this.getTitulo() + "\n" + 
        this.getAutor() + "\n" + this.getPaginas() + "\n" + this.getEnsenanza());
    }
}