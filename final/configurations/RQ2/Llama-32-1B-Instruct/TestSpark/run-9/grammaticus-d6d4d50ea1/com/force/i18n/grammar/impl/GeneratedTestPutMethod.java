package com.force.i18n.grammar.impl;

public class GeneratedTestPutMethod {

    @Test
    public void testPutMethod() {
        Map<String, T> map = new HashMap<>();
        Noun noun1 = new Noun();
        map.put("John", noun1);

        GrammaticalTermMap<T> map2 = new GrammaticalTermMapImpl<>(map, false);
        map2.put("Jane", new Noun());

        assert !GrammaticalTermMapImplTest.class.isAssignableFrom(map2.getClass()) : "put method should return a different object";
    }

}