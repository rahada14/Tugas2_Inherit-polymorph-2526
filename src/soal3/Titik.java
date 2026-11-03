package soal3;

/**
 * Kelas yang merepresentasikan koordinat titik 2D.
 */
public class Titik {
    private double x;
    private double y;

    public Titik() {
        this(0, 0);
    }

    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Menghitung jarak ke titik lain.
     * @param lain titik tujuan
     * @return jarak Euclidean antar dua titik
     */
    public double jarakKe(Titik lain) {
        double deltaX = this.x - lain.x;
        double deltaY = this.y - lain.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() {
        return String.format(java.util.Locale.US, "(%.1f, %.1f)", x, y);
    }
}
