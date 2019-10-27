package com.fernandogarcia.ficheros.leerarchivobinarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerFicheroBinario {

    //FileInPutStream   (flujo de entrada)

    public static void principal()throws IOException {

        File file = new File("C:\\Users\\usuario\\Desktop\\texto.txt");

        FileInputStream fileIS = new FileInputStream(file);

        int i;
        while ((i = fileIS.read())!= -1){
            System.out.println(i);
        }

        System.out.println("Cerramos el flujo");
        fileIS.close();
    }
}
