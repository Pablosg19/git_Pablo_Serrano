package jUnit.Inmobiliaria;

public class Vivienda {
	// Atributos
	private String ciudad;
	private String codvivienda;
	private String direccion;
	// Constructores
	public Vivienda(String ciudad, String codvivienda, String direccion) {
		this.ciudad = ciudad;
		this.codvivienda = codvivienda;
		this.direccion = direccion;
	}
	// Getters y Setters
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCodvivienda() {
		return codvivienda;
	}
	public void setCodvivienda(String codvivienda) {
		this.codvivienda = codvivienda;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	// HasCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codvivienda == null) ? 0 : codvivienda.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vivienda other = (Vivienda) obj;
		if (codvivienda == null) {
			if (other.codvivienda != null)
				return false;
		} else if (!codvivienda.equals(other.codvivienda))
			return false;
		return true;
	}
	// To-String
	@Override
	public String toString() {
		return "Vivienda [ciudad=" + ciudad + ", codvivienda=" + codvivienda + ", direccion=" + direccion + "]";
	}
	// Metodos
	public void mostrarVivienda() {
		System.out.println("----------DATOS VIVIENDA----------");
		System.out.println("Ciudad: " + this.ciudad);
		System.out.println("Código vivienda: " + this.codvivienda);
		System.out.println("Dirección: " + this.direccion);
		System.out.println("----------------------------------");
	}
}
