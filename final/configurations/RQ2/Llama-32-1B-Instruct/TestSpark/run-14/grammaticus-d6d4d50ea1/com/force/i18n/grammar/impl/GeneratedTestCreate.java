package com.force.i18n.grammar.impl;

public class GeneratedTestCreate {

    @Test
    public void testCreate() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        assertNotNull(map);
        assertEquals("", map.get("test"));
    }

}