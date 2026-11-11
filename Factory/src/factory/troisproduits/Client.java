package factory.troisproduits;

/** Exemple personnel : sélection de moyens de transport urbain. */
public class Client {
    public static void main(String[] args) {
        FabriqueTransport[] fabriques = {
            new FabriqueMotoTaxi(), new FabriqueTaxiVille(), new FabriqueBusUrbain()
        };
        for (FabriqueTransport fabrique : fabriques) {
            System.out.println(fabrique.obtenirTransport().demarrer());
        }
    }
}

interface MoyenTransport {
    String demarrer();
}

class MotoTaxi implements MoyenTransport { public String demarrer() { return "Moto-taxi prêt pour la course"; } }
class TaxiVille implements MoyenTransport { public String demarrer() { return "Taxi de ville prêt pour la course"; } }
class BusUrbain implements MoyenTransport { public String demarrer() { return "Bus urbain prêt pour la course"; } }

abstract class FabriqueTransport {
    public MoyenTransport obtenirTransport() {
        return creerTransport();
    }
    protected abstract MoyenTransport creerTransport();
}

class FabriqueMotoTaxi extends FabriqueTransport {
    protected MoyenTransport creerTransport() { return new MotoTaxi(); }
}

class FabriqueTaxiVille extends FabriqueTransport {
    protected MoyenTransport creerTransport() { return new TaxiVille(); }
}

class FabriqueBusUrbain extends FabriqueTransport {
    protected MoyenTransport creerTransport() { return new BusUrbain(); }
}

