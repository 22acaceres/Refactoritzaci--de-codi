public class FormatgeGidurat extends Article {
    public FormatgeGidurat(int diesPerVendre, int qualitat) {
        super("Formatge Gidurat", diesPerVendre, qualitat);
    }

    @Override
    public void actualitzarEstat() {
        diesPerVendre--;
        
        if (qualitat < 50) {
            qualitat++;
            // Si ha vençut, el formatge madura el doble de ràpid
            if (diesPerVendre < 0 && qualitat < 50) {
                qualitat++;
            }
        }
    }
}