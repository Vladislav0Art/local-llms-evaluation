package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKeyEqualTerms {

    @Test
    public void testContainsKeyEqualTerms() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", new Noun());
        map.put("term2", new Noun());
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        Set<Map.Entry<String, T>> entries = mapImpl.containsKey("term1");
        assertTrue(entries.contains(Map.Entry.of("term1", new Noun())));
    }

}