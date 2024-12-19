package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestPut {

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
    public void testPut() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals(2, map.size());
    }

}