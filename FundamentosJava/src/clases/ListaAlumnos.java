
package clases;

public class ListaAlumnos {
    //Constructor
    Alumno vAlumnos[];
    int contador;
    public ListaAlumnos() {
        vAlumnos = new Alumno[20];
    }
    
    public void insertarAlumno(Alumno alumno) {
        vAlumnos[contador] = alumno;
        contador++;
    }
    
}
