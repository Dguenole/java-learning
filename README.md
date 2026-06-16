Gestion d'un parc immobilier — Projet POO Java

Projet console réalisé en Java pour mettre en pratique les fondamentaux de la programmation orientée objet. Une agence immobilière gère un catalogue de biens (appartements, maisons), calcule la valeur totale de son portefeuille et filtre les biens selon différents critères.

Concepts POO mis en œuvre


Classe abstraite : Bien définit le socle commun et impose une méthode abstraite calculerPrixFinal().
Héritage : immobilier.Agence.Appartement et Maison étendent Bien avec leurs attributs propres.
Polymorphisme : Agence.calculerValeurTotale() parcourt le catalogue et appelle calculerPrixFinal() sur chaque bien sans connaître son type concret.
Interface : Louable définit un contrat (calculerLoyerMensuel(), estDisponible()) implémenté par les biens louables, indépendamment de la hiérarchie d'héritage.
Pattern matching instanceof : utilisé pour identifier les biens louables lors du filtrage.
Encapsulation : tous les attributs sont private, accès via getters/setters.
Collections : gestion du catalogue avec List<Bien> / ArrayList.
Enum : TypeTransaction (VENTE, LOCATION).


Structure

ClasseRôleBienClasse abstraite, socle commun (identifiant, adresse, superficie, prix)AppartementBien avec étage, ascenseur, charges de copropriété — implémente LouableMaisonBien avec surface de jardin et nombre d'étagesLouableInterface : calcul du loyer mensuel et disponibilitéAgenceGère le catalogue, calcule la valeur totale, filtre les biensTypeTransactionEnum des types de transactionMainPoint d'entrée, démonstration

Fonctionnalités


Ajouter / retirer des biens du catalogue
Afficher tous les biens (avec un toString() lisible par type)
Calculer la valeur totale du portefeuille (polymorphe)
Lister les biens louables avec leur loyer mensuel
Filtrer les biens sous un prix donné


Exécution

Projet développé sous IntelliJ IDEA avec un JDK 21 (Temurin).

bash# Compilation
javac *.java

# Exécution
java Main

Exemple de sortie

[APPARTEMENT] #1 Ouakam - 50 m² - 300000.0 FCFA (étage 4)
[MAISON] #2 Mermoz - 70 m² - 400000.0 FCFA (jardin 10 m²)
[APPARTEMENT] #3 Almadies - 60 m² - 500000.0 FCFA (étage 6)
Valeur Totale = 1700000.0
[APPARTEMENT] #1 ... -> loyer : 3000.0
[APPARTEMENT] #3 ... -> loyer : 5000.0

Pistes d'amélioration


Intégrer l'enum TypeTransaction dans la logique de l'agence
Ajouter une classe LocalCommercial (louable) pour démontrer l'extensibilité du polymorphisme
Encapsuler le catalogue (private + méthode listerBiens())
Implémenter Comparable<Bien> pour trier par prix
Gérer les exceptions (ex. refuser un prix négatif)
Migrer les filtres vers l'API Streams



Premier projet de mon apprentissage Java. Code écrit dans le cadre de ma progression vers le développement back-end Java/Spring.È