package com.fernandogarcia.ficheros.serializaralumno;

import java.io.Serializable;

    public class Alumno implements Serializable {


        private String expediente;
        private String nombre;
        private String apellido;
        private int edad;
        private double nota;


        public Alumno() {
            super();
        }

        public Alumno(String expediente, String nombre, String apellido, int edad, double nota) {
            super();
            this.expediente = expediente;
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.nota = nota;
        }

        public String getExpediente() {
            return expediente;
        }

        public void setExpediente(String expediente) {
            this.expediente = expediente;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public double getNota() {
            return nota;
        }

        public void setNota(double nota) {
            this.nota = nota;
        }

        @Override
        public String toString() {
            return  "Alumno" +
                    "expediente" + expediente +
                    "nombre" + nombre +
                    "apellido" + apellido +
                    "edad" + edad +
                    "nota" + nota;
        }
    }
