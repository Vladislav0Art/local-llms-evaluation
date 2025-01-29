package com.force.i18n.grammar.impl;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        assertTrue(map1.equals(map2));
    }

}