public class Ukol4Pole2 {

        static String[] inventory = {
                "Spitzhacke", "Krankenwagen", "Apache-Hubschrauber 3000", "Monchhichi", "Chihuahua", "Gallone Milch",
                "Hubba Bubba", "48-Port-Switch", "Stiefel", "Schwanz eines weißen Wals", "DVD-Player", "16GB RAM",
                "LGM 30 Minuteman", "Lego Ninja Go", "Excalibur", "50-Meter-Seil", "Quanten-Discombobulator",
                "Empfindungsfähiges Gummiente", "Unsichtiges Glücks-Frettchen", "Zeitreisender Hamster", "Kosmische Luftpolsterfolie",
                "Telepathischer Spatel", "Interdimensionales Käserad", "Verzerrte Lavalampe", "Tanzender Kaktus des Chaos",
                "Mystische Fleischkugel", "Einhornfürze im Glas", "Singender Weltraum-Taco", "Antischwerkraft-Banane", "Multiversum-Becher",
                "Hellseherischer Toaster", "Atom-Schaumbad"
        };
        static char[] rarity = {'C', 'D', 'D', 'D', 'B', 'A', 'D', 'E', 'E', 'E', 'A', 'E', 'D', 'A', 'E', 'D', 'A', 'A', 'D',
                'A', 'E', 'D', 'E', 'B', 'C', 'C', 'A', 'B', 'C', 'C', 'E', 'E'};

        static void pridavani() {
            String[] vetsiInventory = new String[inventory.length + 4];
            char[] vicRarity = new char[rarity.length + 4];

            for (int i = 0; i < inventory.length; i++) {
                vetsiInventory[i] = inventory[i];
                vicRarity[i] = rarity[i];
            }

            inventory = vetsiInventory;
            rarity = vicRarity;

            String[] novejItems = {"Einhundert", "Krankenhaus", "Bier", "Brot"};
            char[] novaRarity = {'B', 'C', 'A', 'E'};

            for (int i = 0; i < novejItems.length; i++) {
                inventory[inventory.length - novejItems.length + i] = novejItems[i];
                rarity[rarity.length - novaRarity.length + i] = novaRarity[i];
            }
        }

        static void abecedne() {
            for (int i = 0; i < inventory.length - 1; i++) {
                for (int j = 0; j < inventory.length - 1 - i; j++) {
                    if (inventory[j].compareTo(inventory[j + 1]) > 0) {
                        String tempInv = inventory[j];
                        inventory[j] = inventory[j + 1];
                        inventory[j + 1] = tempInv;

                        char tempR = rarity[j];
                        rarity[j] = rarity[j + 1];
                        rarity[j + 1] = tempR;
                    }
                }
            }
            System.out.println("Inventář seřazený abecedně:");
            for (int i = 0; i < inventory.length; i++) {
                System.out.println("věc: " + inventory[i] + "       " + "rarita: " + rarity[i]);
            }
            System.out.println();
        }

        static void dleRarity(){
            for (int i = 0; i < inventory.length - 1; i++) {
                for (int j = 0; j < inventory.length - 1 - i; j++) {
                    //jestli že rarita j je vetsi nez rarita j+1 (pozivi pred ní) tak se posune na její pzici a to samé potom platí i pro inventár odpovídající tomu místu
                    if (rarity[j] > rarity[j + 1] || (rarity[j] == rarity[j + 1] && inventory[j].compareTo(inventory[j + 1]) > 0)) {
                        char a = rarity[j];
                        rarity[j] = rarity[j + 1];
                        rarity[j + 1] = a;

                        String b = inventory[j];
                        inventory[j] = inventory[j + 1];
                        inventory[j + 1] = b;
                    }
                }
            }
            System.out.println("Inventář seřazený podle rarity:");
            for (int i = 0; i < inventory.length; i++) {
                System.out.println("věc: " + inventory[i] + "       " + "rarita: " + rarity[i]);
            }
        }

    public static void main(String[] args) {
        pridavani();
        abecedne();
        dleRarity();
    }

}
