package com.force.i18n.grammar.impl;

public class GeneratedPutAndGet {

    @Test
    public void putAndGet() {
        Map<String, GrammaticalTerm> map = ImmutableMap.of("key", new GrammaticalTerm());
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(map, true);
        GrammaticalTerm term = new GrammaticalTerm();
        instance.put("newKey", term);
        assertEquals(1, instance.get("newKey").getCount());
    }

}