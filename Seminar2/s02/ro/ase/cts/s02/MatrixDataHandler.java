package ro.ase.cts.s02;

import java.io.*;



/*
public class MatrixDataHandler {
    private int[][] matrix;
    private int height; //
    private int width;
    private String filename; //matricea initializata este scrisa in fisierul filename


    public MatrixDataHandler(int height, int width, String filename) { //constructorul care initializeaza matricea pe baza valorilor primite pentru dimensiuni
        this.height = height;
        this.width = width;
        this.filename = filename;
        matrix = new int[height][];
        for (int i = 0; i < height; i++) {
            matrix[i] = new int[width];
        }


        try {
            FileWriter fw = new FileWriter(filename);
            fw.write(height + " " + width + "\n");
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    fw.write(matrix[i][j] + " ");
                }
                fw.write("\n");
            }
            fw.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    //metoda scrie matricea in fisier

    public int getValueFromPosition(String filename, int posH, int posW) {
        try {
            // !!!
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            height = Integer.parseInt(line.split(" ")[0]);
            width = Integer.parseInt(line.split(" ")[1]);

            for (int i = 0; i < height; i++) {
                line = br.readLine();
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                }
            }
            br.close();
            return matrix[posH][posW];
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return -1;
        }
    }


    //functia returneaza true daca matricea s-a scris cu succes si false in caz contrar
    public void modifyValueAndUpdateFile(String filename, int posH, int posW, int val) {
        try {
            // !!!
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            height = Integer.parseInt(line.split(" ")[0]);
            width = Integer.parseInt(line.split(" ")[1]);

            for (int i = 0; i < height; i++) {
                line = br.readLine();
                for (int j = 0; j < width; j++) {
                    matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                }
            }
            br.close();
            matrix[posH][posW] = val;
            FileWriter fw = new FileWriter("matrix.txt");
            fw.write(height + " " + width + "\n");
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    fw.write(matrix[i][j] + " ");
                }
                fw.write("\n");
            }
            fw.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
*/

//tratare caz in care a fost modificat fisierul
//separare in diferite metode(citire matrice din fisier, scriere matrice in fisier, alocare spatiu in matrice
//tratare exceptii
