public class Serie {
    private String titulo;
    private int numCapitulos;
    private char genero;
    private String guionista;
    private String actores; //En el set y get también hay que poner corchetes en el array
    private float precio;

    /****************************CONSTRUCTORES***************/
    Serie() {
    }

    Serie (String titulo, String guionista){
        this.titulo=titulo;
        this.guionista=guionista;
    }

    Serie (String titulo,int numCapitulos,char genero,String guionista,String actores,float precio) {
        this.titulo=titulo;
        this.numCapitulos=numCapitulos;
        this.genero=genero;
        this.guionista=guionista;
        this.actores=actores;
        this.precio=precio;
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

    public void setActores (String actores) {
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

    public String getActores() {
        return actores;
    }

    public float getPrecio() {
        return precio;
    }

}
