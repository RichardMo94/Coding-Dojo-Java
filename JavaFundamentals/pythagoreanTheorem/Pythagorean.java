public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        int squareLegA = legA * legA;
        int squareLegB = legB * legB;
        int squareLegC = squareLegA + squareLegB;
        double legC = math.sqrt(squareLegC);
        System.out.println(legC);
    }
}