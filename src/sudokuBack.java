import java.util.Arrays;

public class sudokuBack {

    private static final int N = 9;

    // Trouve une solution à la grille de Sudoku donnée
    public static boolean solve(int[][] grid) {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 0) {
                    row = i;
                    col = j;

                    // Nous avons trouvé une cellule vide
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }

        // Pas de cellules vides, nous avons trouvé la solution
        if (isEmpty) {
            return true;
        }

        // Essayez tous les nombres possibles dans la cellule vide
        for (int num = 1; num <= 9; num++) {
            if (isSafe(grid, row, col, num)) {
                // Faites un choix
                grid[row][col] = num;

                // Exploration de la branche suivante (backtracking)
                if (solve(grid)) {
                    return true;
                } else {
                    // Backtracking
                    grid[row][col] = 0;
                }
            }
        }

        return false;
    }

    // Vérifie si le numéro donné peut être inséré dans la grille à la position donnée
    private static boolean isSafe(int[][] grid, int row, int col, int num) {
        // Vérifie si le numéro est déjà présent dans la ligne
        for (int d = 0; d < N; d++) {
            if (grid[row][d] == num) {
                return false;
            }
        }

        // Vérifie si le numéro est déjà présent dans la colonne
        for (int r = 0; r < N; r++) {
            if (grid[r][col] == num) {
                return false;
            }
        }

        // Vérifie si le numéro est déjà présent dans le sous-carré 3x3
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int r = startRow; r < startRow + 3; r++) {
            for (int d = startCol; d < startCol + 3; d++) {
                if (grid[r][d] == num) {
                    return false;
                }
            }
        }

        // Le numéro peut être inséré dans la grille sans violer les règles de Sudoku
        return true;
    }
    public static void main(String[] args) {
        int[][] grid = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        if (solve(grid)) {
            for (int i = 0; i < N; i++) {
                System.out.println(Arrays.toString(grid[i]));
            }
        } else {
            System.out.println("Pas de solution");
        }
    }
}
