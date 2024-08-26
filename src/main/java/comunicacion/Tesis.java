package comunicacion;
import java.util.ArrayList;

public class Tesis extends Escrito {
    private String idea;
    private static String[] argumentos;
    private String conclusion; 
    private String referencias;
    private String interpretacion;


    //Constructor
    public Tesis (String origen, String titulo, String autor, int paginas, String idea, String[] argumentos,
    String conclusion, String referencias, String interpretacion ) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = this.toString();
    }


    //Getters y Setters
    public int getArgumentos() {
		return argumentos.size();
	}

    public String getIdea() {
		return this.idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
    }

    public String getConclusion() {
		return this.conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
    }

    public String getReferencias() {
		return this.referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
    }

    public String getInterpretacion() {
		return this.interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
    }


    //Metodos
    public int palabrasTotales(int palabrasPagina) {
        return this.getPaginas() * palabrasPagina * 5;
    }

    public String interpretacion() {
        return this.interpretacion;
    }

   
	public String toString() {
        return (this.getOrigen() + "\n" + this.getTitulo() + "\n" + 
        this.getAutor() + "\n" + this.getPaginas() + "\n" + this.getIdea() + "\n" + 
        this.getConclusion() + "\n" + this.getReferencias());
    }
}
 