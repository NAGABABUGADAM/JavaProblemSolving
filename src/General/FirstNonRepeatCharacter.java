package General;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatCharacter {

    public static void main(String[] args) {

        String name = "agrababgPN";
        int count;
        Map<Character,Integer> characterIntegerMap = new LinkedHashMap<>();

        for(Character c:name.toCharArray()){

            if(!characterIntegerMap.containsKey(c)){
                characterIntegerMap.put(c,1);

            }else{
                Integer value = characterIntegerMap.get(c);
                characterIntegerMap.put(c,++value);

            }
        }

        System.out.println(characterIntegerMap.toString());

        for(Map.Entry<Character,Integer> entry: characterIntegerMap.entrySet()){

            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }



    }
}
