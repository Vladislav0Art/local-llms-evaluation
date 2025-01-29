package com.force.i18n.grammar.impl;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        assertEquals(true, map.equals(new GrammaticalTermMapImpl<String, String>(Map.of("one", "noun"), true)));
    }

}