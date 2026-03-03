public class UC6 {

    public static void main(String[] args) {

        String[] banner = {
                String.join("   ", getO()[0], getO()[0], getP()[0], getS()[0]),
                String.join("   ", getO()[1], getO()[1], getP()[1], getS()[1]),
                String.join("   ", getO()[2], getO()[2], getP()[2], getS()[2]),
                String.join("   ", getO()[3], getO()[3], getP()[3], getS()[3]),
                String.join("   ", getO()[4], getO()[4], getP()[4], getS()[4])
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static method for letter O
    public static String[] getO() {
        return new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        };
    }

    // Static method for letter P
    public static String[] getP() {
        return new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        };
    }

    // Static method for letter S
    public static String[] getS() {
        return new String[]{
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        };
    }
}