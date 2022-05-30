package jUnit.Inmobiliaria;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Inmobiliaria {
	// Atributos
	private String cif;
	private String nombre;
	private ArrayList<Alquiler> alquileres;
	// Constructores
	public Inmobiliaria(String cif, String nombre, ArrayList<Alquiler> alquileres) {
		this.cif = cif;
		this.nombre = nombre;
		this.alquileres = alquileres;
	}
	public Inmobiliaria(String cif, String nombre) {
		this.cif = cif;
		this.nombre = nombre;
		this.alquileres = new ArrayList<Alquiler>();
	}
	// Getters y Setters
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Alquiler> getAlquileres() {
		return alquileres;
	}
	public void setAlquileres(ArrayList<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}
	// HasCode and Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cif == null) ? 0 : cif.hashCode());
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
		Inmobiliaria other = (Inmobiliaria) obj;
		if (cif == null) {
			if (other.cif != null)
				return false;
		} else if (!cif.equals(other.cif))
			return false;
		return true;
	}
	// To-String
	@Override
	public String toString() {
		return "Inmobiliaria [cif=" + cif + ", nombre=" + nombre + ", alquileres=" + alquileres + "]";
	}
	// Metodos
	public void mostrarInmobiliaria() {
		System.out.println("----------DATOS INMOBILIARIA----------");
		System.out.println("CIF: " + this.cif);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Alquileres: ");
		for (Alquiler a : alquileres) {
			a.mostrarAlquiler();
		}
		System.out.println("--------------------------------------");
	}
	public void mostrarAlquileres(String codVivienda) {
		for (Alquiler a : alquileres) {
			if(a.getVivienda().getCodvivienda().equals(codVivienda)) {
				a.mostrarAlquiler();
			}
		}
	}
	public void borrarAlquileres(String codVivienda) {
		Iterator<Alquiler> it = this.alquileres.iterator();
		while(it.hasNext())
		{
			Alquiler a = it.next();
			if(a.getVivienda().getCodvivienda().equals(codVivienda))
			{
				it.remove();
			}
		}
	}
	public double calcularImporteNoPagado(String dniCliente) {
		DecimalFormat df = new DecimalFormat("#.00");
		double suma = 0;
		for (Alquiler a : alquileres) {
			if(a.getDniCliente().equalsIgnoreCase(dniCliente)) {
				if(a.isPagado() == false) {
					suma = suma + a.getPrecioAlquiler();
				}
			}
		}
		System.out.println("El cliente tiene que pagar la cantidad: " + df.format(suma) + "€");
		return suma;
	}
	public double mediaAlquilerVivienda(String codVivienda) {
		DecimalFormat df = new DecimalFormat("#.00");
		double suma=0;
		double media=0;
		int contador = 0;
		for (Alquiler a : alquileres) {
			if(a.getVivienda().getCodvivienda().equalsIgnoreCase(codVivienda)) {
				contador= contador +1;
				suma = a.getPrecioAlquiler() + suma;
				
			}
		}
		if(contador==0) {
			throw new java.lang.ArithmeticException("División por 0");
		}
		else {
		media=suma/contador;
		System.out.println("Laa vivienda tiene una media de alquiler de " + df.format(media) + "€");
		}
		return suma;
	}
	public boolean pagarAlquiler(String coda) {
		for (Alquiler a : this.alquileres) {
			if(a.getCoda().equalsIgnoreCase(coda)){
				if(a.isPagado()==false) {
					a.setPagado(true);
					return true;
				}
			}
		}
		return false;
	}
	public void mostrarAlquiler(int coda) {
		int i;
		for (i = 0; i  <= coda; i++) {
			if(i==coda) {
				alquileres.get(coda).mostrarAlquiler();
			} 
		}
		
	}
	public double calcularDineroTotalInmobiliaria() {
		DecimalFormat df = new DecimalFormat("#.00");
		double suma = 0;
		for (Alquiler a : alquileres) {
			suma =suma + a.getPrecioAlquiler();
		}
		System.out.println("La suma de los beneficios de los alquileres es de " + df.format(suma) + "€");
		return suma;
	}
}
