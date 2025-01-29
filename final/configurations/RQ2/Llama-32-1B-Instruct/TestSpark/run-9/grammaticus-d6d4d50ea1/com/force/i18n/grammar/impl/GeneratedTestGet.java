package com.force.i18n.grammar.impl;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        GrammaticalTermMap<T> map = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        Noun noun1 = new Noun();
        map.put("John", noun1);

        assert map.get("John") instanceof Noun : "get method should return a Noun";
    }

}