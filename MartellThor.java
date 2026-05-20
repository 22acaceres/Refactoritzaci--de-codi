public class MartellThor extends Article {
    public MartellThor(int diesPerVendre) {
        super("Martell de Thor (Llegendari)", diesPerVendre, 80);
    }

    @Override
    public void actualitzarEstat() {
        // És immòbil: no es fa absolutament res 
    }
}