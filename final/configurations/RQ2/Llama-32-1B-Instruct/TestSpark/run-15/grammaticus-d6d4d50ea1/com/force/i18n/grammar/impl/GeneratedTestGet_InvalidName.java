package com.force.i18n.grammar.impl;

public class GeneratedTestGet_InvalidName {

    @Test
    public void testGet_InvalidName() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        assertThrows(IllegalArgumentException.class, () -> map.get("invalid"));
    }

}