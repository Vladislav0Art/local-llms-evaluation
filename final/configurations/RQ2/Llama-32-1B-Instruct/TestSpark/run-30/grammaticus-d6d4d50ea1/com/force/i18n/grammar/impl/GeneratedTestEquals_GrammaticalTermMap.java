package com.force.i18n.grammar.impl;

public class GeneratedTestEquals_GrammaticalTermMap {

    @Test
    public void testEquals_GrammaticalTermMap() {
        Map<String, Object> map1 = new HashMap<>();
        map1.put("term1", new GrammaticalTerm());
        map1.put("term2", new GrammaticalTerm());

        Map<String, Object> map2 = new HashMap<>();
        map2.put("term1", new GrammaticalTerm());
        map2.put("term3", new GrammaticalTerm());

        GrammaticalTermMapImpl<T> mapInstance1 = new GrammaticalTermMapImpl<>(map1, true);
        GrammaticalTermMapImpl<T> mapInstance2 = new GrammaticalTermMapImpl<>(map2, false);

        assertTrue(mapInstance1.equals(mapInstance2));
    }

}