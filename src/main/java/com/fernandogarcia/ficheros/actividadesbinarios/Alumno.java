package com.fernandogarcia.ficheros.actividadesbinarios;

import java.io.Serializable;
import java.util.Scanner;

public class Alumno implements Serializable {

    private Scanner lector=new Scanner(System.in);

   public static int auto=0;

    private int posicion=++auto;
    private long exp_alumno;
    private String nom_alumno;
    private String fecha_conv_ord;
    private double nota_ord;
    private String fecha_conv_extra;
    private double nota_extra;


    public Alumno() {

    }

    public Alumno(int posicion, long exp_alumno, String nom_alumno, String fecha_conv_ord, double nota_ord, String fecha_conv_extra, double nota_extra) {

        this.posicion = posicion;
        this.exp_alumno = exp_alumno;
        this.nom_alumno = nom_alumno;
        this.fecha_conv_ord = fecha_conv_ord;
        this.nota_ord = nota_ord;
        this.fecha_conv_extra = fecha_conv_extra;
        this.nota_extra = nota_extra;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public long getExp_alumno() {
        return exp_alumno;
    }

    public void setExp_alumno(long exp_alumno) {
        this.exp_alumno = exp_alumno;
    }

    public String getNom_alumno() {
        return nom_alumno;
    }

    public void setNom_alumno(String nom_alumno) {
        this.nom_alumno = nom_alumno;
    }

    public String getFecha_conv_ord() {
        return fecha_conv_ord;
    }

    public void setFecha_conv_ord(String fecha_conv_ord) {
        this.fecha_conv_ord = fecha_conv_ord;
    }

    public double getNota_ord() {
        return nota_ord;
    }

    public void setNota_ord(double nota_ord) {
        this.nota_ord = nota_ord;
    }

    public String getFecha_conv_extra() {
        return fecha_conv_extra;
    }

    public void setFecha_conv_extra(String fecha_conv_extra) {
        this.fecha_conv_extra = fecha_conv_extra;
    }

    public double getNota_extra() {
        return nota_extra;
    }

    public void setNota_extra(double nota_extra) {
        this.nota_extra = nota_extra;
    }

    @Override
    public String toString() {
        return  "Alumno" +
                "Posicion" + posicion +
                "Expediente alumno" + exp_alumno +
                "Nombre alumno" + nom_alumno +
                "Fecha_convocatoria ordinaria" + fecha_conv_ord +
                "Nota ordinaria" + nota_ord +
                "Fecha convocatorioa extraordinaria" + fecha_conv_extra +
                "Nota extraordinaria=" + nota_extra;
    }
}
