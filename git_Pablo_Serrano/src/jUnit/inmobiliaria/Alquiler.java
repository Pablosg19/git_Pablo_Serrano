package jUnit.inmobiliaria;

import java.text.DecimalFormat;


public class Alquiler {
	// Atributos
	private String coda;
	private String dniCliente;
	private String dniPropietario;
	private int mesesAlquiler;
	private boolean pagado;
	private double precioAlquiler;
	private Vivienda vivienda;
	// Constructores
	public Alquiler(String coda, String dniCliente, String dniPropietario, int mesesAlquiler, boolean pagado,
			double precioAlquiler, Vivienda vivienda) {
		this.coda = coda;
		this.dniCliente = dniCliente;
		this.dniPropietario = dniPropietario;
		this.mesesAlquiler = mesesAlquiler;
		this.pagado = pagado;
		this.precioAlquiler = precioAlquiler;
		this.vivienda = vivienda;
	}
	public Alquiler(String coda, String dniCliente, String dniPropietario, int mesesAlquiler, double precioAlquiler, Vivienda vivienda) {
		this.coda = coda;
		this.dniCliente = dniCliente;
		this.dniPropietario = dniPropietario;
		this.mesesAlquiler = mesesAlquiler;
		this.pagado = false;
		this.precioAlquiler = precioAlquiler;
		this.vivienda = vivienda;
	}
	// Getters y Setters
	public String getCoda() {
		return coda;
	}
	public void setCoda(String coda) {
		this.coda = coda;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	public String getDniPropietario() {
		return dniPropietario;
	}
	public void setDniPropietario(String dniPropietario) {
		this.dniPropietario = dniPropietario;
	}
	public int getMesesAlquiler() {
		return mesesAlquiler;
	}
	public void setMesesAlquiler(int mesesAlquiler) {
		this.mesesAlquiler = mesesAlquiler;
	}
	public boolean isPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	public double getPrecioAlquiler() {
		return precioAlquiler;
	}
	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	public Vivienda getVivienda() {
		return vivienda;
	}
	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}
	// HasCode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coda == null) ? 0 : coda.hashCode());
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
		Alquiler other = (Alquiler) obj;
		if (coda == null) {
			if (other.coda != null)
				return false;
		} else if (!coda.equals(other.coda))
			return false;
		return true;
	}
	// To-String
	@Override
	public String toString() {
		return "Alquiler [coda=" + coda + ", dniCliente=" + dniCliente + ", dniPropietario=" + dniPropietario
				+ ", mesesAlquiler=" + mesesAlquiler + ", pagado=" + pagado + ", precioAlquiler=" + precioAlquiler
				+ ", vivienda=" + vivienda + "]";
	}
	// Metodos
	public void mostrarAlquiler() {
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("----------DATOS ALQUILER----------");
		System.out.println("Codigo alquiler: " + this.coda);
		System.out.println("DNI cliente: " + this.dniCliente);
		System.out.println("DNI propietario: " + this.dniPropietario);
		System.out.println("Meses alquiler: " + this.mesesAlquiler);
		String pagar;
		if(this.pagado == false) {
			pagar="No";
		}
		else {
			pagar="Si";
		}
		System.out.println("Pagado: " + pagar);
		System.out.println("Precio alquiler: " + df.format(this.precioAlquiler) + "€");
		vivienda.mostrarVivienda();
		System.out.println("----------------------------------");
	}
}
