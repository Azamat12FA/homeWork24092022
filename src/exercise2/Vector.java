package exercise2;

public class Vector {

    int x1_coordinate;
    int y1_coordinate;
    int z1_coordinate;
    int x2_coordinate;
    int y2_coordinate;
    int z2_coordinate;

    int[] coordinateVector;

    int xCoordinateVector;
    int yCoordinateVector;
    int zCoordinateVector;


    public Vector(int[] coordinateVector) {
        this.x1_coordinate = coordinateVector[0];
        this.y1_coordinate = coordinateVector[1];
        this.z1_coordinate = coordinateVector[2];
        this.x2_coordinate = coordinateVector[3];
        this.y2_coordinate = coordinateVector[4];
        this.z2_coordinate = coordinateVector[5];
        this.xCoordinateVector = coordinateVector[0] - coordinateVector[1];
        this.yCoordinateVector = coordinateVector[2] - coordinateVector[3];
        this.zCoordinateVector = coordinateVector[4] - coordinateVector[5];
        this.coordinateVector = coordinateVector;
    }

    public double lengthVector() {
        return Math.sqrt(xCoordinateVector ^ 2 + yCoordinateVector ^ 2 + zCoordinateVector ^ 2);
    }

    public int getX1_coordinate() {
        return x1_coordinate;
    }

    public void setX1_coordinate(int x1_coordinate) {
        this.x1_coordinate = x1_coordinate;
    }

    public int getY1_coordinate() {
        return y1_coordinate;
    }

    public void setY1_coordinate(int y1_coordinate) {
        this.y1_coordinate = y1_coordinate;
    }

    public int getZ1_coordinate() {
        return z1_coordinate;
    }

    public void setZ1_coordinate(int z1_coordinate) {
        this.z1_coordinate = z1_coordinate;
    }

    public int getX2_coordinate() {
        return x2_coordinate;
    }

    public void setX2_coordinate(int x2_coordinate) {
        this.x2_coordinate = x2_coordinate;
    }

    public int getY2_coordinate() {
        return y2_coordinate;
    }

    public void setY2_coordinate(int y2_coordinate) {
        this.y2_coordinate = y2_coordinate;
    }

    public int getZ2_coordinate() {
        return z2_coordinate;
    }

    public void setZ2_coordinate(int z2_coordinate) {
        this.z2_coordinate = z2_coordinate;
    }

    public int[] getCoordinateVector() {
        return coordinateVector;
    }

    public void setCoordinateVector(int[] coordinateVector) {
        this.coordinateVector = coordinateVector;
    }

    public int getxCoordinateVector() {
        return xCoordinateVector;
    }

    public void setxCoordinateVector(int xCoordinateVector) {
        this.xCoordinateVector = xCoordinateVector;
    }

    public int getyCoordinateVector() {
        return yCoordinateVector;
    }

    public void setyCoordinateVector(int yCoordinateVector) {
        this.yCoordinateVector = yCoordinateVector;
    }

    public int getzCoordinateVector() {
        return zCoordinateVector;
    }

    public void setzCoordinateVector(int zCoordinateVector) {
        this.zCoordinateVector = zCoordinateVector;
    }
}
