package com.force.i18n.grammar.impl;

public class GeneratedTestConstruct_Skinny {

    private Map<String, T> map;
    private boolean isSkinny;

    @Test
    public void testConstruct_Skinny() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        isSkinny = true;
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, isSkinny);
        assertEquals(map, instance.map);
        assertFalse(instance.isSkinny());
    }

}