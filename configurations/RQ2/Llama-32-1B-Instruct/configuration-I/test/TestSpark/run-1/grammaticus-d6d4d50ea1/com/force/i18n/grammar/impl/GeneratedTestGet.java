package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGet {

    public static void main(String[] args) {
    }

    public String get(String key) {
        return map.get(key);
    }

    public void put(String key, String value) {
        map.put(key, value);
    }

    public int size() {
        return map.size();
    }
}

public class GeneratedTest {

    @Test
    public void testGet() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl();
        map.put("key", "value");
        assertEquals("value", map.get("key"));
    }

}