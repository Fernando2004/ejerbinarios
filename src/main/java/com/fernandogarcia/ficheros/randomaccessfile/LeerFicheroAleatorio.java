package com.fernandogarcia.ficheros.randomaccessfile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LeerFicheroAleatorio {

    static RandomAccessFile randomAccessFile;

    public static void principal() throws IOException {

        File archivo=new File("C:\\Users\\usuario\\Desktop\\textoEje.txt");

            //ponemos el archivo y lo que queremos hacer ("r" Leer),("wr"Leer y escribir);
        RandomAccessFile raf=new RandomAccessFile(archivo,"r");

        //System.out.println("");


        char nombre[]=new char[10],aux;
        int id,posicion;

        posicion=0;

        raf.seek(posicion);

        posicion=raf.readInt();

        for (int i=0;i<nombre.length;i++){
            aux=raf.readChar();
            nombre[i]=aux;
        }

        String ciudades=new String(nombre);

        System.out.println(nombre);
    }
}
