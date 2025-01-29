package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJson_Skinniness {

    @Test
    public void testWriteJson_Skinniness() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        setExpectedValue(false, map.writeJson(null, null, null, null));
    }

}