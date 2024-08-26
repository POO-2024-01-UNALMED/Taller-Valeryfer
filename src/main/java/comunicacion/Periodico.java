package comunicacion;

public class Periodico extends Escrito {
    private String fecha;
    private String primicia;
    private String interpretacion;


    //Constructor
    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = this.toString();
    }


    //Getters y Setters
    public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
    }

    public String getPrimicia() {
		return this.primicia;
	}

	public void setPrimicia(String primicia) {
		this.primicia = primicia;
    }

    public String getInterpretacion() {
		return this.interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
    }


    //Metodos
    public int palabrasTotales(int palabrasPagina) {
        return this.getPaginas() * palabrasPagina * 10;
    }

    public String interpretacion() {
        return this.interpretacion;
    }

    //Rectificar
	public String toString() {
        return (this.getOrigen() + "\n" + this.getTitulo() + "\n" + 
        this.getAutor() + "\n" + this.getPaginas() + "\n" + this.getFecha() + "\n" + this.getPrimicia());
    }
}
