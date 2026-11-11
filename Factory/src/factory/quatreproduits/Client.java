package factory.quatreproduits;

/** Extension de Factory : une quatrième fabrique crée ProduitD. */
public class Client {
    public static void main(String[] args) {
        ProduitFactory[] fabriques = {
            new ProduitFactoryA(), new ProduitFactoryB(),
            new ProduitFactoryC(), new ProduitFactoryD()
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
class ProduitD implements Produit { public String methodeProduit() { return "Produit D créé"; } }

abstract class ProduitFactory {
    public Produit getProduit() {
        return creerProduit();
    }
    protected abstract Produit creerProduit();
}

class ProduitFactoryA extends ProduitFactory { protected Produit creerProduit() { return new ProduitA(); } }
class ProduitFactoryB extends ProduitFactory { protected Produit creerProduit() { return new ProduitB(); } }
class ProduitFactoryC extends ProduitFactory { protected Produit creerProduit() { return new ProduitC(); } }
class ProduitFactoryD extends ProduitFactory { protected Produit creerProduit() { return new ProduitD(); } }

