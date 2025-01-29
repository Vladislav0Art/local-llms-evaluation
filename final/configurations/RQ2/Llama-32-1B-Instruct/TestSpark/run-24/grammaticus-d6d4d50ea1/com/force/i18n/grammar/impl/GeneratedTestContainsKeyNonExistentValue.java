package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKeyNonExistentValue {

    @Test
    public void testContainsKeyNonExistentValue() {
        Map<String, Noun> map = new HashMap<>();
        Noun noun = map.get("term1");
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        try {
            mapImpl.containsKey(null);
            fail();
        } catch (NullPointerException e) {
            // expected
        }
    }

}