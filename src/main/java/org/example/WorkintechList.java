package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {
    @Override
    public boolean add(T element) {
        if (!this.contains(element)) { // Eğer eleman listede yoksa
            boolean isAdded = super.add(element); // ArrayList'in add metodunu çağır
            this.sort(); // Eleman eklendikten sonra listeyi sırala
            return isAdded;
        }
        return false; // Eleman zaten varsa ekleme
    }

    public void sort() {
        Collections.sort(this); // ArrayList'teki elemanları sıralar
    }

    public boolean remove(Object obj) {
        boolean isRemoved = super.remove(obj); // ArrayList'in remove metodunu çağır
        if (isRemoved) {
            this.sort(); // Eleman silindikten sonra listeyi sırala
        }
        return isRemoved;
    }
}
