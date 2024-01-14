import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество студентов:");
        int quanStudents = sc.nextInt();

        ArrayList<Student> univ = new ArrayList<Student>();


        // Предполагается, что у класса Student есть соответствующий конструктор
        Student Andej = new Student("Andrej", 345);
        univ.add(Andej);

        System.out.println("All points: ");
        for (int i = 0; i < 4; ++i) {
            System.out.print(Andej.getPoints()[i] + "\t");
        }

        System.out.println("Max point: ");

        for (int i = 0; i < 4; ++i) {
            System.out.print(Andej.getPoints()[i] + "\t");
        }

        // Здесь можно добавить дополнительный код, если требуется
        sc.close(); // Закрываем сканер после использования
    }
}
