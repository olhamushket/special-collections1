//package com.efimchick.ifmo.collections;
//
//import java.util.*;

//class SortedByAbsoluteValueIntegerSet extends TreeSet<Integer> {
//    Set<Integer> set = new TreeSet<>(new AbsComparator());
//    @Override
//    public int size() {
//        return set.size();
//    }
//
//    @Override
//    public Iterator<Integer> iterator() {
//        return set.iterator();
//    }
//
//    @Override
//    public boolean add(Integer element) {
//        return set.add(element);
//    }
//    static class AbsComparator implements Comparator<Integer> {
//
//        @Override
//        public int compare(Integer o1, Integer o2) {
//            return Math.abs(o1)-Math.abs(o2);
//        }
//    }
//    @Override
//    public boolean remove(Object o) {
//        return set.remove(o);
//    }
//    @Override
//    public boolean addAll(Collection<?  extends  Integer> c) {
////        int colSize=c.size();
////        Iterator<? extends  Integer> it=c.iterator();
////        for (int i = 0; i <colSize; i++) {
////            Integer value = it.next();
////            set.add(value);
////        }
//        set.addAll(c);
//        return true;
//    }
//
//    @Override
//    public void clear() {
//        set.clear();
//    }
//
//}
package com.efimchick.ifmo.collections;


import java.util.*;

class SortedByAbsoluteValueIntegerSet extends TreeSet<Integer> {

    Set<Integer> sortedSet = new TreeSet<>(new AbsComparator());

    @Override
    public int size() {
        return sortedSet.size();
    }

    @Override
    public void clear() {
        sortedSet.clear();
    }

    @Override
    public boolean add(Integer element) {
        return sortedSet.add(element);
    }

    static class AbsComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer v1, Integer v2) {
            return Math.abs(v1) - Math.abs(v2);
        }
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        int collectionSize = c.size();
        Iterator<? extends Integer> it = c.iterator();
        for (int i = 0; i < collectionSize; i++) {
            Integer value = it.next();
            sortedSet.add(value);
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return sortedSet.remove(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return sortedSet.iterator();
    }
    @Override
    public Spliterator<Integer> spliterator() {
        return sortedSet.spliterator();
    }

    @Override
    public boolean contains(Object o) {
        return sortedSet.contains(o);
    }
}