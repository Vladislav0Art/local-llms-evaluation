package com.force.i18n.grammar.impl;

public class GeneratedTestKeySet {

    private Map<String, T> map;
    private boolean isSkinny;

    @Test
    public void testKeySet() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        Set<String> expected = ImmutableSet.of("term1");
        assertEquals(expected, instance.keySet());
    }

}