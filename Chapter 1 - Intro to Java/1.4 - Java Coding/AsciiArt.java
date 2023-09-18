public class AsciiArt {
    /* List of all requested art...
        Fish: ><(((('>
        Cat: =^..^=
        Rose: --------{---(@
        Worm: _/\__/\__0>
        Personal Message: (¯`·._.·(¯`·._.· Your Text ·._.·´¯)·._.·´¯)
        Caterpillar: ,/\,/\,/\,/\,/\,/\,o 
        Professor: ""⌐(ಠ۾ಠ)¬""
        I don't know: ¯\_(ツ)_/¯ 
        Mickey: 
                                 _____
                             .d88888888bo.
                            .d8888888888888b.
                            8888888888888888b
                            888888888888888888
                            888888888888888888
                            Y8888888888888888
                       ,od888888888888888888P
                    .'`Y8P'```'Y8888888888P'
                  .'_   `  _     'Y88888888b
                 /  _`    _ `      Y88888888b   ____
             _  | /  \  /  \      8888888888.d888888b.
            d8b | | /|  | /|      8888888888d8888888888b
            8888_\ \_|/  \_|/      d888888888888888888888b
            .Y8P  `'-.            d88888888888888888888888
            /          `          `      `Y8888888888888888
            |                        __    888888888888888P
            \                       / `   dPY8888888888P'
            '._                  .'     .'  `Y888888P`
                `"'-.,__    ___.-'    .-'
                    `-._````  __..--'`
                        ``````
     */
    
    public AsciiArt() {
    }

    // Functions to print out requested art
    public void printFish() {
        System.out.println("Fish: ><(((('>");
    }
    public void printCat() {
        System.out.println("Cat: =^..^=");
    }
    public void printRose() {
        System.out.println("Rose: --------{---(@");
    }
    public void printWorm() {
        System.out.println("Worm: _/\\__/\\__0>");
    }
    public void printPersonalMessage() {
        System.out.println("Personal:  (¯`·._.·(¯`·._.· Your Text ·._.·´¯)·._.·´¯)");
    }
    public void printCaterpillar() {
        System.out.println("Caterpillar: ,/\\,/\\,/\\,/\\,/\\,/\\,o ");
    }
    public void printProfessor() {
        System.out.println("Professor: \"\"⌐(ಠ۾ಠ)¬\"\"");
    }
    public void printMickey() {
        String mickey = "Mickey:" + System.lineSeparator() +
                        "                                 _____" + System.lineSeparator() +  
                        "                             .d88888888bo."+ System.lineSeparator() + 
                        "                            .d8888888888888b."+ System.lineSeparator() + 
                        "                            8888888888888888b"+ System.lineSeparator() + 
                        "                            888888888888888888"+ System.lineSeparator() + 
                        "                            888888888888888888"+ System.lineSeparator() + 
                        "                            Y8888888888888888"+ System.lineSeparator() + 
                        "                       ,od888888888888888888P"+ System.lineSeparator() + 
                        "                    .'`Y8P'```'Y8888888888P'"+ System.lineSeparator() + 
                        "                  .'_   `  _     'Y88888888b"+ System.lineSeparator() + 
                        "                 /  _`    _ `      Y88888888b   ____"+ System.lineSeparator() + 
                        "             _  | /  \\  /  \\      8888888888.d888888b."+ System.lineSeparator() + 
                        "            d8b | | /|  | /|      8888888888d8888888888b"+ System.lineSeparator() + 
                        "            8888_\\ \\_|/  \\_|/      d888888888888888888888b"+ System.lineSeparator() + 
                        "            .Y8P  `'-.            d88888888888888888888888"+ System.lineSeparator() + 
                        "            /          `          `      `Y8888888888888888"+ System.lineSeparator() + 
                        "            |                        __    888888888888888P"+ System.lineSeparator() + 
                        "            \\                       / `   dPY8888888888P'"+ System.lineSeparator() + 
                        "            '._                  .'     .'  `Y888888P`"+ System.lineSeparator() + 
                        "                `\"'-.,__    ___.-'    .-'"+ System.lineSeparator() + 
                        "                    `-._````  __..--'`"+ System.lineSeparator() + 
                        "                        ``````";
        System.out.println(mickey);
    } 
}