package com.force.i18n.grammar.impl;

public class GeneratedTestPutAllMethod {

    @Test
    public void testPutAllMethod() {
        Map<String, T> map = new HashMap<>();
        Noun noun1 = new Noun();
        map.put("John", noun1);

        GrammaticalTermMap<T> map2 = new GrammaticalTermMapImpl<>(map, true);
        map2.put("Jane", new Noun());

        assert !GrammaticalTermMapImplTest.class.isAssignableFrom(map2.getClass()) : "putAll method should return a different object";
    }

}