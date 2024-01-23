import java.util.*;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {
        String str = "ABCDEFGABEF";
        int x = 10;
        HashSet<Character> set=new HashSet<>();
        int count=0;
        char c[] = str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(!set.add(c[i])){
                break;
            }else{
                count++;
            }
        }

        System.out.println(count);


    }

}