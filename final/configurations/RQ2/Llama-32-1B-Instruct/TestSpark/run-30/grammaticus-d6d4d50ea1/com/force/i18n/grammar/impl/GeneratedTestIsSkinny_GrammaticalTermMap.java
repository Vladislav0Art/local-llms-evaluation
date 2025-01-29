package com.force.i18n.grammar.impl;

public class GeneratedTestIsSkinny_GrammaticalTermMap {

    @Test
    public void testIsSkinny_GrammaticalTermMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("term1", new GrammaticalTerm());
        map.put("term2", new GrammaticalTerm());

        GrammaticalTermMapImpl<T> mapInstance = new GrammaticalTermMapImpl<>(map, true);
        boolean isSkinny = mapInstance.isSkinny();

        assertFalse(isSkinny);

        mapInstance = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        try {
            mapInstance.isSkinny();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

}