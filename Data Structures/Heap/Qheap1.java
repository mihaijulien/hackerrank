import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Heap heap = new Heap();
        
        Scanner scanner = new Scanner(System.in);
        int query = scanner.nextInt();
        
        for(int i = 0; i < query; i++) {
            
            int queryType = scanner.nextInt();
            
            if(queryType == 1) {
                int add = scanner.nextInt();
                heap.insert(add);
            }
            
            else if(queryType == 2) {
                int del = scanner.nextInt();
                heap.delete(del);
            }
            else { 
                System.out.println(heap.getMinimum());
            }
        }
        
        scanner.close();
    }
    
    static class Heap{
        
        private List<Integer> heap;
        
        public Heap(){
            this.heap = new ArrayList<>();
        }
        
        public void insert(int key){
            heap.add(key);
            int current = heap.size() - 1;
            // MinHeap
            while(heap.get(getParent(current)) > heap.get(current)){
                swap(current, getParent(current));
                current = getParent(current);
            }
        }
        
        public void delete(int key){
            // not a heap operation, as heaps remove the root element
            int pos = heap.indexOf(key);
            
            heap.set(pos, heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);
            minHeapify(pos);
        }
        
        public int getMinimum(){
            return heap.get(0);
        }
        
        private void minHeapify(int pos){
            int left = getLeftChild(pos);
            int right = getRightChild(pos);
            int smallest = pos;
            
            if(left < heap.size() - 1 && heap.get(left) < heap.get(smallest)){
                smallest = left;
            }
            if(right < heap.size() - 1 && heap.get(right) < heap.get(smallest)){
                smallest = right;
            }
            if(smallest != pos){
                swap(smallest, pos);
                minHeapify(smallest);
            }
        }
        
        private void swap(int pos1, int pos2){
            int temp = heap.get(pos1);
            heap.set(pos1, heap.get(pos2));
            heap.set(pos2, temp);
        }
        
        private int getParent(int pos){
            return pos / 2;
        }
        
        private int getLeftChild(int pos){
            return 2 * pos + 1;
        }
        
        private int getRightChild(int pos){
            return 2 * pos + 2;
        }
    }
}
