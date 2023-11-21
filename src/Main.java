import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Federico Maiello", 28);
        List<String> lista1 = new ArrayList<>();
        lista1.add(student.name);
        lista1.add(String.valueOf(student.age));
        lista1.add("H 1.85");
        lista1.add("Occhi marroni");
        lista1.add("Capelli neri");
        lista1.add("Colore preferito NERO");
        lista1.add("Hobby Pianoforte");
        lista1.add("Casata: Tasso rosso");
        lista1.add("Film Harry Potter");
        lista1.add("Istruzione: Diploma");
        lista1.add("Futuro lavoro: Pensionato");
        lista1.add("Id: 774");

        System.out.println("Studente: " + lista1);

        Collections.sort(lista1);
        System.out.println("Studente in ordine alfabetico: " + lista1);
    }
}