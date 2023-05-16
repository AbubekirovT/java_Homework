import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.lang.model.util.ElementScanner14;

/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
Вывести название каждой планеты и количество его повторений в списке. 
*/

public class homework3_3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mars","Mercury","Uranus","Uranus","Mars","Venus","Venus","Venus","Venus","Venus", "Neptune",
        "Saturn", "Earth", "Mars", "Jupiter", "Saturn", "Uranus","Neptune");
        ex3(list);
    }
    static void ex3(List<String> list){
        Collections.sort(list);
        System.out.println(list);  
        Integer counter = 1;
        for (int i = 1; i < list.size(); i++) {
            if ((list.get(i)).equals(list.get(i-1)) ) {
                counter++;    
            }else{
                System.out.println(list.get(i-1) + ": " + counter);
                counter = 1;
            }
            if (i==(list.size()-1)) {
                if ((list.get(i)).equals(list.get(i-1)) ) { 
                    System.out.println(list.get(i) + ": " + counter);  
                }else{
                    System.out.println(list.get(i) + ": 1");
                }
            }
        }
        
    }
}
