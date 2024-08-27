package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;


    //Constructor
    public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
        this.letras = letras;;
        this.interpretacion = interpretacion;
    }


    //Getters y Setters
    public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
        this.letras = letras;
	}

    public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}


    //Metodos
    public String interpretacion() {
        return interpretacion;
    }
	
	public String toString() {
        String cadena = "";

        for (String letra: letras) {
            if (letra != letras[letras.length - 1])
                cadena = cadena + letra + ", ";
            else
                cadena = cadena + letra;
        }

        return cadena;
    }

	
    public int cantidadLetras() {
        return letras.length;
    }
}
