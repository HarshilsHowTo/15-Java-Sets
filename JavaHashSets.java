import java.util.HashSet;
import java.util.Set;

public class JavaHashSets {
    public static void main(String[] args) {

        Set<Integer> myNums = new HashSet<Integer>(100, (float)0.75);
        myNums.add(5);
        myNums.add(3);
        myNums.add(1);

//        System.out.println(myNums.contains(6));
//        System.out.println(myNums.contains(1));

        System.out.println(myNums.size());
        myNums.remove(3);
        System.out.println(myNums.size());
        myNums.clear();
        System.out.println(myNums.size());





    }
}
