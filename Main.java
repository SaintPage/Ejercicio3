//En este programa se llevara acabo el menu y la logica del programa, el programa recibe las notas de las clases
// para lueego calcular y ver los resultados de los examenes con las estadisticas solicitadas, tambien
// ver las estadisticas especificas de una sede. ver las notas mas altas y bajas de cada examen.
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        NotaResaltante notasMayoresMenores = new NotaResaltante();
        while (!salir) {
            mostrarMenu();
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    Estudiante estudiante = new Estudiante();
                    System.out.println("Ingrese el nombre del estudiante: ");
                    Scanner sch = new Scanner(System.in);
                    String nombre = sch.nextLine();
                    System.out.println("Ingrese el apellido del estudiante: ");
                    String apellido = sch.nextLine();
                    System.out.println("Ingrese la fecha de nacimiento del estudiante: ");
                    String fechaNacimiento = sch.nextLine();
                    System.out.println("Ingrese el correo del estudiante: ");
                    String correo = sch.nextLine();
                    System.out.println("Ingrese el codigo del estudiante: ");
                    String codUnico = sch.nextLine();
                    System.out.println("Ingrese la sede del estudiante: ");
                    int sede = sch.nextInt();
                    // guardar los datos del estudiante
                    estudiante.setNombre(nombre);
                    estudiante.setApellido(apellido);
                    estudiante.setFechaNacimiento(fechaNacimiento);
                    estudiante.setCorreo(correo);
                    estudiante.setCodUnico(codUnico);
                    estudiante.setSede(sede);
                    estudiantes.add(estudiante);
                    System.out.println("Estudiante agregado");
                    break;

                case 2:
                    System.out.println("Escoga al estudiante a ingresar notas: ");
                    for(int i=0; i<estudiantes.size(); i++){
                        System.out.println((i+1) +". " + estudiantes.get(i));
                    }
                    int numEstudiante = sc.nextInt() - 1;
                    Estudiante nombEstudiante = estudiantes.get(numEstudiante);

                    System.out.println("Ingrese la nota de matematica: ");
                    int matematica = sc.nextInt();
                    notasMayoresMenores.compararNota(matematica, nombEstudiante.getNombre(), "Matematicas");
                    System.out.println("Ingrese la nota de lenguaje: ");
                    int lenguaje = sc.nextInt();
                    notasMayoresMenores.compararNota(lenguaje, nombEstudiante.getNombre(), "lenguaje");
                    System.out.println("Ingrese la nota de quimica: ");
                    int quimica = sc.nextInt();
                    notasMayoresMenores.compararNota(quimica, nombEstudiante.getNombre(), "Quimica");
                    System.out.println("Ingrese la nota de fisica: ");
                    int fisica = sc.nextInt();
                    notasMayoresMenores.compararNota(fisica, nombEstudiante.getNombre(), "Fisica");
                    System.out.println("Ingrese la nota de compresion lectora: ");
                    int compresionLectora = sc.nextInt();
                    notasMayoresMenores.compararNota(compresionLectora, nombEstudiante.getNombre(), "Comprension Lectora");
                    System.out.println("Ingrese la nota de estadistica: ");
                    int estadistica = sc.nextInt();
                    notasMayoresMenores.compararNota(estadistica, nombEstudiante.getNombre(), "Estadistica");

                    Examen examen = new Examen(matematica, lenguaje, quimica, fisica, compresionLectora, estadistica);
                    nombEstudiante.setResultadosExamen(examen);
                    break;
                case 3:
                    System.out.println("Escoga el estudiante para ver sus estadisticas: ");
                    for(int i=0; i<estudiantes.size(); i++){
                        System.out.println((i+1) +". " + estudiantes.get(i));
                    }

                    int numEstudiante2 = sc.nextInt() - 1;
                    Estudiante nombEstudiante2 = estudiantes.get(numEstudiante2);

                    Estadistica estadistica1 = new Estadistica(nombEstudiante2.getResultadosExamen());
                    System.out.println("Las estadisiticas del estudiante "+nombEstudiante2.getNombre()+ " son:");
                    estadistica1.getPromedio();
                    estadistica1.getMediana();
                    estadistica1.getModa();
                    estadistica1.getDesviacionEstandar();
                    break;
                case 4:
                    notasMayoresMenores.getNotaMayor();
                    notasMayoresMenores.getNotaMenor();
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");

            }
            System.out.println("-----------------------------");
        }
    }

    public static void mostrarMenu() {
        System.out.println("Elija una opcion");
        System.out.println("1. Registrar un nuevo estudiante.");
        System.out.println("2. Ingresar los resultados de un examen para un estudiante existente.");
        System.out.println("3. Ver estadísticas generales de los resultados de los exámenes");
        System.out.println("4. Ver las notas más altas y bajas de cada examen ");
        System.out.println("5. Agregar una nueva sede ");
        System.out.println("6. Cerrar el programa");

    }
}

