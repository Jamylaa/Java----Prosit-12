import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
 //@FunctionalInterface
public interface Management {


    void displayEtudiant(List<Etudiant> etudiants, Consumer<Etudiant> con);

     default void displayEtudiantsByFilter(List<Etudiant> etudiants, Predicate<Etudiant> pre, Consumer<Etudiant> con) {

     }

     String returnEtudiantsNames(List<Etudiant> etudiants, Function<Etudiant, String> fun);
    Etudiant createEtudiant(Supplier<Etudiant> sup);
    List<Etudiant> sortEtudiantsById(List<Etudiant> etudiants, Comparator<Etudiant> com);
    Stream<Etudiant> convertToStream(List<Etudiant> etudiants);



}