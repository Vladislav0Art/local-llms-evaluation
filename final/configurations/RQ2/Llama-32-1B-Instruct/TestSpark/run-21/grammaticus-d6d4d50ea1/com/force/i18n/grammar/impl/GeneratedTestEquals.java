package com.force.i18n.grammar.impl;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>();
        map1.put("term1", "value1");
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>();
        map2.put("term1", "value1");
        assertTrue(map1.equals(map2));
    }

}