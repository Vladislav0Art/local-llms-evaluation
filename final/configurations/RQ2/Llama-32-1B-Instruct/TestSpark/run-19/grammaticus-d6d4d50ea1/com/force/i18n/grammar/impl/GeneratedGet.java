package com.force.i18n.grammar.impl;

import org.junit.Test;

public class GeneratedGet {

    private Map<String, Object> map = new HashMap<>();

    @Test
    public void get() {
        map.put("key", "value");
        assertEquals("value", map.get("key"));
    }

}