import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class EtudiantManagement implements Management {

    List<Etudiant> etudiants;

    @Override
    public void displayEtudiant(List<Etudiant> etudiants, Consumer<Etudiant> con) { etudiants.forEach(con); }

    public static void displayEtudiantsByFilter(List<Etudiant> etudiants, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        for (Etudiant etudiant : etudiants) {
            if (pre.test(etudiant)) { con.accept(etudiant);}
        }
    }

    @Override
    public String returnEtudiantsNames(List<Etudiant> etudiants, Function<Etudiant, String> fun) {return null;}

    @Override
    public Etudiant createEtudiant(Supplier<Etudiant> sup) {return null;}

    @Override
    public List<Etudiant> sortEtudiantsById(List<Etudiant> etudiants, Comparator<Etudiant> com) {return null;}

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> etudiants) { return null;}



}

