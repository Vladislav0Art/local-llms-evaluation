package com.force.i18n.grammar.impl;

public class GeneratedIsEmpty {

    @Test
    public void isEmpty() {
        Map<String, GrammaticalTerm> map = ImmutableMap.of("key", new GrammaticalTerm());
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(map, true);
        assertFalse(instance.isEmpty());
    }

}