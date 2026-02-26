public class Krug implements geometrijskiLik {
    private String naziv;
    private double radius;

    public Krug(String naziv, double radius) {
        this.naziv = naziv;
        this.radius = radius; }

    public String getNaziv(){
        return this.naziv; }

    public double getRadius() {
        return radius; }

        public double getPovrsina() {
            return radius * radius * Math.PI; }

            @Override
            public String toString() {
                return "Lik: " + naziv + ", Radijus: " + radius + ", Površina: " + getPovrsina();
    }

    public void setNaziv(String naziv){
        this.naziv = naziv; }

    public void setRadius(double radius) {
        this.radius = radius; }
}

