package com.force.i18n.grammar.impl;

public class GeneratedTestPutAll {

    private Map<String, T> map;
    private boolean isSkinny;

    @Test
    public void testPutAll() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        Map<String, T> otherMap = new HashMap<>();
        otherMap.put("other_term", Noun.of("other_example"));
        instance.putAll(otherMap);
        assertEquals(2, instance.values().size());
    }

}