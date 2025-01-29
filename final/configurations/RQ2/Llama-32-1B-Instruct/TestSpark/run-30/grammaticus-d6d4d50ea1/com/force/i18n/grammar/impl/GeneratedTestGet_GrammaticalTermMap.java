package com.force.i18n.grammar.impl;

public class GeneratedTestGet_GrammaticalTermMap {

    @Test
    public void testGet_GrammaticalTermMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("term1", new GrammaticalTerm());
        map.put("term2", new GrammaticalTerm());

        GrammaticalTermMapImpl<T> mapInstance = new GrammaticalTermMapImpl<>(map, true);
        T expectedValue = map.get("term1");
        T actualValue = mapInstance.get("term1");

        assertEquals(expectedValue, actualValue);

        mapInstance = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        try {
            mapInstance.get("term2");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

}