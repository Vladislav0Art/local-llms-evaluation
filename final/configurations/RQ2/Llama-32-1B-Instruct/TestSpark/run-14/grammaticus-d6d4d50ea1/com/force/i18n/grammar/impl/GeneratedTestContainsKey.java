package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey {

    @Test
    public void testContainsKey() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.containsKey("test"));
        assertFalse(map.containsKey("non-existent"));
    }

}