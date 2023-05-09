package org.example.data_structures.priorityQueue;

public interface AbstractQueue<E extends Comparable<E>> {
    int size();
    void add(E element);
    E peek();
    E poll();
}
