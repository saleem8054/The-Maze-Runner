import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;

public class FileReader {
    private int map[][];
    private String fileName;
    private int numOfRows;
    private int numOfCols;
    private int startPosCol;
    private int startPosRow;

    public FileReader(String fileName, int numOfRows, int numOfCols) {
        this.map = new int[numOfRows][numOfCols];
        this.fileName = fileName;
        this.numOfRows = numOfRows;
        this.numOfCols = numOfCols;
    }

    public void parseFile(){
        try{
            Scanner scanner = new Scanner(new BufferedReader(new java.io.FileReader(this.fileName)));

            for(int i=0;i<numOfRows;i++){
                for(int j=0;j<numOfCols;j++){
                    map[i][j] = scanner.nextInt();

                    if(map[i][j] == 2){
                        startPosCol = j;
                        startPosRow = i;
                    }
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void print() {
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfCols; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    public int[][] getMap() {
        return map;
    }

    public int getStartPosCol() {
        return startPosCol;
    }

    public int getStartPosRow() {
        return startPosRow;
    }
}
