import java.util.Scanner;

public class Principal {
    public static void main(String[] Arg) {

        Serie objeto1 = new Serie();

        Serie objeto2 = new Serie("","");

        Serie objeto3 = new Serie("",10,'D',"","",0);

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime los siguientes datos a rellenar: ");

        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        objeto3.setTitulo(titulo);

        System.out.print("Número de capitulos: ");
        int numCapitulos = sc.nextInt();
        objeto3.setNumCapitulos(numCapitulos);

        System.out.print("Género: ");
        char genero = sc.next().charAt(0);
        objeto3.setGenero(genero);

        System.out.print("Guionista: ");
        String guionista = sc.nextLine();
        objeto3.setGuionista(guionista);

        System.out.print("Actores: ");
        String actores = sc.nextLine();
        objeto3.setActores(actores);

        System.out.print("Precio: ");
        float precio = sc.nextFloat();
        objeto3.setPrecio(precio);

        System.out.println(objeto3);
    }
}
