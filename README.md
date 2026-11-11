# Devoir INF461 - Patrons de construction

**Étudiant :** KOA ESSAMA PAULIN BRICE  
**Matricule :** 25I2255

Ce dépôt présente les deux variantes demandées dans le support de cours :

- `FactoryMethod` : une fabrique unique sélectionne le produit à créer à partir d'une catégorie.
- `Factory` : une fabrique abstraite définit la création et chaque fabrique concrète crée son propre produit.

Chaque variante existe avec trois produits (`A`, `B`, `C`) et avec l'extension demandée à quatre produits (`A`, `B`, `C`, `D`).

## Compilation et exécution

Depuis le dossier `Factory` :

```bash
javac -d out $(find src -name '*.java')
java -cp out factorymethod.troisproduits.Client
java -cp out factorymethod.quatreproduits.Client
java -cp out factory.troisproduits.Client
java -cp out factory.quatreproduits.Client
```

Les diagrammes UML et leur source Dia sont dans `Factory/diagrammes/`.

