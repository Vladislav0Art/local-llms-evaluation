package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestGetValue {

    @Test
    public void testGetValue() {
        Config config = new Config();
        config.add(All, "value");

        Map<String, AttributeValue> values = config.getValues();
        assertTrue(values.containsKey(All));
        assertEquals("value", values.get(All).getValue());
    }
}

public class All {
}

class TypedValue implements Comparable<TypedValue> {
    private final String value;

    public TypedValue(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(TypedValue other) {
        return value.compareTo(other.value);
    }
}

class Attributes implements Iterable<String> {
    private List<String> keys = new ArrayList<>();

    public void put(String key, String value) {
        keys.add(key);
    }

    @Override
    public Iterator<String> iterator() {
        return keys.iterator();
    }
}

class AttributeValue {
    private final String value;

    public AttributeValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}