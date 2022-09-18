public class firstFileHomeWork {
    public static void main(String[] args) {
        // Вывод на экран текста "Hello World!"
        System.out.println("Hello world!");

        // Задание 2
        int x = 354;
        System.out.println(x);

        // Задание 3
        int count = 1;
        count = count + 1;
        count += 1;
        count++;
        ++count;
        System.out.println(count);

        // Задача 4
        int fVar = 10;
        int sVar = 23;
        int t = fVar;
        fVar = sVar;
        sVar = t;
        System.out.println("a = " + fVar + "b = " + sVar);
        fVar = 10;
        sVar = 23;
        fVar = fVar + sVar;
        sVar = fVar - sVar;
        fVar = fVar - sVar;
        System.out.println("a = " + fVar + "b = " + sVar);

        // Задача 5
        int a = 3;
        int b = 4;
        System.out.println("Гипотенуза равна - " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));

        // Задача 6
        int y = 3453376;
        System.out.println(y % 10);

        // Задача 7
        System.out.println(y / 10 % 10);

        // Задача 8
        int hj = 23;
        System.out.println(hj / 10 % 10);

        // Задача 9
        System.out.println(minus(hj));
        System.out.println(minus(524));
        System.out.println(minus(5));

        // Задача 10
        System.out.println(avg(56, 67));

        // Задача 11
        System.out.println(avgGeometry(56, 67));

        // Задача 12
        System.out.println(distanceBetweenPoints(1.2f, 2.3f, 1.3f, 2));
    }

    private static double distanceBetweenPoints(float x1, float y1, float x2, float y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static int minus(int x){
        return x - 21;
    }

    public static double avg(int x, int y){
        return (x + y) / 2f;
    }

    public static double avgGeometry(int x, int y){
        return Math.sqrt(x * y);
    }

}
