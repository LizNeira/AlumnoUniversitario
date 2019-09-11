/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import Ejercicio6.Orden;
import java.util.Scanner;

/**
 *
 * @author Liz Neira
 */
public class Main {
    public static void main(String[] args) {
         
        Scanner entrada =new Scanner(System.in);
        System.out.print("cantidad de alumno ");
        AlumnoUniversitario.setCantidadAlumnos(entrada.nextInt());
        entrada.nextLine();
        
        for (int i = 1; i <= AlumnoUniversitario.getCantidadAlumnos(); i++) {

        System.out.println("alumno: " + i);
        
        System.out.print(" INGRESE SU NOMBRE:  ");   
        AlumnoUniversitario.setNombre(entrada.nextLine());
        System.out.print(" INGRESE SU AÑO DE NACIMIENTO: ");
        AlumnoUniversitario.setFechaDenacimiento(entrada.nextInt());
        System.out.print(" INGRESE EL  AÑO DE INGRESO A LA FACULTAD: ");
        AlumnoUniversitario.setAñoIngresofacultad(entrada.nextInt());
        entrada.nextLine();
        System.out.println(" INGRESE EL NOMBRE  DE  LA CARRERA: ");
        AlumnoUniversitario.setCarrera(entrada.nextLine());
        System.out.println("INGRESE LA CANTIDAD DE MATERIAS A CURSAR:  ");
        AlumnoUniversitario.setCantidadDeMateriasPorCarrera(entrada.nextInt());
        System.out.println(" CANTIDA DE MATERIAS APROBADAS: ");
        AlumnoUniversitario.setMateriasAprobadas(entrada.nextInt());
        
        
            System.out.println("LISTA DEL ALUMNO:");
            System.out.println("El nombre del alumno: " + AlumnoUniversitario.getNombre());
            System.out.println("La edad del alumno: " + AlumnoUniversitario.EdadPersona()+" años");
            System.out.println("El año de ingreso a la facultad: "+AlumnoUniversitario.getAñoIngresofacultad());
            System.out.println("El Nombre de la carrera: "+AlumnoUniversitario.getCarrera());
            System.out.println("La cantidad de materias: "+AlumnoUniversitario.getCantidadDeMateriasPorCarrera());
            System.out.println("Cantidad de años cursados: "+AlumnoUniversitario.CantidadAñosFacultad());
            System.out.println("Materias que restan por aprobar: "+AlumnoUniversitario.MateriasPorAprobar());
            System.out.println("Porcentaje de materias aprobadas: "+AlumnoUniversitario.PorcentajeDeMateriasAprobadas()+"%");
            entrada.nextLine();
           
        }
    }
}
