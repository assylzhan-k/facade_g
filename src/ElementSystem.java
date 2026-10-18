public class ElementSystem {
    public int getBonusDamage(String element) {
        if (element.equalsIgnoreCase("Cryo")) {
            return 15;
        } else if (element.equalsIgnoreCase("Anemo")) {
            return 10;
        }
        return 0;
    }
}
