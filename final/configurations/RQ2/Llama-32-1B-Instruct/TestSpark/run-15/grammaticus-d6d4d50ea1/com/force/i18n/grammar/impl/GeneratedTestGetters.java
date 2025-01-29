package com.force.i18n.grammar.impl;

public class GeneratedTestGetters {

    @Test
    public void testGetters() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        setExpectedValue(true, map.get("one"));
    }

}