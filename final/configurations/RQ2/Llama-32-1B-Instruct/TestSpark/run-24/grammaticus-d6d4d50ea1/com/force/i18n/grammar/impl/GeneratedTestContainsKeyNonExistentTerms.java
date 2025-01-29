package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKeyNonExistentTerms {

    @Test
    public void testContainsKeyNonExistentTerms() {
        Map<String, Noun> map = new HashMap<>();
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        Set<Map.Entry<String, T>> entries = mapImpl.containsKey("nonExistent");
        assertNull(entries);
    }

}