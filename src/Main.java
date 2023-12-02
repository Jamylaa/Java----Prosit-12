import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class Main { public static void main(String[] args) {

    //List<Etudiant> etudiantList = new ArrayList<>();

    Etudiant e1 =new Etudiant(1,"Jamila",22);
    Etudiant e2 =new Etudiant(2,"Emna",20);
    Etudiant e3 =new Etudiant(3,"Bechir",27);
    Etudiant e4 =new Etudiant(4,"Karim",29);
    Etudiant e5 =new Etudiant(5,"Ahmed",21);
    Etudiant e6 =new Etudiant(6,"Jamila",20);
    Etudiant e7 =new Etudiant(7,"Yassmine",20);
    Etudiant e8 =new Etudiant(8,"Kaaboura",21);


    // Création d'une liste d'étudiants
    List<Etudiant> etudiantsList = Arrays.asList(e1,e2,e3,e4,e5,e6,e7);

    // Création d'une instance de StudentManagement
   EtudiantManagement etudiantManagement = new EtudiantManagement();


    // Affichage de tous les étudiants
    System.out.println(" Liste de tous les étudiants : ");
    etudiantManagement.displayEtudiant(etudiantsList, System.out::println);


    // Affichage des étudiants ayant un âge supérieur à 21 ans
    System.out.println("\nListe des étudiants ayant un âge supérieur à 21 ans :");
    EtudiantManagement.displayEtudiantsByFilter(etudiantsList, etudiant -> etudiant.getAge() > 21, System.out::println);

    // Création d'un nouvel étudiant à partir d'une méthode de création
    Etudiant newetudiant = etudiantManagement.createEtudiant(() -> new Etudiant(4, " David ", 23));
    System.out.println("\n Nouvel étudiant créé : " + newetudiant );

    // Tri des étudiants par ID
    List<Etudiant> sortedStudents = etudiantManagement.sortEtudiantsById(etudiantsList, Comparator.comparing(Etudiant::getId));
    System.out.println("\nListe des étudiants triés par ID :");
    etudiantManagement.displayEtudiant(sortedStudents, System.out::println);



    /*
    // Conversion de la liste d'étudiants en flux
    System.out.println("\n Conversion de la liste d'étudiants en flux :");
    EtudiantManagement.convertToStream(etudiantsList).forEach(System.out::println);


     */
    // Récupération des noms des étudiants
    String etudiantNames = etudiantManagement.returnEtudiantsNames(etudiantsList, Etudiant::getNom);
    System.out.println("\nNoms des étudiants : " + etudiantNames);



}
}


