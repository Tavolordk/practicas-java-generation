package paquete2;

public class ClasePrivada {
    //atributos
	public String nombre;
	protected int edad;
	
	//metodos
	public void setSaludar(String nombre) {
		this.nombre= nombre;
	}
	
	public String getSaludar() {
		return this.nombre;
	}
}