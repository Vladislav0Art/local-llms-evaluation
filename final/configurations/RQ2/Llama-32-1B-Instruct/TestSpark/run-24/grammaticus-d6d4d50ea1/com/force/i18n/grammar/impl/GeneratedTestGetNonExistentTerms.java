package com.force.i18n.grammar.impl;

public class GeneratedTestGetNonExistentTerms {

    @Test
    public void testGetNonExistentTerms() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", new Noun());
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        Set<Map.Entry<String, T>> entries = mapImpl.get("nonExistent");
        assertNull(entries);
    }

}