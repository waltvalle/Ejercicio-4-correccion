import java.util.Scanner;
public class Ejercicio_4_corregido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int porce = 0;
		//Se imprime quiz de cultura general y por cada pregunta correcta se asignan 20% al puntaje//
		System.out.println("Quiz de Cultura General");
		//Se imprime primera pregunta y se determina una respuesta unica (tokio), si no es la respuesta correcta se imprime incorrecto//
		System.out.println("Capital de Japon: ");
		String capital= s.next();
		{ 
			if (capital.toLowerCase().equals("tokio"))
			{
				System.out.println("Correcto");
			    porce = porce + 20;
			}
			else
				System.out.println("Incorrecto");
		}

			//Se imprime la segunda pregunta y se determina una respuesta unica (paris), si no es la respuesta correcta se imprime incorrecto//
		System.out.println("Capital de Francia: ");
			capital= s.next();
		{ 
			if (capital.toLowerCase().equals("paris"))
			{
				System.out.println("Correcto");
				porce = porce + 20;
			}
			else
				System.out.println("Incorrecto");

			//Se imprime la tercera pregunta y se determina una respuesta unica, si no es la respuesta correcta se imprime incorrecto//
			System.out.println("Capital de Brasil: ");
			capital= s.next();
		{ 
			if (capital.toLowerCase().equals("brasilia"))
			{
				System.out.println("Correcto");
				porce = porce + 20;	
			}
			else
				System.out.println("Incorrecto");

			//Se imprime cuarta pregunta y se determina una respuesta unica (berlin), si no es la respuesta correcta se imprime incorrecto//
			System.out.println("Capital de Alemania: ");
			capital= s.next();
		{ 
			if (capital.toLowerCase().equals("berlin"))
			{
				System.out.println("Correcto");
				porce = porce + 20;	
			}
			else
				System.out.println("Incorrecto");

			//Se imprime quinta pregunta y se determina una respuesta unica (bucarest), si no es la respuesta correcta se imprime incorrecto//
			System.out.println("Capital de Rumania: ");
			capital= s.next();
		{ 
			if (capital.toLowerCase().equals("bucarest"))
			{
				System.out.println("Correcto");
				porce = porce + 20;	
			}
			else
				
				System.out.println("BONO! Quien es el verdader dueño del anillo (Señor de los Anillos)?: ");
			capital= s.next();
		{ 
			if (capital.toLowerCase().equals("sauron"))
			{
				System.out.println("Correcto");
				porce = porce + 10;	
			}
			else	
				System.out.println("Incorrecto");
			//Se imprime el porcentaje//
		}
		//Se determina si el porcentaje es Excelente, muy bueno, o malo//
		{
			if (porce>=100)
			System.out.print(" Excelente :D");
			else if (porce>69)
			System.out.print(" Muy bien :)");
			else  
				System.out.print(" Malo :(");
		}
		}
		}
		}
		}
	}
}
