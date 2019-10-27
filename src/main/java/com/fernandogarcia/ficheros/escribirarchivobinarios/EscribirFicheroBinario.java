package com.fernandogarcia.ficheros.escribirarchivobinarios;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirFicheroBinario {

    //FileOutPutStream   (flujo de salida)

    public static void principal()throws IOException {

        File file = new File("C:\\Users\\usuario\\Desktop\\texto.txt");

        FileOutputStream fileOS = new FileOutputStream(file);

        //int i;
        for (int i=1;i<=10;i++){
            fileOS.write(i);
        }

        System.out.println("Cerramos el flujo");
        fileOS.close();
    }

}
