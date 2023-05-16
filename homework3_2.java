import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max() */

public class homework3_2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 20, 4, 10);
        System.out.println(list);
        System.out.println(Collections.min(list)); 
        System.out.println(Collections.max(list)); 
        double avg = average(list);
        System.out.println(avg);
        
    }
    static double average(List<Integer> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        double res = sum/list.size();
        return res;
    }
}
