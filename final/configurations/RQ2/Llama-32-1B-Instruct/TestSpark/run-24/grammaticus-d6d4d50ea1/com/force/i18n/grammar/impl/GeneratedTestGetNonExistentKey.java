package com.force.i18n.grammar.impl;

public class GeneratedTestGetNonExistentKey {

    @Test
    public void testGetNonExistentKey() {
        Map<String, Noun> map = new HashMap<>();
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        try {
            mapImpl.get(null);
            fail();
        } catch (NullPointerException e) {
            // expected
        }
    }

}