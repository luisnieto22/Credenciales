package credencial;

import java.util.List;
import java.util.Scanner;

public class principal {
	public static void main(String[]args) {
		Scanner teclado=new Scanner(System.in);
		datos dats= new datos();
		registro conec=new registro();
		int randomInt=0;
		int eleccion=0;
		
		 System.out.println("Ingrese su(s) nombre(s): ");
		 dats.setNombre(teclado.next());
		 
		 System.out.println("Ingrese su apellido paterno: ");
		 dats.setApellidoP(teclado.next());
		 
		 System.out.println("Ingrese su apellido materno: ");
		 dats.setApellidoM(teclado.next());
		 
		 System.out.println("Ingrese su domicilio: ");
		 dats.setDomicilio(teclado.next());
		 
		 System.out.println("Ingrese su clave de elector (18 digitos alfanumericos): ");
		 dats.setClavedelector(teclado.next());
		 
		 System.out.println("Ingrese su curp (18 digitos alfanumericos): ");
		 dats.setCurp(teclado.next());
		 
		 System.out.println("Ingrese su genero: ");
		 dats.setSexo(teclado.next());
		 
		 System.out.println("Ingrese su fecha de nacimiento (DD/MM/AA): ");
		 dats.setFechanacimiento(teclado.next());
		 
		 System.out.println("Ingrese su año de registro: ");
		 dats.setAñoderegistro(teclado.nextInt());
		 
		 System.out.println("Ingrese su codigo postal: ");
		 dats.setCodigopostal(teclado.nextInt());
		 
		 System.out.println("Ingrese su ciudad: ");
		 dats.setMunicipio(teclado.next());
		 
		 System.out.println("Ingrese el año de vigencia de su identficacion: ");
		 dats.setVigencia(teclado.nextInt());
		 
		 System.out.println("Datos ingresados correctamente!");
		 conec.insertarregistro(dats);
		 dats=conec.seleccionarpersona(dats);
		 
		 System.out.println("\n¿Desea agregar otro usuario?  \n1.Si, agregar otro usuario  \n2.No, mostrar la lista de los usuarios");
		 eleccion=teclado.nextInt();
		 switch(eleccion) {
		 case 1:
			 principal.main(null);
			 break;
		 case 2:
			 List<datos> Up=conec.seleccionarlista();
	 		 for(datos datos:Up) {
				 System.out.println("\n"+datos);
			 }
			 System.out.println("\nGracias por usar el sistema.");
			 break;
		 }		 
	}

}

