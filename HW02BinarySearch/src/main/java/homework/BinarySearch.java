package homework;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.Random;

public class BinarySearch {
    private int[] preparedTree;
    private int midPosition;
    private int lo=0;
    private int hi;

    /**
     * Construct tree from ready array
     * @param preparedTree  Already existed and merged array
     */
    public BinarySearch(int[] preparedTree) {
        this.preparedTree = preparedTree;
        hi=preparedTree.length-1;
    }

    /**
     * Generate tree of arrayLength
     *
     */
    public BinarySearch(int arrayLength) {
        this.generateSortedBinaryTree(arrayLength);
        hi=arrayLength-1;
    }

    /**
     * Finging middle element
     * @return middle element
     */
    public int getMid (){
        return lo+(hi-lo)/2;
    }

    /**
     * Search value in tree
     *
     * @return true if found
     */
    /*//Cycled realisation

    public boolean consist (int value){
        hi=preparedTree.length-1;
        while (lo<=hi){
            if (value==preparedTree[getMid()]){
                return true;
            }else if (value<preparedTree[getMid()]){
                hi=getMid()-1;
            }else {
                lo=getMid()+1;
            }
        }
        return false;
    }*/
    //Recursion realisation
    public boolean consist (int value){
        hi=preparedTree.length-1;
        lo=0;
        return consist(value, this.lo, this.hi);
    }

    /**
     * Search value in tree with recursion
     *
     * @param lo ID of lowest element
     * @param hi ID of highest element
     * @return true if found
     */
    public boolean consist (int value,int lo,int hi){
        this.lo=lo;
        this.hi=hi;
        this.midPosition=getMid();
        if ((lo==hi && value!=preparedTree[lo]) || value<preparedTree[lo]){
            return false;
        }
        if (value<preparedTree[midPosition]){
            hi=midPosition-1;
            return consist(value,lo,hi);
        }else if(value>preparedTree[midPosition]){
            lo=midPosition+1;
            return consist(value,lo,hi);
        }else{
            return true;
        }
    }

    /**
     * Returns value`s level in tree if tree consists it
     *
     * @return level or -1 if value doesn't belong to tree
     */
    public int getElementLevelInTree(int value){
        hi=preparedTree.length-1;
        int level=1;
        while (lo<=hi){
            if (value==preparedTree[getMid()]){
                return level;
            }else if (value<preparedTree[getMid()]){
                hi=getMid()-1;
            }else {
                lo=getMid()+1;
            }
            level++;
        }
        return -1;
    }

    /**
     * Generate sorted array of "arrayLength"
     */
    public void generateSortedBinaryTree(int arrayLength){
        Random random=new Random();
        int[] array = new int[arrayLength];
        for (int i=0; i<arrayLength;i++){
            if (i==0)array[i]=random.nextInt(10)+1;
            else array[i]=array[i-1]+random.nextInt(10)+1;
        }
        this.preparedTree = array;
    }

    /**
     * Length of current binary tree`s array
     * @return
     */
    int getLength(){
        return preparedTree.length;
    }

    /**
     * Getting element from array by ID
     * @param id
     * @return
     */
    int getValueByID(int id){
        return preparedTree[id];
    }

}
