package com.fernandogarcia.ficheros.leerarchivobinarios;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class LeerAccesoAleatorio {

    static Scanner lector =new Scanner(System.in);

    public static void principal() throws IOException {


        File fichero = new File("C:\\Users\\usuario\\Desktop\\textoEjer00.txt");

        RandomAccessFile raf = new RandomAccessFile(fichero, "rw"); //para escribir rw
        System.out.println("dime el codigo");

        int cd = lector.nextInt();
        boolean encontrado;

        int id,posicion;

        char nombre[] = new char[10];
        char aux;

        posicion = 0;

        // recorre el fichero

        raf.seek(posicion);

        id = raf.readInt();

        for (int i = 0; i < nombre.length; i++) {
            aux = raf.readChar();
            nombre[i] = aux;//guado en el array
        }

        String ciudades = new String(nombre);

    }
}
