package com.force.i18n.grammar.impl;

public class GeneratedTestPut {

    private Map<String, T> map;
    private boolean isSkinny;

    @Test
    public void testPut() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        instance.put("term2", Noun.of("example2"));
        assertEquals(2, instance.values().size());
    }

}