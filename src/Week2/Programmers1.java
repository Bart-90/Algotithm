package Week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers1 {

    public static void main(String[] args) {
        Programmers1 pr1 = new Programmers1();

        int[] arr = {5, 9, 7, 10};

        int[] answer = pr1.solution(arr,5);
        for(int i = 0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }

    public int[] solution(int[] arr, int divisor) {

        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int num = 0;

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i]%divisor == 0){
                list.add(arr[i]);
                num++;
            }else if(arr[i]%divisor != 0){
                if(i == arr.length-1) {
                    list.add(-1);
                    num = 1;
                }
                break;
            }
        }

        //Collections.sort(list);
        System.out.println(list);

        answer = new int[num];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
