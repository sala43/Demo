import java.util.*;

public class Rough {
    public static void main(String[] args) {
        String[] list = new String[9];
        list[0] = "sala";
        list[1] = "kaala";

        list[2] = "aala";
      //  Arrays.fill(list, "anna");
Arrays.sort(list);

        // Collections.sort(list);
       // System.out.println(list);

       for(int i=0;i<list.length;i++){
        System.out.println(list[i]);
       }
        // for(String name:list){
        // System.out.println(name);
        // }

    }
}
