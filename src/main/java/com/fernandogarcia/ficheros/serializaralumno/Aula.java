package com.fernandogarcia.ficheros.serializaralumno;

import com.fernandogarcia.ficheros.ejerserializar.MiObjectOutputStream;

import java.io.*;
import java.util.ArrayList;

public class Aula {

    //para guardar los Alumnos que vienen del fichero creamos un lista

    public static ArrayList<Alumno> listaLibros = new ArrayList<Alumno>();

    public static void principal() throws IOException, FileNotFoundException {

        //primero creamos alumnos
        //file con la ruta relativa

        File file=new File("FichAlumno.dat");
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
        //---------------------------------------------------------------
        //-----------------------Objetos---------------------------

        Alumno alu1=new Alumno("111","Ana","Anazalez",14,5.5);
        Alumno alu2=new Alumno("222","Luis","Luizalez",21,6);
        Alumno alu3=new Alumno("333","Pedro","Pedrozalez",16,7.5);
        Alumno alu4=new Alumno("444","Juan","Juanzalez",19,5.9);
        Alumno alu5=new Alumno("555","Paco","Pacozalez",22,8);

        //-------------------Llamaos al oos que los escribe para pasarlos al archivo articulos--------------------------------------
        //--------------------------Serializamos--------------------------------
        oos.writeObject(1);
        oos.writeObject(2);
        oos.writeObject(3);
        oos.writeObject(4);

        //------------------------Deserializamos----------------------------------


        //-------el flujo de entrada ---------------
        FileInputStream fis = new FileInputStream(file);

        //-----------El objet pasandole el flujo
        ObjectInputStream ois = new ObjectInputStream(fis);


        Alumno alumno = null;

        try{

            while(true){
                alumno=(Alumno) ois.readObject();
                listaLibros.add(alumno);
            }
        }
        catch (EOFException eof){
            eof.getMessage();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois!=null)
                ois.close();
        }

        System.out.println(listaLibros.toString());


    }

}
