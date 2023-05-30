package com.efimchick.ifmo.collections;

import java.util.*;

class MedianQueue extends ArrayDeque<Integer> {
    private List<Integer> values = new ArrayList<>(this);
    private final Queue<Integer> queue = new ArrayDeque<>();

    public boolean offer(Integer value) {
        values.add(value);
        creatingAQueue();
        return true;
    }

    public Integer poll() {
        Integer value = queue.poll();
        values.remove(0);
        creatingAQueue();
        return value;
    }


    public Integer peek() {
        return queue.peek();
    }

    @Override
    public int size() {
        return queue.size();
    }

    private void creatingAQueue() {
        Collections.sort(values);
        queue.clear();
        while (values.size() != 0) {
            int index;
            if (values.size() % 2 == 0)
                index = values.size() / 2 - 1;
            else {
                index = values.size() / 2;
            }
            queue.add(values.remove(index));
        }
        values = new ArrayList<>(queue);
    }
}