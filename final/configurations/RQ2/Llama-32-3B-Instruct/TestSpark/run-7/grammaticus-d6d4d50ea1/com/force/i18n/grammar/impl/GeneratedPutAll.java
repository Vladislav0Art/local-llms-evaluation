package com.force.i18n.grammar.impl;

public class GeneratedPutAll {

    @Test
    public void putAll() {
        Map<String, GrammaticalTerm> map = ImmutableMap.of("key", new GrammaticalTerm());
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(map, true);
        GrammaticalTerm term1 = new GrammaticalTerm();
        GrammaticalTerm term2 = new GrammaticalTerm();
        instance.putAll(ImmutableMap.of("newKey1", term1, "newKey2", term2));
        assertEquals(2, instance.get("newKey1").getCount());
        assertEquals(1, instance.get("newKey2").getCount());
    }

}