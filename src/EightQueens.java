import java.util.Arrays;

public class EightQueens {
    // Taille de l'échiquier (8x8)
    private static final int N = 8;

    // Matrice pour stocker la position des reines sur l'échiquier
    // Par exemple, si queens[2] = 3, alors il y a une reine sur la ligne 3 de la colonne 2
    private static int[] queens = new int[N];

    public static void main(String[] args) {
        // Placer toutes les reines sur la première ligne
        Arrays.fill(queens, -1);

        // Commencer à explorer les branches à partir de la première reine
        placeQueens(0);
    }

    // Place les reines sur l'échiquier à l'aide de backtracking
    private static void placeQueens(int targetRow) {
        if (targetRow == N) {
            // Toutes les reines ont été placées sur l'échiquier, afficher la solution
            printQueens();
            return;
        }

        // Essayez toutes les colonnes pour la reine actuelle
        for (int col = 0; col < N; col++) {
            if (isValidMove(targetRow, col)) {
                // Faites un choix
                queens[targetRow] = col;

                // Exploration de la branche suivante (backtracking)
                placeQueens(targetRow + 1);

                // Backtracking
                queens[targetRow] = -1;
            }
        }
    }

    // Vérifie si le mouvement de la reine à la ligne cible et la colonne données est valide
    private static boolean isValidMove(int targetRow, int col) {
        // Vérifie si la reine est déjà présente dans la colonne
        for (int row = 0; row < targetRow; row++) {
            if (queens[row] == col) {
                return false;
            }
        }

        // Vérifie les diagonales supérieures gauche
        for (int row = targetRow, col1 = col; row >= 0 && col1 >= 0; row--, col1--) {
            if (queens[row] == col1) {
                return false;
            }
        }

        // Vérifie les diagonales supérieures droite
        for (int row = targetRow, col1 = col; row >= 0 && col1 < N; row--, col1++) {
            if (queens[row] == col1) {
                return false;
            }
        }

        return true;
    }

    private static void printQueens() {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (queens[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}