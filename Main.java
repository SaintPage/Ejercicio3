////Ángel de Jesús Mérida Jiménez Carné:23661
//En este programa se llevara acabo el menu y la logica del programa, el programa recibe las notas de las clases
// para lueego calcular y ver los resultados de los examenes con las estadisticas solicitadas, tambien
// ver las estadisticas especificas de una sede. ver las notas mas altas y bajas de cada examen.

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        //Lista de estudiantes
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        //Creamos un objeto de notas 
        NotaResaltante notasMayoresMenores = new NotaResaltante();
        //Lista de sedes
        ArrayList<Sede> sedes = new ArrayList<Sede>();
        //Agregamos a la lista de sedes la sede principal con el numero 1
        sedes.add(new Sede("Principal", 1));
        while (!salir) {
            mostrarMenu();
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    //Creanis nuevo objeto estudiante
                    Estudiante estudiante = new Estudiante();
                    //Preguntamos al usuario ingresar sus datos:
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
                    System.out.println("Escoga la sede del estudiante: ");
                    // Buscamos sedes para mostrar las sedes disponibles
                    for (int i=0; i<sedes.size(); i++){
                        System.out.println((i+1) + ". "+ sedes.get(i).getNombre());
                    }
                    int sede = sch.nextInt() - 1;
                    // guardar los datos del estudiante con su respectivo set
                    estudiante.setNombre(nombre);
                    estudiante.setApellido(apellido);
                    estudiante.setFechaNacimiento(fechaNacimiento);
                    estudiante.setCorreo(correo);
                    estudiante.setCodUnico(codUnico);
                    estudiante.setSede(sedes.get(sede));
                    estudiantes.add(estudiante);
                    System.out.println("Estudiante agregado");
                    break;

                case 2:
                // opcion dos para desplegar los usuarios registrados
                    System.out.println("Escoga al estudiante a ingresar notas: ");
                    for(int i=0; i<estudiantes.size(); i++){
                        Estudiante temp = estudiantes.get(i);
                        System.out.println((i+1) +". Estudiante: " + temp.getNombre() + " " +temp.getApellido() + ", codigo unico: "
                                + temp.getCodUnico() + " de la sede: " + temp.getSede().getNombre() );
                    }
                    //posicion -1 para que sea el primer estudiante a escoger 
                    int numEstudiante = sc.nextInt() - 1;
                    Estudiante nombEstudiante = estudiantes.get(numEstudiante);
                    
                    // Se ingresan las notas del estudiante seleccionado:
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

                    //Creamos nuevo objeto que almacena las notas
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
                    // Mostramos las estadisticas 
                    estadistica1.getPromedio();
                    estadistica1.getMediana();
                    estadistica1.getModa();
                    estadistica1.getDesviacionEstandar();
                    break;
                case 4:
                    // obtenemos la nota mayor y menor
                    notasMayoresMenores.getNotaMayor();
                    notasMayoresMenores.getNotaMenor();
                    break;
                case 5:
                    //Agregar nueva sede
                    System.out.println("Ingrese el nombre de la sede: ");
                    //cambiamos nombre de variable para funcionar Scanner
                    Scanner sche = new Scanner(System.in);
                    String nombreSede = sche.nextLine();
                    System.out.println("Ingrese el numero de la sede");
                    int numeroSede = sche.nextInt();
                    //Nuevo objeto de sede
                    Sede sede1 = new Sede(nombreSede, numeroSede);
                    //Agregamos a la lista los datos guardados de sede1
                    sedes.add(sede1);

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

    //Opciones disponibles: 
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

