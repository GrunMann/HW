package com.ewpum.java.se;

import java.util.stream.LongStream;

public class Bitset {

    private long[] mainSet;

    public Bitset() {
        this(new long [1]);
    }
    private Bitset(long[] data){
        this.mainSet= data;
    }

    /**
     * Create new array of neccessary length
     *
     * @param data array for changing
     * @param position count of new length
     * @return array conteins data`s data and additional empty fields
     *
     */
    private long[] updateLength(long[] data, int position){
        if ( position < 0){return new long[1];}
        long[] buff = data;
        data = new long[position+1];
        System.arraycopy(buff,0,data,0, buff.length);
        return data;
    }

    /**
     * Add a new value and change array if needed
     *
     */

    public void add (int value){
        if (value<0){return;}
        if (mainSet.length-1 < (value)/64){
            this.mainSet=updateLength(this.mainSet,value/64);
            add(value);
        } else {
            if ((value+1)%64!=0){
                mainSet[(value+1) / 64] |= 1L << value%64;
            }
            else if (value==0){
                mainSet[(value+1) / 64] |= 1L << 0;
            }else {
                mainSet[((value+1)/64)-1] |= 1L << 63;
            }
        }
    }

    /**
     * Remove element without array changing
     *
     */
    public void remove(int value){
        if (value<0){return;}
        mainSet[value/63] &= ~(1L << value%64);
    }

    /**
     * Check array for containing the value
     *
     */
    public boolean contains (int value){
        if (value<0 || ((value)/64)> mainSet.length-1){
            return false;
        }
        final long mask = 1L << value%64;
        final long res =  mainSet[(value)/64] & mask;
        return res !=0;
    }

    /**
     * Union with other array
     *
     */
    public Bitset union(Bitset other){

        if (other.mainSet.length < this.mainSet.length){
            other.mainSet=updateLength(other.mainSet,this.mainSet.length);
        }else{
            this.mainSet=updateLength(this.mainSet,other.mainSet.length);
        }
        Bitset bitset = new Bitset(other.mainSet);
        for (int i=0; i<this.mainSet.length-1; i++ ){
            bitset.mainSet[i]=this.mainSet[i] | other.mainSet[i];
        }
        return bitset;
    }

    /**
     * Return array for intersection with different array
     *
     * For example:
     *   1100 and 0101 = 0100
     *
     */
    public Bitset intersect (Bitset other){
        if (other.mainSet.length < this.mainSet.length){
            other.mainSet=updateLength(other.mainSet,this.mainSet.length);
        }else{
            this.mainSet=updateLength(this.mainSet,other.mainSet.length);
        }
        Bitset bitset = new Bitset(other.mainSet);
        for (int i=0; i<this.mainSet.length-1; i++ ){
            bitset.mainSet[i]=this.mainSet[i] & other.mainSet[i];
        }
        return bitset;
    }

    /**
     * Return values, not belonged to different array
     *
     * For example
     *   1100 and 0101 = 1000
     *
     */
    public Bitset difference(Bitset other){
        if (other.mainSet.length < this.mainSet.length){
            other.mainSet=updateLength(other.mainSet,this.mainSet.length);
        }else{
            this.mainSet=updateLength(this.mainSet,other.mainSet.length);
        }
        Bitset bitsetAnd  = new Bitset();
        bitsetAnd.mainSet=updateLength(bitsetAnd.mainSet,this.mainSet.length);
        Bitset bitsetDiff = new Bitset();
        bitsetDiff.mainSet=updateLength(bitsetDiff.mainSet,this.mainSet.length);
        for (int i=0; i<this.mainSet.length-1; i++ ){
            bitsetAnd.mainSet[i]=this.mainSet[i] & other.mainSet[i];
        }
        for (int i=0; i<this.mainSet.length-1; i++ ){
            bitsetDiff.mainSet[i]=this.mainSet[i] & ~bitsetAnd.mainSet[i];
        }
        return bitsetDiff;
    }

    /**
     * Return true if array contains all values of different array
     *
     *   110010 and 010100 = false
     *   110010 and 010010 = true
     *
     * @return True if contain
     */
    public boolean subset(Bitset other){
        if (other.mainSet.length > this.mainSet.length){
            return false;
        }
        for (int i=0; i<=other.mainSet.length-1; i++ ){
            if(other.mainSet[i]>0b0 && (this.mainSet[i] & other.mainSet[i]) == 0 ) {
                return false;
            }else{
                long buff = this.mainSet[i] & other.mainSet[i];
                if ((buff ^ other.mainSet[i]) > 0){
                    return false;
                }
            }
        }
        return true;
    }
}
