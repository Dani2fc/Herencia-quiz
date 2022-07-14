package Modelo;

public class Biblioteca{
    
    // ------------------
    // Atributos
    // ------------------

    private String nombreDeLibro;
    private String nombreDelAutor;
    private String nombre2doAutor;

    // ------------------
    // Métodos
    // ------------------

    // Constructor cómun
    public Biblioteca(String libro, String autor1, String autor2){
        this.nombreDeLibro = libro;
        this.nombreDelAutor = autor1;
        this.nombre2doAutor = autor2;
    }
    
    // Métodos de acceso

    public String getNombreDeLibro() {
        return nombreDeLibro;
    }
    public void setNombreDeLibro(String nombreDeLibro) {
        this.nombreDeLibro = nombreDeLibro;
    }

    public String getNombreDelAutor() {
        return nombreDelAutor;
    }
    public void setNombreDelAutor(String nombreDelAutor) {
        this.nombreDelAutor = nombreDelAutor;
    }

    public String getNombre2doAutor() {
        return nombre2doAutor;
    }
    public void setNombre2doAutor(String nombre2doAutor) {
        this.nombre2doAutor = nombre2doAutor;
    }
}