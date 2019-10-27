package com.fernandogarcia.ficheros.randomaccessfile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EscribirFicheroAleatorio {

    public static void principal(String[] args) throws IOException {

        File archivo = new File("C:\\Users\\usuario\\Desktop\\textoEje.txt");

        //ponemos el archivo y lo que queremos hacer ("r" Leer),("wr"Leer y escribir);

        RandomAccessFile raf=new RandomAccessFile(archivo,"rw");

        String[] ciudades={"Denia","Hodara","Xabia"};
        //int[] poblacion = {46000,10000,30000};


        StringBuffer buffer=null;

        for (int i=0;i< ciudades.length;i++){

            //para empezar por uno
            raf.writeInt(i+1);
            buffer =new StringBuffer(ciudades[i]);
            buffer.setLength(10);//fijamos 10 caracteres

            raf.writeChars(buffer.toString());

            raf.writeUTF(ciudades[i]);

            //raf.writeInt(poblacion[i]);



        }
        System.out.println("Flujo Cerrado correctamente");
        raf.close();


    }
}
