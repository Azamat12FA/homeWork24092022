package exercise2;

import java.util.Scanner;

public class Vectors {

    public static void main(String[] args) {
        Vector firstVector = initVector();
        Vector secondVector = initVector();
        print(firstVector.getCoordinateVector());
        System.out.println("Длина вектора равна: \n" + firstVector.lengthVector());
        System.out.println("Скалярное произведение векторов равно: ");
        System.out.println(scalarProductVectors(firstVector, secondVector));
        vectorProduct(firstVector, secondVector);
        System.out.println("Косинус угла равен: \n" + cosineAngleBetweenVectors(scalarProductVectors(firstVector, secondVector),
                firstVector.lengthVector(), secondVector.lengthVector()));
        System.out.println("Сумма векторов равна: ");
        print(sumVector(firstVector, secondVector));
        System.out.println("Разность векторов равна: ");
        print(subtractingVector(firstVector, secondVector));
    }

    public static int scalarProductVectors(Vector fVector, Vector sVector) {
        return fVector.getxCoordinateVector() * sVector.getxCoordinateVector() + fVector.getyCoordinateVector() *
                sVector.getyCoordinateVector() + fVector.getzCoordinateVector() * sVector.getzCoordinateVector();
    }

    public static void vectorProduct(Vector fVector, Vector sVector) {
        System.out.println("Векторное произведение векторов равно: ");
        int[] res = new int[3];
        res[0] = fVector.getyCoordinateVector() * sVector.getzCoordinateVector() -
                fVector.getzCoordinateVector() * sVector.getyCoordinateVector();
        res[1] = fVector.getxCoordinateVector() * sVector.getzCoordinateVector() -
                fVector.getzCoordinateVector() * sVector.getxCoordinateVector();
        res[2] = fVector.getxCoordinateVector() * sVector.getyCoordinateVector() -
                fVector.getyCoordinateVector() * sVector.getxCoordinateVector();
        System.out.printf("%si %s %sj %s %sk", res[0], res[1] > 0 ? "-" : "+", Math.abs(res[1]), res[2] > 0 ? "+" : "-", Math.abs(res[2]));
        System.out.println();
    }

    public static double cosineAngleBetweenVectors(int scProduct, double lenFirstVector, double lenSecondVector) {
        return scProduct / (Math.abs(lenFirstVector) * Math.abs(lenSecondVector));
    }

    public static int[] sumVector(Vector fVector, Vector sVector) {
        int[] res = new int[3];
        res[0] = fVector.getxCoordinateVector() + sVector.getxCoordinateVector();
        res[1] = fVector.getyCoordinateVector() + sVector.getyCoordinateVector();
        res[2] = fVector.getzCoordinateVector() + sVector.getzCoordinateVector();
        return res;
    }

    public static int[] subtractingVector(Vector fVector, Vector sVector){
        int[] res = new int[3];
        res[0] = fVector.getxCoordinateVector() - sVector.getxCoordinateVector();
        res[1] = fVector.getyCoordinateVector() - sVector.getyCoordinateVector();
        res[2] = fVector.getzCoordinateVector() - sVector.getzCoordinateVector();
        return res;
    }

    public static void print(int[] coordVector) {
        for (int j : coordVector) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static int[] parseCoordinate(String[] coord) {
        int[] res = new int[coord.length];
        for (int i = 0; i < coord.length; i++) {
            if (coord[i].contains("-")) {
                res[i] = Integer.parseInt(coord[i].substring(1)) * (-1);
            } else {
                res[i] = Integer.parseInt(coord[i]);
            }
        }
        return res;
    }

    public static Vector initVector() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координаты вектора через запятую, например, 'x1,x2,y1,y2,z1,z2': ");
        return new Vector(parseCoordinate(in.next().split(",")));
    }

}
