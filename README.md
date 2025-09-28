Kalkylator – Java

Detta är ett litet skolprojekt där jag har byggt en enkel konsolbaserad kalkylator i Java. Programmet körs i terminalen och låter användaren välja mellan de fyra grundläggande räknesätten. Syftet är att träna på Java-syntax, loopar, switch-satser och inläsning av data via Scanner.

Funktioner

När programmet startar hälsar det användaren välkommen och visar en meny:

1. Addition (+)

2. Subtraktion (–)

3. Multiplikation (*)

4. Division (/)

0. Avsluta programmet

Användaren väljer ett alternativ genom att skriva en siffra. Programmet frågar därefter efter två tal, utför beräkningen och skriver ut resultatet. Menyn visas sedan igen tills användaren väljer att avsluta.

Det finns enkel felhantering: om man försöker dela med 0 får man ett meddelande om att det inte går. Om man skriver en ogiltig menyvalssiffra visas ett felmeddelande.

Kodöversikt

All logik ligger i en enda klass Kalkylator med en main-metod:

Scanner input används för att läsa in menyval och tal från tangentbordet.

En while(true)-loop håller programmet igång tills användaren väljer att avsluta.

En switch-sats avgör vilken beräkning som ska göras beroende på menyvalet.

För varje case frågar programmet efter två heltal, beräknar resultatet och skriver ut det.

switch(val) {
    case 1: // Addition
    case 2: // Subtraktion
    case 3: // Multiplikation
    case 4: // Division
    case 0: // Avsluta
    default: // Ogiltigt val
}

Exempel på körning
Välkommmen till Kalkylatorn
Vad vill du räkna idag? Välj ett alternativ
1. Addition +
2. Subtrahera -
3. Multiplikation *
4. Division /
0. Avsluta
> 1
Du valde 1. Addition +
Skriv ditt första tal!
> 5
Skriv ditt andra tal!
> 7
Resultatet blev: 12

Så här kör du programmet

Klona ner eller ladda hem projektet.

Kompilera Java-filen:

javac Kalkylator.java


Kör programmet:

java Kalkylator


Följ instruktionerna i terminalen.

Möjliga förbättringar

Lägga till fler operationer (exponent, kvadratroten osv.)

Bryta ut beräkningarna i separata metoder eller klasser

Mer avancerad felhantering (t.ex. hantera bokstäver som matas in)

Spara tidigare resultat i en historik
