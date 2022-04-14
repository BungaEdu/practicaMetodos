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
        }

        System.out.print("Precio: ");
        float precio = sc.nextFloat();
        objeto3.setPrecio(precio);

        System.out.println(objeto3);
    }
}
