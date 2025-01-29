package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCreateMap {

    @Test
    public void createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assertEquals(2, map.size());
    }

}