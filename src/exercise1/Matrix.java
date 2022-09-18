package exercise1;

public class Matrix {

    int row;
    int column;
    int[][] matrix;

    public Matrix(int row, int column, int[][] matrix) {
        this.row = row;
        this.column = column;
        this.matrix = matrix;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

}