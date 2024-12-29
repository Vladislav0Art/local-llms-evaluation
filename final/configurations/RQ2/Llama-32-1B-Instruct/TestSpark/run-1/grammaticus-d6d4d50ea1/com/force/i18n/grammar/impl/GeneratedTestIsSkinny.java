package com.force.i18n.grammar.impl;

public class GeneratedTestIsSkinny {

    private Map<String, T> map;
    private boolean isSkinny;

    @Test
    public void testIsSkinny() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        isSkinny = true;
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(instance.isSkinny());
    }

}