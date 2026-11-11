package factorymethod.troisproduits;

/** Exemple personnel : création de documents administratifs. */
public class Client {
    public static void main(String[] args) {
        FabriqueDocument fabrique = new FabriqueDocument();
        for (String type : new String[] {"attestation", "stage", "releve"}) {
            Document document = fabrique.creerDocument(type);
            System.out.println(document.generer());
        }
    }
}

interface Document {
    String generer();
}

class AttestationScolarite implements Document {
    public String generer() { return "Attestation de scolarité générée"; }
}

class CertificatStage implements Document {
    public String generer() { return "Certificat de stage généré"; }
}

class ReleveNotes implements Document {
    public String generer() { return "Relevé de notes généré"; }
}

class FabriqueDocument {
    public Document creerDocument(String type) {
        return switch (type.toLowerCase()) {
            case "attestation" -> new AttestationScolarite();
            case "stage" -> new CertificatStage();
            case "releve" -> new ReleveNotes();
            default -> throw new IllegalArgumentException("Type inconnu : " + type);
        };
    }
}

