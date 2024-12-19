package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestTest8 {

    @Test
    public void testTest8() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        assert (!map.isEmpty());
        assertTrue(map.containsKey("key1"));
        assertTrue(map.containsKey("key2"));

        assertEquals(2, map.size());
    }

}