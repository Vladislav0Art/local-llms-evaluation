package com.force.i18n.grammar.impl;

public class GeneratedTestConstruct {

    private Map<String, T> map;
    private boolean isSkinny;

    @Test
    public void testConstruct() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        assertEquals(map, instance.map);
        assertTrue(instance.isSkinny());
    }

}