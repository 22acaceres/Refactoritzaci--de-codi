public class Magatzem {
    private final Article[] articles;

    public Magatzem(Article[] articles) {
        this.articles = articles;
    }

    public void actualitzarEstat() {
        for (Article article : articles) {
            article.actualitzarEstat(); // Cada objecte executa el seu propi mètode
        }
    }
}