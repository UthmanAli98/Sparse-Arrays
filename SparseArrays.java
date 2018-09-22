/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sparsearrays;

import java.util.HashMap;

/**
 *
 * @author Uthman Alibalogun
 */
public class SparseArrays {

    /**
     * @param args the command line arguments
     */
    static int[] matchingStrings(String[] strings, String[] queries) {
        
        int[] result = new int[queries.length];
        HashMap<String, Integer> hashMap = new HashMap();
        
        for(int i = 0; i < queries.length ; i++){
        /**
         * Put all the queries in a hashMap for easy look up 
         * I set the index as the key just for easier look up in the future
         */
        hashMap.put(queries[i],i);
        }
        /**
         * Iterate through the strings and if it is in the hashMap then increment else do nothing
         */
        for(int i = 0; i < strings.length; i++){
            if(hashMap.containsKey(strings[i])){
            
            result[hashMap.get(strings[i])]++;
            }
        
        }

        return result;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] query = {"abc", "abd", "efg"};
        String[] strings = {"abc", "abc", "efg", "bac"};
        
        int[] result = matchingStrings(strings, query);
        
        for(int i = 0; i < result.length; i++ ){
        
        System.out.print(" "+ result[i]);
        }
        
         
    }
    
}
