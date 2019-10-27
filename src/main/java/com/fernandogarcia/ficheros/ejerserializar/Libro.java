package com.fernandogarcia.ficheros.ejerserializar;

import java.io.Serializable;

public class Libro implements Serializable {

    int isbn;
    String titulo;

    public Libro() {

    }

    public Libro(int isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
    }


    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "\nisbn= " + isbn +
                "\ntitulo=" + titulo;
    }
}
