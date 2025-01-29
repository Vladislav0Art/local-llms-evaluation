package com.force.i18n.grammar.impl;

public class GeneratedTestIsEmpty_Skinniness {

    @Test
    public void testIsEmpty_Skinniness() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        setExpectedValue(false, map.isEmpty());
    }

    private void setExpectedValue(boolean expected, Object result) {
        assertEquals(expected, result);
    }

}