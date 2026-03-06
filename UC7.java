public class UC7 {

    // Static Inner Class
    static class CharacterPattern {
        char character;
        String[] pattern;

        // Constructor
        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for pattern row
        String getRow(int row) {
            return pattern[row];
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        // Word to print
        CharacterPattern[] word = {O, O, P, S};

        // Print banner
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : word) {
                line.append(cp.getRow(i)).append("   ");
            }

            System.out.println(line);
        }
    }
}