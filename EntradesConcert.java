public class EntradesConcert extends Article {
    public EntradesConcert(int diesPerVendre, int qualitat) {
        super("Entrades per al Concert del Trobador", diesPerVendre, qualitat);
    }

    @Override
    public void actualitzarEstat() {
        diesPerVendre--;

        if (diesPerVendre < 0) {
            qualitat = 0; // Després del concert, no valen res [cite: 17]
            return;
        }

        if (qualitat < 50) {
            qualitat++; // Més de 10 dies: +1 [cite: 14]
            
            if (diesPerVendre < 10 && qualitat < 50) {
                qualitat++; // Entre 10 i 6 dies: +2 [cite: 15]
            }
            if (diesPerVendre < 5 && qualitat < 50) {
                qualitat++; // 5 dies o menys: +3 [cite: 16]
            }
        }
    }
}