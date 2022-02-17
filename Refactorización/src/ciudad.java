
public class ciudad {
	
	private String nombre;
	private int ciudadanos;
	private String codigoPostal;
	private int tipoCiudad;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCiudadanos() {
		return ciudadanos;
	}

	public void setCiudadanos(int ciudadanos) {
		this.ciudadanos = ciudadanos;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public int getTipoCiudad() {
		return tipoCiudad;
	}

	public void setTipoCiudad(int tipoCiudad) {
		this.tipoCiudad = tipoCiudad;
	}

	public void Ciudad(String nombre, int ciudadanos, String codigoPostal, int tipoCiudad){
	this.nombre = nombre;
	this.ciudadanos = ciudadanos;
	this.codigoPostal = codigoPostal;
	this.tipoCiudad = tipoCiudad;
	}

	public void printPoblacion(String nombre, int ciudadanos, String string, int tipoCiudad){
	System.out.println("La población de " + nombre + "es de: " + ciudadanos);
	System.out.println("Su código postal es: " + string);
	ciudadanos = ciudadanos + ciudadanos*tipoCiudad;
	System.out.println("Su población efectiva teniendo en cuenta el tipo de ciudad es: " + ciudadanos);
	}

	public static int factorCorrectorCiudad(String nombre, int ciudadanos, String codigoPostal, int tipoCiudad){
		
		
		final boolean numAltoCiud = ciudadanos >50000;
		final boolean codigoTrue = codigoPostal == "12003";
		final boolean ciudadTrue = tipoCiudad > 1;
		final boolean numBajoCiud = ciudadanos >5000;
		final boolean codigoFalse = codigoPostal == "12000";
		final boolean ciudadFalse = tipoCiudad == 1;
		
		
		

	if(((numAltoCiud) && (codigoTrue) && (ciudadTrue)) || ((numBajoCiud) && (codigoFalse) && (ciudadFalse)))
	{
	return ciudadanos=(int) (ciudadanos*0.95);
	}
	else
	{
	return ciudadanos=(int) (ciudadanos*0.95);
	}
	}
}

