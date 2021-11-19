package Week3;

import java.util.ArrayList;
import java.util.List;

public class ComparetheTriplets {

    public static void main(String[] args) {


        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(5);
        a.add(7);
        List<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(3);
        b.add(8);

        System.out.println(compareTriplets(a,b));
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int alice = 0;
        int bob = 0;

        for(int i = 0; i < a.size(); i++){
            if (a.get(i) > b.get(i)) {
                alice++;
            } else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }

        result.add(alice);
        result.add(bob);

        return result;
    }
}
