package com.force.i18n.grammar.impl;

public class GeneratedTestAddAll_Skinniness {

    @Test
    public void testAddAll_Skinniness() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        setExpectedValue(false, map.addAll(new GrammaticalTermMap<String, String>(Map.of("two", "verb"), true)));
    }

}