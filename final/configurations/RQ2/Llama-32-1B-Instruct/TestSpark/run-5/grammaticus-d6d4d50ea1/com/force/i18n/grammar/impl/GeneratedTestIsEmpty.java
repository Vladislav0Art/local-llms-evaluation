package com.force.i18n.grammar.impl;

public class GeneratedTestIsEmpty {

    @Test
    public void testIsEmpty() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        assertTrue(map.isEmpty());

        map.put("key", "value");

        assertFalse(map.isEmpty());
    }

}