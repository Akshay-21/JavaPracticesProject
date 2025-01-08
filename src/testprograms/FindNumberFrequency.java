package testprograms;

import java.util.*;
// javap -c FindNumberFrequency (Compiled class info)

class FindNumberFrequency{

	public static void main(String args[]){
		int arr[] = {10,9,10,23,34,32,24,9,18,10,98,10,4,10,9,10};
		HashMap<Integer, Integer> hashmap = new HashMap<>();

	for(int i= 0; i<arr.length; i++){
		int a = arr[i];

		if(hashmap.containsKey(a)){
			int count = hashmap.get(arr[i]);
			hashmap.put(a, count+1);
			System.out.println("Contains Key GetValue:- " + "Key->"+ a + " Count->" + hashmap.get(arr[i]));
		}else {
			System.out.println("Not Contains Key:- " + "Key->"+ a + " Count->" + hashmap.get(arr[i]));
			hashmap.put(a, 1);
		}
	  }
	System.out.println(hashmap);
	}
}


// =================================================================================================================================
/*
class FindNumberFrequency {

public static void main(String args[]){


int arr[] = {10,9,10,23,34,32,24,9,18,10,98,10,4,10,9,10};

// int arr[] = {98,34,56,89,98,10,2,7,2,6,9,5,2,10,98,89,89,1,3,5,10,34,50,98,45,98,1};


HashMap<Integer, Integer> hashMap = new HashMap<>();
	for(int i = 0; i<arr.length; i++){		
	 int a = arr[i];
	 int count = 1;
	  for(int j = 0; j<arr.length; j++){
	   if(a == arr[j]){		
		hashMap.put(a, count++);
		System.out.print(arr[i]);
	   }else{
		hashMap.put(a, 1);
		}
	  }
	  System.out.println();

}

System.out.println("Result");
System.out.println(hashMap);

}
}

*/