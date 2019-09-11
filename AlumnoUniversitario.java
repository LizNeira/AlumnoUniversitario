
package Ejercicio8;


public class AlumnoUniversitario {
     private static alumno[]alumnos;// creamos el arreglo
     private static String nombre;
     private static int  FechaDenacimiento;
     private static int AñoActual=2019;
     private static int AñoIngresofacultad;
     private static int MateriasAprobadas;
     private static String Carrera;
     private static int CantidadDeMateriasPorCarrera;
     private static int CantidadAlumnos;
     
     
     public static int EdadPersona(){
         int Edad=(AlumnoUniversitario.AñoActual-AlumnoUniversitario.FechaDenacimiento);
         return Edad;
         
     } 
     public static int CantidadAñosFacultad(){
         int cantidad;
         cantidad=AlumnoUniversitario.AñoActual-AlumnoUniversitario.AñoIngresofacultad;
         
         return cantidad;
         
     }
   public static int MateriasPorAprobar(){
       int TotalMaterias = 0;
       TotalMaterias=(AlumnoUniversitario.CantidadDeMateriasPorCarrera-AlumnoUniversitario.MateriasAprobadas);
       return TotalMaterias;
            
   }
   public static float  PorcentajeDeMateriasAprobadas(){
       float porcentaje;
          porcentaje=(AlumnoUniversitario.MateriasAprobadas*100)/AlumnoUniversitario.CantidadDeMateriasPorCarrera;
         return porcentaje;
       
   }
    public static alumno[] getAlumnos() {
        return alumnos;
    }

    public static void setAlumnos(alumno[] alumnos) {
        AlumnoUniversitario.alumnos = alumnos;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        AlumnoUniversitario.nombre = nombre;
    }

    public static int getFechaDenacimiento() {
        return FechaDenacimiento;
    }

    public static void setFechaDenacimiento(int FechaDenacimiento) {
        AlumnoUniversitario.FechaDenacimiento = FechaDenacimiento;
    }

    public static double getAñoIngresofacultad() {
        return AñoIngresofacultad;
    }

    public static void setAñoIngresofacultad(int AñoIngresofacultad) {
        AlumnoUniversitario.AñoIngresofacultad = AñoIngresofacultad;
    }

    public static int getMateriasAprobadas() {
        return MateriasAprobadas;
    }

    public static void setMateriasAprobadas(int MateriasAprobadas) {
        AlumnoUniversitario.MateriasAprobadas = MateriasAprobadas;
    }

    public static String getCarrera() {
        return Carrera;
    }

    public static void setCarrera(String Carrera) {
        AlumnoUniversitario.Carrera = Carrera;
    }

 

    public static int getCantidadAlumnos() {
        return CantidadAlumnos;
    }

    public static void setCantidadAlumnos(int CantidadAlumnos) {
        AlumnoUniversitario.CantidadAlumnos = CantidadAlumnos;
    }

    public static int getCantidadDeMateriasPorCarrera() {
        return CantidadDeMateriasPorCarrera;
    }

    public static void setCantidadDeMateriasPorCarrera(int CantidadDeMateriasPorCarrera) {
        AlumnoUniversitario.CantidadDeMateriasPorCarrera = CantidadDeMateriasPorCarrera;
    }
     
     
}
