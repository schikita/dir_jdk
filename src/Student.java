import java.util.random.*;
import java.math.*;
import java.util.Random;
public class Student {
    private String name; // Убрать static
    private int nGroup;
    private int[] points;
    private float av_p;

    public String getName() {
        return name;
    }

    public int getnGroup() {
        return nGroup;
    }

    public int[] getPoints() {
        // Возвращаем копию массива, чтобы предотвратить изменение внешним кодом
        if (this.points == null) {
            return null; // или return new int[0]; если предпочитаете возвращать пустой массив
        }
        return this.points.clone();
    }

    public  void av_p() {
        float sum = 0;
        for (int e : points) {
            sum += e;
        }
        av_p = sum / points.length;
    }

    Student() {};

    public Student(String s, int n) {
        this.name = s;
        this.nGroup = n;
        this.points = new int[4]; // Инициализируйте массив
        Random random = new Random(); // Создание объекта Random
        for (int i = 0; i < 4; ++i) {
            this.points[i] = random.nextInt(10); // Генерация случайного числа от 0 до 99
        }
    }



}

