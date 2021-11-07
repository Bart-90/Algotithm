import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bj8958 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = getNum(br);
        String[][] arr = input(num, br);
        int score = getScore(arr, num);

        System.out.println(score);
    }

    public static int getNum(BufferedReader br) throws IOException{

        int num = Integer.parseInt(br.readLine());

        return num;
    }

    public static String[][] input(int num, BufferedReader br) throws IOException{

        String[] arr = new String[num];

        for(int i = 0; i < num; i++){
            arr[i] = br.readLine();
        }

        String[][] arrSplit = new String[num][arr.length];

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arrSplit[i] = arr[i].split("");
            }
        }

        br.close();

        return arrSplit;
    }

    public static int getScore(String [][] arrSplit, int num){

        int[] scores = new int[num];
        int score = 0;
        int plus = 1;
        boolean bl = false;

        for(int i = 0; i < arrSplit.length; i++){
            for(int j = 0; j < arrSplit[i].length; j++) {
                if(arrSplit[i][j].equals("O")){

                    if(j == arrSplit[i].length){
                        bl = true;
                        plus = 1;
                    }else{
                        score = score + plus;
                        scores[i] = score;
                        plus++;
                    }
                }else if(arrSplit[i][j].equals("X")){
                    plus = 1;
                }
                System.out.println(arrSplit[j].length);
            }
        }



        return score;
    }

}
