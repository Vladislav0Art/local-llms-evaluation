package com.force.i18n.grammar.impl;

public class GeneratedTestGetEqualTerms {

    @Test
    public void testGetEqualTerms() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", new Noun());
        map.put("term2", new Noun());
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        Set<Map.Entry<String, T>> entries = mapImpl.get("term1");
        assertEquals(2, entries.size());
    }

}