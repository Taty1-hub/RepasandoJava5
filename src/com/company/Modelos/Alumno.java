package com.company.Modelos;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Alumno {
    private String nombre;
    private String apellidos;
    private Date fechaNacimiento;
    private String dni;

    public Alumno(String nombre, String apellidos, Date fecha_Nacimiento, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fecha_Nacimiento;
        this.dni = dni;
    }



    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha_Nacimiento=" + fechaNacimiento +
                ", dni='" + dni + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha_Nacimiento() {
        return fechaNacimiento;
    }

    public void setFecha_Nacimiento(Date fecha_Nacimiento) {
        this.fechaNacimiento = fecha_Nacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad2(){
        Calendar today = Calendar.getInstance();
        Calendar c = new GregorianCalendar();
        c.setTime(this.fechaNacimiento);
        int diffYear = today.get(Calendar.YEAR) - c.get(Calendar.YEAR);
        int diffMonth = today.get(Calendar.MONTH) -c.get(Calendar.MONTH);
        int diffDay = today.get(Calendar.DAY_OF_MONTH) - c.get(Calendar.DAY_OF_MONTH);
        // Si está en ese año pero todavía no los ha cumplido
        if (diffMonth < 0) diffYear -=1;
        if (diffMonth == 0)
            if (diffDay < 0) diffYear -=1;
        return diffYear;
    }

}
