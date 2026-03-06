public class UC6 {

    // Static method for letter O
    static String getO(int row) {
        String[] O = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
        return O[row];
    }

    // Static method for letter P
    static String getP(int row) {
        String[] P = {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
        return P[row];
    }

    // Static method for letter S
    static String getS(int row) {
        String[] S = {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
        return S[row];
    }

    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            String line = String.join("   ",
                    getO(i),
                    getO(i),
                    getP(i),
                    getS(i)
            );

            System.out.println(line);
        }
    }
}