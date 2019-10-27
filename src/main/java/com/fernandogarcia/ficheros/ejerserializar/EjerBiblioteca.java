package com.fernandogarcia.ficheros.ejerserializar;

import java.io.*;
import java.util.ArrayList;

public class EjerBiblioteca {

    //para guardar los libros que vienen del fichero creamos un lista

    public static ArrayList<Libro> listaLibros = new ArrayList<Libro>();

    public static void principal() throws IOException, ClassNotFoundException {
        //primero creamos libros
        //file con la ruta relativa

        File file=new File("articulos.dat");
        // Creamos el flujo de escritura
        FileOutputStream fos;
        //Escritor de objetos
        ObjectOutputStream oos;

        if(!file.exists()) {
            fos=new FileOutputStream(file);
            oos=new ObjectOutputStream(fos);
        }else {
            fos=new FileOutputStream(file,true);
            oos=new MiObjectOutputStream(fos);
        }
        //-----------------------Objetos---------------------------

        Libro l1=new Libro(1,"Los tres Mosqueperros");
        Libro l2=new Libro(2,"Los Pirtas del caribe");
        Libro l3=new Libro(3,"Tom Sallers");
        Libro l4=new Libro(4,"Doraemon");

        //-------------------Llamaos al oos que los escribe para pasarlos al archivo articulos--------------------------------------
        //--------------------------Serializamos--------------------------------
        oos.writeObject(l1);
        oos.writeObject(l2);
        oos.writeObject(l3);
        oos.writeObject(l4);


        //------------------------Deserializamos----------------------------------


        //-------el flujo de entrada ---------------
        FileInputStream fis = new FileInputStream(file);

        //-----------El objet pasandole el flujo
        ObjectInputStream ois = new ObjectInputStream(fis);



        Libro libro = null;

        try{

            while(true){
                libro=(Libro) ois.readObject();
                listaLibros.add(libro);
            }
        }
        catch (EOFException e){ }

        finally {
            if (ois!=null)
                ois.close();
        }

        System.out.println(listaLibros.toString());

    }
}
