package com.force.i18n.grammar.impl;

public class GeneratedTestValues {

    @Test
    public void testValues() {
        GrammaticalTermMap<T> map = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        Noun noun1 = new Noun();
        map.put("John", noun1);

        assert map.values().size() == 1 : "values should have only one element";
    }

}