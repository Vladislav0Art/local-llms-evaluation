package com.force.i18n.grammar.impl;

public class GeneratedTestPut {

    @Test
    public void testPut() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        map.put("key", "value");

        assertEquals(1, map.keySet().size());
    }

}