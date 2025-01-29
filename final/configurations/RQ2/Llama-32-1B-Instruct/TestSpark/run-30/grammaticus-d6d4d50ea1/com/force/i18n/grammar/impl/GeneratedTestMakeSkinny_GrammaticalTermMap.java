package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinny_GrammaticalTermMap {

    @Test
    public void testMakeSkinny_GrammaticalTermMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("term1", new GrammaticalTerm());
        map.put("term2", new GrammaticalTerm());

        GrammaticalTermMapImpl<T> mapInstance = new GrammaticalTermMapImpl<>(map, true);
        GrammaticalTermMap<T> skinnyMapInstance = mapInstance.makeSkinny();

        assertTrue(skinnyMapInstance.isEmpty());
    }

}