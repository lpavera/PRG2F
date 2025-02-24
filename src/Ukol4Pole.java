import java.util.*;

public class Ukol4Pole {

    static String[] inventory = {
            "Spitzhacke", "Krankenwagen", "Apache-Hubschrauber 3000", "Monchhichi", "Chihuahua", "Gallone Milch",
            "Hubba Bubba", "48-Port-Switch", "Stiefel", "Schwanz eines weißen Wals", "DVD-Player", "16GB RAM",
            "LGM 30 Minuteman", "Lego Ninja Go", "Excalibur", "50-Meter-Seil", "Quanten-Discombobulator",
            "Empfindungsfähiges Gummiente", "Unsichtiges Glücks-Frettchen", "Zeitreisender Hamster", "Kosmische Luftpolsterfolie",
            "Telepathischer Spatel", "Interdimensionales Käserad", "Verzerrte Lavalampe", "Tanzender Kaktus des Chaos",
            "Mystische Fleischkugel", "Einhornfürze im Glas", "Singender Weltraum-Taco", "Antischwerkraft-Banane", "Multiversum-Becher",
            "Hellseherischer Toaster", "Atom-Schaumbad"
    };

    static char[] rarity = {'C', 'D', 'D', 'D', 'B', 'A', 'D', 'E', 'E', 'E', 'A', 'E', 'D', 'A', 'E',
            'D', 'A', 'A', 'D', 'A', 'E', 'D', 'E', 'B', 'C', 'C', 'A', 'B', 'C', 'C', 'E', 'E'
    };

    public static void addNewItems() {
        String[] newItems = {"Atombombe", "Redbull", "Doppelkupplungs-Automatikgetriebe", "Hundescheiße" };
        char[] newRarity = {'B', 'A', 'A', 'E'};


        //zvetsovani pole a vkladání novych veci do nej
        inventory = Arrays.copyOf(inventory, inventory.length + newItems.length);
        rarity = Arrays.copyOf(rarity, rarity.length + newRarity.length);

        for (int i = 0; i < newItems.length; i++) {
            inventory[inventory.length - newItems.length + i] = newItems[i];
            rarity[rarity.length - newRarity.length + i] = newRarity[i];
        }

    }

    //trideni podle abecedy
    public static void sortAlphabetically() {
        for (int i = 0; i < inventory.length - 1; i++) {
            for (int j = 0; j < inventory.length - 1 - i; j++) {
                if (inventory[j].compareTo(inventory[j + 1]) > 0) {
                    // Prohození inventory
                    String tempInv = inventory[j];
                    inventory[j] = inventory[j + 1];
                    inventory[j + 1] = tempInv;

                    // Prohození rarity
                    char tempR = rarity[j];
                    rarity[j] = rarity[j + 1];
                    rarity[j + 1] = tempR;
                }
            }
        }
        //vypsání
        System.out.println("Inventář seřazený abecedně:");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(inventory[i] + " (" + rarity[i] + ")" );
        }
        System.out.println();
    }

    //trideni podle rarity
    public static void sortByRarity() {
        for (int i = 0; i < inventory.length - 1; i++) {
            for (int j = 0; j < inventory.length - 1 - i; j++) {
                //jestli že rarita j je vetsi nez rarita j+1 (pozivi pred ní) tak se posune na její pzici a to samé potom platí i pro inventár odpovídající tomu místu
                if (rarity[j] > rarity[j + 1] || (rarity[j] == rarity[j + 1] && inventory[j].compareTo(inventory[j + 1]) > 0)) {
                    // Prohození inventory
                    char a = rarity[j];
                    rarity[j] = rarity[j + 1];
                    rarity[j + 1] = a;

                    // Prohození rarity
                    String b = inventory[j];
                    inventory[j] = inventory[j + 1];
                    inventory[j + 1] = b;
                }
            }
        }
        //vypsání
        System.out.println("Inventář seřazený podle rarity:");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(inventory[i] + " (" + rarity[i] + ")");
        }
    }

    public static void main(String[] args) {
        addNewItems();
        sortAlphabetically();
        sortByRarity();
    }
}


//musel jsem předělat nějaké chyby v mém programu, při řazení podle abecedy to neprohazovalo se slovy i raritu