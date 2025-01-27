package com.force.i18n.grammar.impl;

public class GeneratedGetOrDefault {

    @Test
    public void getOrDefault() {
        Map<String, GrammaticalTerm> map = ImmutableMap.of("key", new GrammaticalTerm());
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(map, true);
        assertEquals(instance.get("key"), instance.getOrDefault("key"));
    }

}