import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
public class homework3_1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);  
        list.add(2); 
        list.add(3); 
        list.add(4); 
        list.add(5); 
        System.out.println(list);
        removingEvenNumbers(list);
        System.out.println(list);
    }
    static void removingEvenNumbers (List<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num%2==0) {
                iterator.remove();
            }
        }
    }
  
}