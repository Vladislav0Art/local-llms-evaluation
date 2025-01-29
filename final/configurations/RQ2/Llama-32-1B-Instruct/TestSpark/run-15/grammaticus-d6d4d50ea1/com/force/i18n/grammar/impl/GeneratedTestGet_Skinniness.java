package com.force.i18n.grammar.impl;

public class GeneratedTestGet_Skinniness {

    @Test
    public void testGet_Skinniness() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        assertEquals(true, map.isSkinny());
    }

}