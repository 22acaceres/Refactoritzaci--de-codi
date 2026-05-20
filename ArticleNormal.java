public class ArticleNormal extends Article {
    public ArticleNormal(String nom, int diesPerVendre, int qualitat) {
        super(nom, diesPerVendre, qualitat);
    }

    @Override
    public void actualitzarEstat() {
        diesPerVendre--;
        
        if (qualitat > 0) {
            qualitat--;
            // Si ja ha vençut, baixa el doble de ràpid
            if (diesPerVendre < 0 && qualitat > 0) {
                qualitat--;
            }
        }
    }
}