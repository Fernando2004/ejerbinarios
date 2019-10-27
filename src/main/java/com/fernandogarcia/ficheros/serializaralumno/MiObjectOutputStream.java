package com.fernandogarcia.ficheros.serializaralumno;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MiObjectOutputStream extends ObjectOutputStream {


    public MiObjectOutputStream(FileOutputStream fos) throws IOException {
        super(fos);
    }
    public MiObjectOutputStream() throws SecurityException,IOException {
        super();
    }
    protected void writeStreamHeader(){

    }
}