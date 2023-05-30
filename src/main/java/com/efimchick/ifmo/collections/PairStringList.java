package com.efimchick.ifmo.collections;

import java.util.*;

class PairStringList implements List<String> {
    List<String> list;


    public PairStringList() {
        this.list= new LinkedList<>();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return list.toArray(a);
    }

    @Override
    public boolean add(String str) {
        list.add(str);
        list.add(str);
        return true;
    }
    @Override
    public void add(int index, String str) {
        if ((index + 1) % 2 == 0) {
            list.add(index + 1, str);
            list.add(index + 1, str);
        } else {
            list.add(index, str);
            list.add(index, str);
        }
    }
    public boolean remove(Object o) {
        list.remove(o);
        list.remove(o);
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        List<String> c1 = new ArrayList<>(c);
        for (int i = 0; i <c.size()+2; i+=2) {
            c1.add(i, c1.get(i));
        }
        return list.addAll(c1);
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        if (index%2!=0) { index++;}
        List<String> c1 = new ArrayList<>(c);
        for (int i = 0; i <c.size()+2; i+=2) {
            c1.add(i, c1.get(i));
        }
        list.addAll(index,c1);
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void sort(Comparator<? super String> c) {
        List.super.sort(c);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public String get(int index) {
        return list.get(index);
    }

    @Override
    public String set(int index, String element) {
        if (index%2!=0) {
            list.set(index-1, element);
        } else { list.set(index+1,element);}
        return list.set(index,element);
    }

    @Override
    public String remove(int index) {
        list.remove(index);
        index--;
        return list.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<String> listIterator() {
        return list.listIterator();
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return list.listIterator(index);
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return list.subList(fromIndex, toIndex);
    }

//    public boolean addCollByIndex(int index, Collection<String> col) {
//        for (int i = 0; i <list.size() ; i++) {
//            if (list.get(index+i) == null) {
//                list.addAll(index, col);
//                return true;
//            }
//        }
//        return false;
//    }

}
