package factorymethod.quatreproduits;

/** Variante : un quatrième document administratif est ajouté. */
public class Client {
    public static void main(String[] args) {
        FabriqueDocument fabrique = new FabriqueDocument();
        for (String type : new String[] {"attestation", "stage", "releve", "recommandation"}) {
            Document document = fabrique.creerDocument(type);
            System.out.println(document.generer());
        }
    }
}

interface Document {
    String generer();
}

class AttestationScolarite implements Document { public String generer() { return "Attestation de scolarité générée"; } }
class CertificatStage implements Document { public String generer() { return "Certificat de stage généré"; } }
class ReleveNotes implements Document { public String generer() { return "Relevé de notes généré"; } }
class LettreRecommandation implements Document { public String generer() { return "Lettre de recommandation générée"; } }

class FabriqueDocument {
    public Document creerDocument(String type) {
        return switch (type.toLowerCase()) {
            case "attestation" -> new AttestationScolarite();
            case "stage" -> new CertificatStage();
            case "releve" -> new ReleveNotes();
            case "recommandation" -> new LettreRecommandation();
            default -> throw new IllegalArgumentException("Type inconnu : " + type);
        };
    }
}

