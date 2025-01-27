package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GeneratedTest {

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

    @Test
    public void get_NoMatchingKey_ReturnsEmptyString() {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.get(""));
    }

    @Test
    public void get_KeyFound_ReturnsValue() {
        Attributes attrs = new Attributes();
        Attribute attr1 = new Attribute("test", "value");
        attrs.add(attr1.getKey(), attr1.getValue());
        assertEquals("value", attrs.get(attr1.getKey()));
    }

    @Test
    public void getIgnoreCase_NoMatchingKey_ReturnsEmptyString() {
        Attributes attrs = new Attributes();
        assertEquals("", attrs.get("test", true));
    }

    @Test
    public void getIgnoreCase_KeyFound_ReturnsValue() {
        Attributes attrs = new Attributes();
        Attribute attr1 = new Attribute("test", "value");
        attrs.add(attr1.getKey(), attr1.getValue());
        assertEquals("value", attrs.get("test", true));
    }

    @Test
    public void put_PutStringValue() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertEquals("value", attrs.get("key"));
    }

    @Test
    public void addAll_AddAttributes() {
        Attributes attrs1 = new Attributes();
        attrs1.add("key1", "value1");
        Attributes attrs2 = new Attributes();
        attrs2.add("key2", "value2");

        attrs1.addAll(attrs2);

        assertEquals(2, attrs1.size());
    }

    @Test
    public void remove_RemoveAttribute() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");
        assertEquals(false, attrs.remove("key1"));
    }

}