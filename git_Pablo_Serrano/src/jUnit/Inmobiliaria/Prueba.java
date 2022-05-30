package jUnit.Inmobiliaria;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		Vivienda v1 = new Vivienda("Madrid", "01", "Calle Castilla, Nº 17");
		Vivienda v2 = new Vivienda("Toledo", "02", "Calle Alcala, Nº 19");
		
		
		ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();
		alquileres.add(new Alquiler("01","01L", "3642N", 5, 320.00, v1));
		alquileres.add(new Alquiler("02","02L", "3643N", 6, 350.22, v1));
		alquileres.add(new Alquiler("03","01L", "3643N", 3, 270.50, v2));
		alquileres.add(new Alquiler("04","02L", "3642N", 8, true, 170, v2));
		
		Inmobiliaria i1 = new Inmobiliaria("01", "Lugares", alquileres);
		
		// Mostrar Alquileres de la inmobiliaria 
		//i1.mostrarAlquileres("01");
		
		// Mostrar alquiler indicado
		i1.mostrarAlquiler(3);
		
		// Borrar Alquileres
		//System.out.println("\n\n");
		//i1.borrarAlquileres("02");
		//i1.mostrarInmobiliaria();
		
		// Calcular Importe No Pagado
		System.out.println("\n\n");
		i1.calcularImporteNoPagado("01L");
		
		// Calcular media del alquiler de la vivienda
		System.out.println("\n\n");
		i1.mediaAlquilerVivienda("02");
		
		// Pagar un alquiler no pagado
		System.out.println("\n\n");
		if(i1.pagarAlquiler("02")==true) {
			System.out.println("El alquiler ha sido pagado");
		}
		else{
			System.out.println("No se ha podido pagar el alquiler");
		}
		i1.calcularDineroTotalInmobiliaria();
	}

}
