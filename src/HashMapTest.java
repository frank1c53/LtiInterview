import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        String str = "ltimindtree";
       //find which characters are repeating
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            }else{
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
        }

        //System.out.println(map);
        map.forEach((k,v)->{
            if(v>1){
                System.out.println("key:"+k+" value:"+v);
            }
        });

        for(Character name : map.keySet()){
            System.out.println("key"+name.toString()+"Valye"+map.get(name));
        }
    }
}
