package com.ewpum.java.se;

import org.junit.Test;


import static org.junit.Assert.*;


public class BitsetTest {

    @Test
    public void add() throws Exception {
        final Bitset set = new Bitset();
        assertFalse(set.contains(0));
        set.add(0);
        assertTrue(set.contains(0));
        set.add(65);
        assertTrue(set.contains(65));
        set.add(15);
        assertTrue(set.contains(15));
        set.add(-1);
        assertFalse(set.contains(-1));
        set.add(305);
        assertTrue(set.contains(305));
    }

    @Test
    public void remove() throws Exception {
        final Bitset set = new Bitset();
        assertFalse(set.contains(0));
        set.add(0);
        assertTrue(set.contains(0));
        set.add(65);
        assertTrue(set.contains(65));
        set.remove(0);
        assertFalse(set.contains(0));
        set.remove(65);
        assertFalse(set.contains(65));
    }

    @Test
    public void contains() throws Exception {
        Bitset set = new Bitset();
        for (int i = 62; i<300;i++){
            assertFalse(set.contains(i));
        }
        set.add(-1);
        set.add(-1);
        set.add(0);
        set.add(0);
        set.add(300);
        set.add(7);
        set.add(45);
        for (int i = -1; i<301;i++){
            if (i==0 || i==7 || i==45 || i==300){
                assertTrue(set.contains(i));
            }else {
                assertFalse(set.contains(i));
            }
        }
    }

    @Test
    public void union() throws Exception {
        final Bitset set = new Bitset();
        final Bitset set2 = new Bitset();
        set.add(0);
        set.add(2);
        set.add(4);
        set.add(63);
        set2.add(1);
        set2.add(3);
        set2.add(5);
        set2.add(300);
        Bitset set3 = set.union(set2);
        assertTrue(set3.contains(0));
        assertTrue(set3.contains(1));
        assertTrue(set3.contains(2));
        assertTrue(set3.contains(3));
        assertTrue(set3.contains(4));
        assertTrue(set3.contains(5));
        assertTrue(set3.contains(300));
    }

    @Test
    public void intersect() throws Exception {
        final Bitset set = new Bitset();
        final Bitset set2 = new Bitset();
        set.add(0);
        set.add(2);
        set.add(4);
        set.add(300);
        set2.add(1);
        set2.add(3);
        set2.add(5);
        set2.add(300);
        Bitset set3 = set.intersect(set2);
        assertFalse(set3.contains(0));
        assertFalse(set3.contains(1));
        assertFalse(set3.contains(2));
        assertFalse(set3.contains(3));
        assertFalse(set3.contains(4));
        assertFalse(set3.contains(5));
        assertTrue(set3.contains(300));
    }
    @Test
    public void difference() throws Exception {
        final Bitset set = new Bitset();
        final Bitset set2 = new Bitset();
        set.add(0);
        set.add(2);
        set.add(4);
        set.add(300);
        set2.add(1);
        set2.add(2);
        set2.add(5);
        set2.add(300);
        Bitset set3 = set.difference(set2);
        assertTrue (set3.contains(0));
        assertFalse(set3.contains(1));
        assertFalse(set3.contains(2));
        assertFalse(set3.contains(3));
        assertTrue (set3.contains(4));
        assertFalse(set3.contains(5));
        assertFalse(set3.contains(300));
    }
    @Test
    public void subset() throws Exception {
        final Bitset set = new Bitset();
        final Bitset set2 = new Bitset();
        final Bitset set3 = new Bitset();
        set.add(0);
        set.add(2);
        set.add(4);
        set.add(300);
        set2.add(1);
        set2.add(60);
        set3.add(4);
        set3.add(300);
        assertFalse(set.subset(set2));
        assertTrue (set.subset(set3));

    }


}