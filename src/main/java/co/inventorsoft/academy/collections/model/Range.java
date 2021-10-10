package co.inventorsoft.academy.collections.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

public class Range<T> implements Set<T> {

    private HashSet<T> range;


    public Range(T arg1, T arg2){
        range = new HashSet<>();
        if(arg1.getClass() == Integer.class && arg2.getClass() == Integer.class){
            for(Integer i = (Integer) arg1; i <= (Integer) arg2; i++){
                range.add((T)i);
            }
        }
        if(arg1.getClass() == Float.class && arg2.getClass() == Float.class){
            for(Float i = (Float) arg1; i <= (Float) arg2; i+=0.1f){
                range.add((T)i);
            }
        }
    }


    public Range(T arg1, T arg2, Function<T, T> function){
        range = new HashSet<>();

        if(arg1.getClass() == Character.class && arg2.getClass() == Character.class){
            for(Character i = (Character) arg1; i <= (Character) arg2; i++){
                range.add((T)i);
            }
        }
    }

    public int size() {
        return range.size();
    }

    public boolean isEmpty() {
        return range.size() <= 1;
    }

    public boolean contains(Object o) {
        return range.contains(o);
    }

    public Iterator<T> iterator() {
        return range.iterator();
    }

    public Object[] toArray() {
        return range.toArray();
    }

    public <T1> T1[] toArray(T1[] a) {
        return range.toArray(a);
    }

    public boolean add(T t) {
        return range.add(t);
    }

    public boolean remove(Object o) {
        return range.remove(o);
    }

    public boolean containsAll(Collection<?> c) {
        return range.contains(c);
    }

    public boolean addAll(Collection<? extends T> c) {
        return range.addAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return range.retainAll(c);
    }

    public boolean removeAll(Collection<?> c) {
        return range.retainAll(c);
    }

    public void clear() {
        range.clear();
    }

    public static <T extends Number> Range<T> of(T arg1, T arg2){
        return new Range<>(arg1, arg2);
    }

    public static <T extends Character> Range<T> of(T arg1, T arg2, Function<T, T> function){
        return new Range<>(arg1, arg2, function);
    }
}
