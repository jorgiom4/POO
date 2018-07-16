package com.instancia2.ejercicio03_bibioteca;

public class Libro extends Producto {

    private String edicion;
    private String isbn;
    private String autor;


    public Libro(String nombreProducto, String fechaPublicacion, String edicion, String isbn, String autor) {
        super(nombreProducto, fechaPublicacion);
        this.edicion = edicion;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


}
