import java.util.Arrays;

public class Serie {

//TODO C: tendría que haber declarado constantes estaicas con 'public static final'

//TODO C: Tendría que haber tendría que haber inicializado aquí las variables, no en el principal;
    private String titulo;
    private int numCapitulos;
    private char genero;
    private String guionista;
    private String actores[]; //En el set y get también hay que poner corchetes en el array
    private float precio;

    /****************************CONSTRUCTORES***************/

    Serie() {
        /*TODO C: tenemos que poner el array aquí siempre, en nuestro constructor por defecto
        this.actores =  new String[TAMAÑO];
        Arrays.fill(this.actores,"");*/
    }

    //TODO C: cuando no tienes todos los datos, te coge todox lo que tengas en el constructor por defecto
    Serie (String titulo, String guionista){
        this.titulo=titulo;
        this.guionista=guionista;
        //this.actores =  new String[TAMAÑO];
        //Arrays.fill(this.actores,"");
    }

    Serie (String titulo,int numCapitulos,char genero,String guionista,String actores [],float precio) {
        //TODO C: Los string en java, por defecto es NULL;
        this.titulo=titulo;
        this.numCapitulos=numCapitulos;
        this.genero=genero;
        this.guionista=guionista;
        this.actores= actores;
        this.precio=precio;
        /*TODO C: el constructor de actores sería así:
        for(int i=0;i<actores.length;i++)
            if (actores[i] == null)
                actores[i]="";*/
    }

    /****************************SETTER*********************/
    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public void setNumCapitulos (int numCapitulos) {
        this.numCapitulos = numCapitulos;
    }

    public void setGenero (char genero) {
        this.genero = genero;
    }

    public void setGuionista (String guionista){
        this.guionista=guionista;
    }

    public void setActores (String actores[]) {
        this.actores=actores;
    }

    public void setPrecio (float precio) {
        this.precio=precio;
    }

    /****************************GETTER*********************/
    public String getTitulo() {
        return titulo;
    }

    public int getNumCapitulos() {
        return numCapitulos;
    }

    public char getGenero() {
        return genero;
    }

    public String getGuionista() {
        return guionista;
    }

    public String [] getActores() {
        return actores;
    }

    public float getPrecio() {
        return precio;
    }


    /****************************toString*********************/
    public String toString() //cómo detecta qué pintar por pantalla
    {
        return "La película es " + titulo + " del género " + genero +
                " con " + numCapitulos + " capitulos, " + "el guionista es " + guionista +
                " y los actores son: " + Arrays.toString(actores) + " con un precio de " + precio;
    }

}
