package MultiDimensionalArrays;
import java.util.*;
public class ArrayListTwoDim {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10); a.add(20); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40); b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a); l.add(b); l.add(c); l.add(d);


        // for(int i=0; i<a.size();i++){        //without brackets
        //     System.out.print(a.get(i)+" ");
        // }
        
        // for(int i=0; i<l.size(); i++){
        //     System.out.println(l.get(i));
        // }

        for(int i=0;i<l.size(); i++){
            for(int j=0; j<l.get(i);j++){
                
            }
        }

    }
}
