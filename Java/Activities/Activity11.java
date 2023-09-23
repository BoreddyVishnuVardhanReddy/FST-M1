package activities;

import java.util.HashMap;
public class Activity11 {
    public static void main(String args[]){
        HashMap<Integer,String> hash_Map=new HashMap<Integer, String>();
        hash_Map.put(1,"Red");
        hash_Map.put(2,"Green");
        hash_Map.put(3,"Blue");
        hash_Map.put(4,"White");
        hash_Map.put(5,"Black");
        System.out.println("The Original Map:"+hash_Map);

        hash_Map.remove(4);
        System.out.println("After Removing White"+hash_Map);

        if(hash_Map.containsValue("Green"))
        {
            System.out.println("Green exists in the Map");
        }
        else {
            System.out.println("Green does not exist in map");
        }
        System.out.println("Number of pairs in the map is "+hash_Map.size());
    }
}
