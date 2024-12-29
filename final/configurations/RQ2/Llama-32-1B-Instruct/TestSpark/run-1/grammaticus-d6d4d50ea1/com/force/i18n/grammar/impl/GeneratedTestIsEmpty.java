package com.force.i18n.grammar.impl;

public class GeneratedTestIsEmpty {

    private Map<String, T> map;
    private boolean isSkinny;

    @Test
    public void testIsEmpty() {
        map = new HashMap<>();
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(instance.isEmpty());
        instance.clear();
        assertFalse(instance.isEmpty());
    }

}