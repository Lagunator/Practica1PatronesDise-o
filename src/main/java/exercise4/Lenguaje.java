package exercise4;

public class Lenguaje extends Curso{
    @Override
    public void inscribir(Estudiante estudiante) {
        System.out.println("*******************************");
        System.out.println("El estudiante: "+estudiante.getNombre()+" con su CI: "
                +estudiante.getCi()+" fue exitosamente inscrito a Lenguaje.");
    }
}
