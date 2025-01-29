package com.force.i18n.grammar.impl;

public class GeneratedTestGetNonExistentValue {

    @Test
    public void testGetNonExistentValue() {
        Map<String, Noun> map = new HashMap<>();
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        Object obj = null;
        try {
            mapImpl.get(null).set(obj);
            fail();
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

}