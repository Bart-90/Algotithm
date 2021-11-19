package Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2920 {

    public static void main(String[] args){

        try {
            print(getOrder(getArr()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

        public static int[] getArr() throws IOException {

            int[] arr = new int[8];
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i = 0; i < arr.length; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            br.close();

            return arr;
        }


        public static String getOrder(int[] arr){

            boolean asc = true;
            boolean dec = true;
            String str = "";

            try {
                for(int i = 0; i < arr.length; i++){
                    for(int j = 0; j < arr.length; j++){

                        if(arr[i] < arr[i+1]){
                            dec = false;
                        }else if(arr[i] > arr[i+1]) {
                            asc = false;
                        }
                    }
                }
            }catch (ArrayIndexOutOfBoundsException e){
                e.getMessage();
            }

            if(dec == false && asc == false){
                str = "mixed";
            }else if(asc == false){
                str = "descending";
            }else if(dec == false){
                str = "ascending";
            }

            return str;
        }

        public static void print(String str){

            System.out.println(str);

        }

}
