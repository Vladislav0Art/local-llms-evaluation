package com.force.i18n.grammar.impl;

public class GeneratedTestEquals {

    private Map<String, T> map;
    private boolean isSkinny;

    @Test
    public void testEquals() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        T other = Noun.of("example");
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(instance.equals(other));
    }

}