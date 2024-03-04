<<<<<<< HEAD
package util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Box<T> {
    private Map<String,T>box;
    Inventory<T> inventory;

    public Box(Map<String, T> box) {
        this.box = new HashMap<>();
    }
    public T put(String key, T value) {
        return box.put(key,value);
    }
    public T get(String key) {
        return box.get(key);
    }

    public int size() {
        return box.size();
    }
    public void clear() {
      box.clear();
    }


    public void put(List<String> key, Inventory<T> value) {
//        box = new HashMap<>();
        for(int i = 0;i<box.size();i++){
            box.put(key.get(i),value.get(i));
        }
        box.forEach((k,v)->System.out.println("K : "+k+"v : "+v));
    }
}
=======
package util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Box<T> {
    private Map<String,T>box;
    Inventory<T> inventory;

    public Box(Map<String, T> box) {
        this.box = new HashMap<>();
    }
    public T put(String key, T value) {
        return box.put(key,value);
    }
    public T get(String key) {
        return box.get(key);
    }

    public int size() {
        return box.size();
    }
    public void clear() {
      box.clear();
    }


    public void put(List<String> key, Inventory<T> value) {
//        box = new HashMap<>();
        for(int i = 0;i<box.size();i++){
            box.put(key.get(i),value.get(i));
        }
        box.forEach((k,v)->System.out.println("K : "+k+"v : "+v));
    }
}
>>>>>>> 504fa6313cba374b40307599a88c30eca5b3cde7
