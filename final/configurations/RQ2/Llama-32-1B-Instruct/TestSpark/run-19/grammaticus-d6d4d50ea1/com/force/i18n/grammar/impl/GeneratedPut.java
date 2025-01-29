package com.force.i18n.grammar.impl;

import org.junit.Test;

public class GeneratedPut {

    private Map<String, Object> map = new HashMap<>();

    @Test
    public void put() {
        map.put("key", "value");
        assertEquals("value", map.get("key"));
    }

}