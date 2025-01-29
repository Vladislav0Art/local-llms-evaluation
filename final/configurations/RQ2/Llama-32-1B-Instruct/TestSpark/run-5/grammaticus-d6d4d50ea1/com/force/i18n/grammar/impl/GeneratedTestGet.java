package com.force.i18n.grammar.impl;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        String name = map.get("name");

        assertNotNull(name);
    }

}