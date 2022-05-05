import org.apache.groovy.contracts.common.impl.ClassInvariantAnnotationProcessor;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] Arg) {

        String [] actores = {"","","","",""};

        Serie objeto1 = new Serie();

        Serie objeto2 = new Serie("","");

        Serie objeto3 = new Serie("",10,'D',"",actores,0);

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime los siguientes datos a rellenar: ");

        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        objeto3.setTitulo(titulo);

        System.out.print("Número de capitulos: ");
        int numCapitulos = sc.nextInt();
        objeto3.setNumCapitulos(numCapitulos);

        System.out.print("Género, los únicos géneros correctos son: ");
        System.out.print("D (Drama), S (Suspense), C (Comedia) y T (Terror): ");
        char genero = sc.next().charAt(0);
        while (genero!='D' && genero!='S' && genero!='C' && genero!='T') {
            System.out.print("Por favor, escribe un caracter correcto: ");
            genero = sc.next().charAt(0);
        }
        objeto3.setGenero(genero);

        System.out.print("Guionista: \n");

        String guionista = sc.nextLine();
        objeto3.setGuionista(guionista);

        System.out.print("Actores: ");
        for (int i=0;i< actores.length;i++) {
            actores [i]= sc.nextLine();
            objeto3.setActores(actores);
            /*TODO C: tienes que meter datos y cuando no quieres sehir sólo tienes que meter el retorno
            Actor 1: Tom cruise
            Actor 2: Ariana
            Actor 3: ""
            Es decir, meto la cadena vacía
            La cadena vacía vale con el tamaño de cadena=0 o con el equals*/
            //TODO C:el bucle es:
             /*do {
                 System.out.println("Actor: ");
                 s1.getActores()[i] = sc.nextLine();
                 retorno = sc.nextLine();
                     i++;
             } while (!retorno.equalsIgnoreCase("") && i< serie.MAXACTORS);*/
        }

        System.out.print("Precio: ");
        float precio = sc.nextFloat();
        objeto3.setPrecio(precio);

        System.out.println(objeto3);
    }
}


/*TODO: CRITERIOS:
- Atributos por defecto 1/1.
- Cada constructor 1 punto: 1/3.
- metodo get 1 punto, metodo set 1 punto: 2/2
- Metodo princial, generado todos los objetos: 1/1;
- He modificado todos los objectos: 1/1;
- He impreso el objeto por pantalla: 1/1;
- He pedido a los actores bien: 0/1;
- Entregado en plazo 1 punto extra: 1/1;
 */
