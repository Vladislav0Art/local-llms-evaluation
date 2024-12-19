package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetMap {

    @Test
    public void testGetMap() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        assert (!map.isEmpty());
        assertTrue(map.containsKey("key1"));
        assertTrue(map.containsKey("key2"));

        assertEquals(2, map.size());

        String value1 = map.get("key1");
        String value2 = map.get("key2");

        assertEquals("value1", value1);
        assertEquals("value2", value2);

        map.remove("key1");

        assert (!map.isEmpty());
        assertTrue(map.containsKey("key2"));

        assertEquals(1, map.size());

        value1 = map.get("key2");
        assertEquals("value2", value1);
    }

}