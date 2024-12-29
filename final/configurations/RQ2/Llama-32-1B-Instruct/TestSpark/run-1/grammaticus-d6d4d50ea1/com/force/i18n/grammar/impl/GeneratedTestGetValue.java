package com.force.i18n.grammar.impl;

public class GeneratedTestGetValue {

    private Map<String, T> map;
    private boolean isSkinny;

    @Test
    public void testGetValue() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        T expected = Noun.of("example");
        assertEquals(expected, instance.get("term1"));
    }

}