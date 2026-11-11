package factory.troisproduits;

/** Exemple Factory avec une fabrique abstraite et trois fabriques concrètes. */
public class Client {
    public static void main(String[] args) {
        ProduitFactory[] fabriques = {
            new ProduitFactoryA(), new ProduitFactoryB(), new ProduitFactoryC()
        };
        for (ProduitFactory fabrique : fabriques) {
            System.out.println(fabrique.getProduit().methodeProduit());
        }
    }
}

interface Produit {
    String methodeProduit();
}

class ProduitA implements Produit { public String methodeProduit() { return "Produit A créé"; } }
class ProduitB implements Produit { public String methodeProduit() { return "Produit B créé"; } }
class ProduitC implements Produit { public String methodeProduit() { return "Produit C créé"; } }

abstract class ProduitFactory {
    public Produit getProduit() {
        return creerProduit();
    }
    protected abstract Produit creerProduit();
}

class ProduitFactoryA extends ProduitFactory {
    protected Produit creerProduit() { return new ProduitA(); }
}

class ProduitFactoryB extends ProduitFactory {
    protected Produit creerProduit() { return new ProduitB(); }
}

class ProduitFactoryC extends ProduitFactory {
    protected Produit creerProduit() { return new ProduitC(); }
}

