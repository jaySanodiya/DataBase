package com.masai.EvalluationC2.Question1;

public class BinarySearch {

    public int binarySearch(int[] arr, int target,SortAlgo UseThisAlgo){

      // sort the array first using sort()
        SortAlgo sortAlgo = UseThisAlgo;


            /* binary search Algorithm
             * no need to implement that
             * Assume it is here
             */
      return target;
    }
}

class SortAlgo{}

class BubbleSortAlgo extends SortAlgo{
    public BubbleSortAlgo(int[] arr) {
        System.out.println("Array sorted using bubble sort\n");
    }

}
class SelectionSortAlgo extends SortAlgo {
    public SelectionSortAlgo(int[] arr) {
        System.out.println("Array sorted using selection sort\n");
    }


}
class OtherSortAlgo  extends SortAlgo{
    public OtherSortAlgo(int[] arr) {
        System.out.println("Array sorted using other sort\n");
    }

}
class SearchingRunner {
    public static void main(String[] args) {
        int[] arr={1,3,2}; //unsorted array
        int target=3;

        BinarySearch bs1=new BinarySearch( /*use bubble sort algorithm*/);
        bs1.binarySearch(arr,target,new BubbleSortAlgo(arr));

        BinarySearch bs2=new BinarySearch( /*use selection sort algorithm*/);
        bs2.binarySearch(arr,target, new SelectionSortAlgo(arr));

        BinarySearch bs3=new BinarySearch( /*use another algorithm*/);
        bs3.binarySearch(arr,target,new OtherSortAlgo(arr));
    }
}