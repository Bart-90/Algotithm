package Week3;

import java.io.*;
import java.util.*;


public class GradingStudents {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<num; i++){
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }

        System.out.println(gradingStudents(list));

    }

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> resultGrade = new ArrayList<>();


        for(int i = 0; i<grades.size(); i++){
            if(grades.get(i) < 38){
                resultGrade.add(grades.get(i));
            }else if(grades.get(i) >= 37){
                int a = grades.get(i) / 5;
                int b = grades.get(i) % 5;
                if(b >= 3){
                    resultGrade.add((a+1)*5);
                }else if(b < 3){
                    resultGrade.add(grades.get(i));
                }
            }
        }

        return resultGrade;
    }

}

