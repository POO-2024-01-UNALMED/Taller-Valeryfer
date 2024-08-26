package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma{
    private static String[] letras;
    private String interpretacion;


    //Constructor
    public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
        Alfabeto.letras = letras;;
        this.interpretacion = interpretacion;
    }


    //Getters y Setters
    public String[] getLetras() {
		return letras;
	}

	//public void setLetras(ArrayList<String> letras) {
	//	this.letras = letras;
	//}

    public String getInterpretacion() {
		return this.interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}


    //Metodos
    public String interpretacion() {
        return this.interpretacion;
    }
	
    //Rectificar
	public String toString() {
        for (int i = 0; i < Alfabeto.letras.length; i++) {
            return (letras.length + ", ");
        }
        return interpretacion;
    }
	
    public int cantidadLetras() {
        return letras.length;
    }
}
