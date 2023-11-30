import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Federico Maiello", 28);
        List<Student> lista1 = new ArrayList<>();
//        lista1.add(student.name);
//        lista1.add(String.valueOf(student.age));
//        lista1.add("H 1.85");
//        lista1.add("Occhi marroni");
//        lista1.add("Capelli neri");
//        lista1.add("Colore preferito NERO");
//        lista1.add("Hobby Pianoforte");
//        lista1.add("Casata: Tasso rosso");
//        lista1.add("Film Harry Potter");
//        lista1.add("Istruzione: Diploma");
//        lista1.add("Futuro lavoro: Pensionato");
//        lista1.add("Id: 774");
        lista1.add(new Student("Giancarlo", 24));
        lista1.add(new Student("Francesco", 28));
        lista1.add(new Student("Marta", 26));
        lista1.add(new Student("Anna", 22));
        lista1.add(new Student("Giorgia", 25));
        lista1.add(new Student("Giulia", 24));
        lista1.add(new Student("Marco", 26));
        lista1.add(new Student("Luca", 22));
        lista1.add(new Student("Domenico", 20));
        lista1.add(new Student("Diana", 19));
        lista1.add(new Student("Ginevra", 22));
        lista1.add(new Student("Paolo", 26));


        System.out.println("Studenti: " + lista1);

        lista1.sort(Comparator.comparing(Student::getName));
        System.out.println("Studenti in ordine alfabetico: " + lista1);
    }
}