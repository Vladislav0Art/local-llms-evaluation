package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GeneratedIndexOfKey_EmptySet_ReturnsMinus1 {

    private ArrayList<Attribute> attrs;

    public Attributes() {
        this.attrs = new ArrayList<>();
    }

    public void add(String key, String value) {
        Attribute attr = new Attribute(key, value);
        attrs.add(attr);
    }

    public boolean remove(String key) {
        Iterator<Attribute> iterator = attrs.iterator();
        while (iterator.hasNext()) {
            Attribute currentAttr = iterator.next();
            if (currentAttr.getKey().equals(key)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean hasKey(String key) {
        for (Attribute attr : attrs) {
            if (attr.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public String get(String key, boolean caseSensitive) {
        for (Attribute attr : attrs) {
            if ((caseSensitive && attr.getKey().equals(key)) || (!caseSensitive && attr.getKey().toLowerCase().equals(key))) {
                return attr.getValue();
            }
        }
        return "";
    }

    public String getUserData(String key, boolean caseSensitive) {
        // This class does not have any userData
        return "";
    }

    public void put(String key, String value) {
        add(key, value);
    }

    public void addAll(Attributes attrs) {
        this.attrs.addAll(attrs.attrs);
    }

    @Override
    public int size() {
        return this.attrs.size();
    }

    @Override
    public boolean isEmpty() {
        return (this.attrs.isEmpty());
    }
}

class Attribute {
    private String key;
    private String value;

    public Attribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

public class GeneratedTest {

    @Test
    public void indexOfKey_EmptySet_ReturnsMinus1() {
        Attributes attrs = new Attributes();
        assertEquals(-1, attrs.indexOfKey(""));
    }

}