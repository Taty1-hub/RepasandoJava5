package com.company;

import com.company.Modelos.Alumno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
        SimpleDateFormat objSDF= new SimpleDateFormat("dd-MM-yyyy");
        Date fechaNacimiento=null;
        try {
            fechaNacimiento = objSDF.parse("20-08-1981");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Alumno alumno=new Alumno("Juan","Perez",fechaNacimiento,"36141825M" );
        System.out.println(alumno.toString());
        System.out.println("La edad de "+alumno.getNombre()+ " es: "+alumno.getEdad2());

    }

}
