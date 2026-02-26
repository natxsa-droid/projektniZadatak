public class Pravokutnik  implements geometrijskiLik {
    private String naziv;
    private double a, b;

    public Pravokutnik(String naziv, double a, double b) {
        this.naziv = naziv;
        this.a = a;
        this.b = b;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getPovrsina() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Lik: " + naziv + " (Pravokutnik), Stranice: " + a + ", " + b +
                ", Površina: " + String.format("%.2f", getPovrsina());
    }
}
