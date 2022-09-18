package exercise1;

import java.util.Scanner;

public class Matrices {

    // Метод для превращения строкового числа в числовой тип
    public static int[][] parse(int rowMatrix, int columnMatrix, String[] arrayStr) {
        int[][] result = new int[rowMatrix][columnMatrix];
        int k = 0;
        for (int i = 0; i < rowMatrix; i++) {
            for (int j = 0; j < columnMatrix; j++) {
                result[i][j] = Integer.parseInt(arrayStr[k]);
                k++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Объявление первой матрицы
        Matrix firstMatrix = initMatrix();
        printMatrix(firstMatrix);

        // Объявление второй матрицы
        Matrix secondMatrix = initMatrix();
        printMatrix(secondMatrix);

        // Сложение матриц
        printMatrix(additionMatrix(firstMatrix, secondMatrix));

        // Разность матриц
        printMatrix(subtractionMatrix(firstMatrix, secondMatrix));

        // Умножение матрицы на число
        Matrix mByNumberMatrix = initMatrix();
        System.out.print("Введите на какое число умножить матрицу: ");
        int number = in.nextInt();
        printMatrix(multiplicationByNumberMatrix(mByNumberMatrix, number));

        // Произведение двух матриц
        printMatrix(multiplicationMatrix(firstMatrix, secondMatrix));

        // Возведение матрицы
        Matrix rByNumberMatrix = initMatrix();
        System.out.print("Введите на какое число возвести матрицу: ");
        int num = in.nextInt();
        printMatrix(raisingMatrix(rByNumberMatrix, num));

        // Транспонирование матрицы
        Matrix tranMatrix = initMatrix();
        printMatrix(tranMatrix);
        printMatrix(transpositionMatrix(tranMatrix));

    }

    // Создание, инициализация матрицы
    public static Matrix initMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во строк в матрице: ");
        int rowMatrix = in.nextInt();
        System.out.print("Введите кол-во столбцов в матрице: ");
        int columnMatrix = in.nextInt();
        System.out.print("Введите все значения матрицы, через запятую (','): ");
        return new Matrix(rowMatrix, columnMatrix, parse(rowMatrix, columnMatrix, in.next().split(",")));
    }

    // Метод выводяий в консоль матрицу
    public static void printMatrix(Matrix matrix) {
        int[][] result = matrix.getMatrix();
        for (int i = 0; i < matrix.getRow(); i++) {
            for (int j = 0; j < matrix.getColumn(); j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Сложение матриц
    public static Matrix additionMatrix(Matrix fMatrix, Matrix sMatrix) {
        System.out.println("Сложение двух матриц: ");
        int row_fMatrix = fMatrix.getRow();
        int column_fMatrix = fMatrix.getColumn();
        int row_sMatrix = sMatrix.getRow();
        int column_sMatrix = sMatrix.getColumn();
        int[][] result = null;
        if ((row_fMatrix != row_sMatrix) || (column_fMatrix != column_sMatrix)) {
            System.out.println("К сожалению нельзя складывать матрицы с разными размерностями. Попробуйте ещё раз");
            System.exit(0);
        } else {
            result = new int[row_fMatrix][column_fMatrix];
            for (int i = 0; i < row_fMatrix; i++) {
                for (int j = 0; j < column_fMatrix; j++) {
                    result[i][j] = fMatrix.getMatrix()[i][j] + sMatrix.getMatrix()[i][j];
                }
            }
        }
        return new Matrix(row_fMatrix, column_fMatrix, result);
    }

    // Разность матриц
    public static Matrix subtractionMatrix(Matrix fMatrix, Matrix sMatrix) {
        System.out.println("Разность двух матриц: ");
        int row_fMatrix = fMatrix.getRow();
        int column_fMatrix = fMatrix.getColumn();
        int row_sMatrix = sMatrix.getRow();
        int column_sMatrix = sMatrix.getColumn();
        int[][] result = null;
        if ((row_fMatrix != row_sMatrix) || (column_fMatrix != column_sMatrix)) {
            System.out.println("К сожалению нельзя складывать матрицы с разными размерностями. Попробуйте ещё раз");
            System.exit(0);
        } else {
            result = new int[row_fMatrix][column_fMatrix];
            for (int i = 0; i < row_fMatrix; i++) {
                for (int j = 0; j < column_fMatrix; j++) {
                    result[i][j] = fMatrix.getMatrix()[i][j] - sMatrix.getMatrix()[i][j];
                }
            }
        }
        return new Matrix(row_fMatrix, column_fMatrix, result);
    }

    // Умножение матрицы на число
    public static Matrix multiplicationByNumberMatrix(Matrix matrix, int number) {
        System.out.println("Умножение матрицы на число: ");
        int row_matrix = matrix.getRow();
        int column_matrix = matrix.getColumn();
        int[][] result = new int[row_matrix][column_matrix];
        for (int i = 0; i < row_matrix; i++) {
            for (int j = 0; j < column_matrix; j++) {
                result[i][j] = matrix.getMatrix()[i][j] * number;
            }
        }
        return new Matrix(row_matrix, column_matrix, result);
    }

    // Произведение матриц
    public static Matrix multiplicationMatrix(Matrix fMatrix, Matrix sMatrix) {
        System.out.println("Умножение двух матриц: ");
        int row_fMatrix = fMatrix.getRow();
        int column_fMatrix = fMatrix.getColumn();
        int row_sMatrix = sMatrix.getRow();
        int column_sMatrix = sMatrix.getColumn();
        int[][] result = null;
        if (column_fMatrix != row_sMatrix) {
            System.out.println("К сожалению нельзя перемножать матрицы с разными размерностями. Попробуйте ещё раз");
            System.exit(0);
        } else {
            result = new int[row_fMatrix][column_sMatrix];
            for (int i = 0; i < row_fMatrix; i++) {
                for (int j = 0; j < column_sMatrix; j++) {
                    int res = 0;
                    for (int f = 0; f < column_fMatrix; f++){
                        res += fMatrix.getMatrix()[i][f] * sMatrix.getMatrix()[f][j];
                    }
                    result[i][j] = res;
                }
            }
        }
        return new Matrix(row_fMatrix, column_sMatrix, result);
    }

    // Транспонированние матрицы
    public static Matrix transpositionMatrix(Matrix matrix){
        int[][] result = new int[matrix.getColumn()][matrix.getRow()];
        for (int i = 0; i < matrix.getColumn(); i++){
            for (int j = 0; j < matrix.getRow(); j++){
                result[i][j] = matrix.getMatrix()[j][i];
            }
        }
        return new Matrix(matrix.getColumn(), matrix.getRow(), result);
    }

    // Возведение матрицы на число
    public static Matrix raisingMatrix (Matrix matrix, int number) {
        System.out.println("Возведение матрицы на число: ");
        int row = matrix.getRow();
        int column = matrix.getColumn();
        int[][] resultMatrix = matrix.getMatrix();
        int[][] result = null;
        if (row != column) {
            System.out.println("К сожалению нельзя возвести не квадратичную матрицу на число. Попробуйте ещё раз");
            System.exit(0);
        } else {
            for (int n = 1; n < number; n++){
                result = new int[row][column];
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        int res = 0;
                        for (int f = 0; f < column; f++){
                            res += resultMatrix[i][f] * matrix.getMatrix()[f][j];
                        }
                        result[i][j] = res;
                    }
                }
                resultMatrix = result;
            }
        }
        return new Matrix(row, column, resultMatrix);
    }

}