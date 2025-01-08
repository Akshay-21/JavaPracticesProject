package testprograms;

import java.util.*;


class PrefixPostfixOperator{

public static void main(String[] args){
        // Creating an empty Map
        Map<Integer, Integer> map = new HashMap<>();
 
        // Mapping string values to int keys
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);
        map.put(5, 500);
 
        // Displaying the Map
        System.out.println("Initial Mappings are: " + map);
 
        // Getting the value of 1
        System.out.println("The Value is: " + map.get(1));
 
        // Getting the value of 2
        System.out.println("The Value is: " + map.get(2) +" ");    


	if(map.containsKey(5)){
	map.put(5, map.get(5) + 1);
	}

	System.out.println(map);

}

}