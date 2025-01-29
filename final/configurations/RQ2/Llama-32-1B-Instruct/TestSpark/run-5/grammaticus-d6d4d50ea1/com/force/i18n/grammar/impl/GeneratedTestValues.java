package com.force.i18n.grammar.impl;

public class GeneratedTestValues {

    @Test
    public void testValues() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        Collection<String> values = map.values();

        assertTrue(values.size() == 1);
    }

}