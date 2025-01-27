package com.force.i18n.grammar.impl;

public class GeneratedContainsKey {

    @Test
    public void containsKey() {
        Map<String, GrammaticalTerm> map = ImmutableMap.of("key", new GrammaticalTerm());
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(map, true);
        assertTrue(instance.containsKey("key"));
        assertFalse(instance.containsKey("nonExistentKey"));
    }

}