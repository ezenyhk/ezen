import java.util.Arrays;

public class Sudoku {
    public static void main(String[] args) {
        int[][] sudoku = new int[9][9];

        for (int i = 0; i < sudoku.length; i++) {
            Arrays.fill(sudoku[i], 0); // 모든 원소를 0으로 초기화
        }


        int[] rowSum = new int[9];
        int[] colSum = new int[9];
        int[][] boxSum = new int[3][3];

        boolean[][] rowHas = new boolean[9][10];
        for (int i = 0; i < rowHas.length; i++) {
            Arrays.fill(rowHas[i], false);
        }

        boolean[][] colHas = new boolean[9][10];
        for (int i = 0; i < colHas.length; i++) {
            Arrays.fill(colHas[i], false);
        }

        boolean[][][] boxHas = new boolean[3][3][10];
        for (int i = 0; i < boxHas.length; i++) {
            for (int j = 0; j < boxHas[i].length; j++) {
                Arrays.fill(boxHas[i][j], false);
            }
        }
        for (int i = 0; i < 3; i++) {
            Arrays.fill(boxSum[i], 0);
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int rnd = 0;
                int count = 0;
                while (true) { // 조건에 맞는 난수가 나올 때까지 반복
                    rnd = (int)(Math.random()*9) + 1;
                    if (rowSum[i] + rnd <= 45
                            && colSum[j] + rnd <= 45
                            && boxSum[i/3][j/3] <= 45
                            && rowHas[i][rnd] == false
                            && colHas[j][rnd] == false
                            && boxHas[i/3][j/3][rnd] == false) {
                        rowSum[i] += rnd;
                        rowHas[i][rnd] = true;
                        colSum[j] += rnd;
                        colHas[j][rnd] = true;
                        boxSum[i/3][j/3] += rnd;
                        boxHas[i/3][j/3][rnd] = true;
                        break;
                    }
                }
                // 적당히 빈칸을 만드는 로직을 추가
                sudoku[i][j] = rnd;
                rowSum[i] = 0;
                colSum[j] = 0;
                boxSum[i/3][j/3] = 0;
            }
        }



        // 출력 파트
        System.out.println("+-+-+-+-+-+-+-+-+-+");
        for (int i = 0; i < sudoku.length; i++) {
            System.out.print("|");
            for (int j = 0; j < sudoku[i].length; j++)
                System.out.printf("%d|", sudoku[i][j]);
            System.out.println("\n|-+-+-+-+-+-+-+-+-|");
        }
    }
}

