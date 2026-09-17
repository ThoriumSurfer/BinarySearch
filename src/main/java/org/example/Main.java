package org.example;

import java.nio.file.ClosedWatchServiceException;

//Makail Casey 9/16/2026 cosc 214

//https://github.com/ThoriumSurfer/BinarySearch.git

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    
    public static int binSearch( String searchVal, String[] arr,
                          int low, int high ) {
        
        System.out.println("Calling binSearch with low:" + low + " high " + high);
        
        int mid = ( low + high )/2;
        
        if (high < low) {
            return -1;
        }
        
        int comp = searchVal.compareTo( arr[mid] ); // arr[mid] == search_key // Compareto
        //gives 1 to 3 values = 0, 1, -1
        
        if( comp == 0 ) {
            return mid;
            
        }
        else if (comp < 0) {
            
            return binSearch(searchVal, arr, low, mid-1);
            
        }
        else
            return binSearch(searchVal, arr, mid+1, high);
        
        
    }
    
    public static void main(String[] args) {
        
        String[] name_val = {"act", "art", "ban", "bat", "bar", "cat", "cot", "hat", "mat",
        "pet", "sat", "set", "tic", "tac", "toe"};
        
        String search_key = "toe";
        
        int index = binSearch(search_key, name_val, 0, 14);
        
        System.out.printf("Found at index: " + index);
        
       
        
    }
    
}