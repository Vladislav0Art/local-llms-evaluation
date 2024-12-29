package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey {

    private Map<String, T> map;
    private boolean isSkinny;

    @Test
    public void testContainsKey() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(instance.containsKey("term1"));
        assertFalse(instance.containsKey("nonexistent_term"));
    }

}