package exercise4;

public class LaunchCurso {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        est1.setNombre("Gabriel");
        est1.setCi("78456832");

        String curso = "matematicas";
        FactoryCurso.make(curso).inscribir(est1);

        Estudiante est2 = new Estudiante();
        est2.setNombre("Andres");
        est2.setCi("98900");

        String curso2 ="lenguaje";
        FactoryCurso.make(curso2).inscribir(est2);

        Estudiante est3 = new Estudiante();
        est3.setNombre("Rene");
        est3.setCi("7854326");

        String curso3 ="ingles";
        FactoryCurso.make(curso3).inscribir(est3);

        Estudiante est4 = new Estudiante();
        est4.setNombre("Monica");
        est4.setCi("490635");

        String curso4 ="historia";
        FactoryCurso.make(curso4).inscribir(est4);

        Estudiante est5 = new Estudiante();
        est5.setNombre("Marcos");
        est5.setCi("25933");

        String curso5 ="matematicas";
        FactoryCurso.make(curso5).inscribir(est5);
    }
}
