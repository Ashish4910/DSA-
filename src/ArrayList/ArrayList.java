package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
class Main {
	public static ArrayList<Integer> reverseInteger (ArrayList<Integer> list){
	ArrayList<Integer> reverseInteger = new ArrayList<>();
	
	for(int i =list.size()-1 ;i>=0;i--){
		reverseInteger.add(list.get(i));
	}
	return reverseInteger;
	}
	
	public static int findMax(ArrayList<Integer> list){
		int max = Integer.MIN_VALUE;
		for(int i =0 ;i<list.size();i++){
			if(max < list.get(i)){
				max = list.get(i);
			}
		}
		return max;
	}
	
	public static ArrayList<Integer> swap2Number (ArrayList<Integer> list, int index1 , int index2){
		
		int temp = list.get(index1);
	  list.set(index1, list.get(index2));
	  list.set(index2, temp);
	  return list;
		
	}
	
	
	//create a multi-Dimensional ArrayList
	public static void multiDimensional(){
		
		ArrayList<ArrayList<Integer>> multi_d = new ArrayList<>();
		
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		
		for(int i = 0 ; i<5;i++){
			list.add(i*1);
			list2.add(i*2);
			list3.add(i*3);
		}
	
	multi_d.add(list);
	multi_d.add(list2);
	multi_d.add(list3);
	
		System.out.println("multiDimensional : "+ multi_d);
		
		for(int i = 0 ; i<multi_d.size() ;i++){
			ArrayList<Integer> currList = multi_d.get(i);
			for(int j = 0 ; j< currList.size() ; j++){
				System.out.print(currList.get(j) + " ");
			}
			System.out.println(" ");
		}
		
		
	}
	
	// container with most water
	
	// brute force approach
	public static int storeWater(ArrayList<Integer> height ){
		int max = 0;
		for(int i = 0 ; i < height.size(); i++){
			for(int j =i+1 ; j < height.size() ;j++){
				 int ht = Math.min(height.get(i), height.get(j));
				 int width = j-i;
				  int currWater = ht*width;
				  max = Math.max(max, currWater);
			}
		}
		return max;
	}
	
	
	// 2 pointer approach
	public static int storeWater2 (ArrayList<Integer> height){
		int max = 0 ;
		int lp = 0 ;
		int rp = height.size() - 1;
		
		while(lp < rp ){
			int ht = Math.min(height.get(lp), height.get(rp));
			int width = rp-lp ;
			
			int currwater = ht*width;
			
			max = Math.max(max , currwater);
			if(height.get(lp)< height.get(rp)){
				lp++;
			}else{
				rp--;
			}	
		}
		return max;
	}
	
	//brute force method 
	public static boolean pairSum1(ArrayList<Integer> list , int target){
		for(int i =0 ;i<list.size(); i++){
			for(int j=i+1;j < list.size();j++){
				if((list.get(i) + list.get(j) == target)){
					return true;
				}
			}
		}
		return false;
	}
	     
	// 2 pointer approach 
	public static boolean pairSum2(ArrayList<Integer> list , int target ){
		int lp = 0;
		int rp = list.size()-1;
		Collections.sort(list);
		while(lp<rp){
			if((list.get(lp) + list.get(rp)) == target){
				return true;
			}
			if((list.get(lp) + list.get(rp)) < target){
				lp++;
			}else{
				rp++;
			}
		}
		return false;
		
	} 	
	
	// main method  
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(8);
		list.add(6);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(8);
		list.add(3);
		list.add(7);
		list.add(1);
		// System.out.print(reverseInteger(list));
		// System.out.print(findMax(list));
		// System.out.print(swap2Number(list,1,3));
		
		// Collections.sort(list,Collections.reverseOrder());
		// System.out.print(list);
	// multiDimensional();
	// System.out.print(storeWater(list));
	// System.out.print(storeWater2(list));
	// System.out.print(pairSum1(list,10));
	System.out.print(pairSum2(list,10));
	}
}