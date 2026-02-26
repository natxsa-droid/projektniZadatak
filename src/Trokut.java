public class Trokut {
    private String naziv;
    private double a, b, c;

    public Trokut (String naziv, double a, double b, double c) {
        this.naziv = naziv;
        this.a = a;
        this.b = b;
        this.c = c; }

    public String getNaziv() {
        return naziv; }
    public void setNaziv(String naziv) {
        this.naziv = naziv; }

    public double getA() {
        return a; }

    public void setA(double a) {
        this.a = a; }

    public double getPovrsina() {
        double s = (a + b + c) / 2; // Poluopseg
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); }

    @Override
    public String toString() {
        return "Lik: " + naziv + " (Trokut), Stranice: " + a + ", " + b + ", " + c +
                ", Površina: " + String.format("%.2f", getPovrsina());
    }



}

