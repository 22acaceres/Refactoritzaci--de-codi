public abstract class Article {
    public String nom;
    public int diesPerVendre;
    public int qualitat;

    public Article(String nom, int diesPerVendre, int qualitat) {
        this.nom = nom;
        this.diesPerVendre = diesPerVendre;
        this.qualitat = qualitat;
    }

    // Mètode abstracte que obligarà a cada article a gestionar la seva lògica
    public abstract void actualitzarEstat();
}