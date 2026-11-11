package factorymethod.troisproduits;

/** Exemple du support : Factory Method avec trois produits. */
public class Client {
    public static void main(String[] args) {
        FabriqueProduit fabrique = new FabriqueProduit();
        for (String categorie : new String[] {"A", "B", "C"}) {
            Produit produit = fabrique.creerProduit(categorie);
            System.out.println(produit.methodeProduit());
        }
    }
}

interface Produit {
    String methodeProduit();
}

class ProduitA implements Produit {
    public String methodeProduit() { return "Produit A créé"; }
}

class ProduitB implements Produit {
    public String methodeProduit() { return "Produit B créé"; }
}

class ProduitC implements Produit {
    public String methodeProduit() { return "Produit C créé"; }
}

class FabriqueProduit {
    public Produit creerProduit(String categorie) {
        return switch (categorie.toUpperCase()) {
            case "A" -> new ProduitA();
            case "B" -> new ProduitB();
            case "C" -> new ProduitC();
            default -> throw new IllegalArgumentException("Catégorie inconnue : " + categorie);
        };
    }
}

