import java.io.*;


public class lab09 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0])) ) {

            int n = Integer.parseInt(reader.readLine());
            int[][] tab = new int[n][4];

            for (int i = 0; i < n; i++) {
                String [] str_d = reader.readLine().split(" ");
                for (int j = 0; j < 4; j++) {
                    tab[i][j] = Integer.parseInt(str_d[j]);
                }
            }

            int x_size = 0;
            int y_size = 0;

            for (int i = 0; i < n; i++) {
                if (tab[i][2] > x_size)
                    x_size = tab[i][2];

                if (tab[i][3] > y_size)
                    y_size = tab[i][3];
            }
            x_size += 1;
            y_size += 1;

            int[][] tab_p = new int[y_size][x_size];
            for (int i = 0; i < y_size; i++) {
                for (int j = 0; j < x_size; j++) {
                    tab_p[i][j] = 0;
                }
            }
            int x1, y1, x2, y2;
            for (int w = 0; w < n; w++) {
                x1 = tab[w][0];
                y1 = tab[w][1];
                x2 = tab[w][2];
                y2 = tab[w][3];

                for (int i = y1; i <= y2; i++) {
                    for (int j = x1; j <= x2; j++) {
                        tab_p[i][j] += 1;
                    }
                }
            }

            int counter = 0;

            for (int i = 0; i < y_size; i++) {
                for (int j = 0; j < x_size; j++) {
                    if (tab_p[i][j] < n - 1) {
                        counter++;
                    }
                      System.out.print(tab_p[i][j] + " ");
                }
                 System.out.println();
            }
            System.out.println("Pozostała łączna powierzchnia do przekopania: " + counter);

        }
        catch (IOException  e) {
                System.out.println("Błąd pliku wejściowego");
        }
    }
}