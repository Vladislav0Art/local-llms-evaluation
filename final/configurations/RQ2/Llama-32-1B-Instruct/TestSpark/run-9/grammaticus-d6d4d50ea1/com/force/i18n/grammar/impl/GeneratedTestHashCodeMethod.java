package com.force.i18n.grammar.impl;

public class GeneratedTestHashCodeMethod {

    @Test
    public void testHashCodeMethod() {
        Map<String, T> map = new HashMap<>();
        map.put("John", new Noun());
        T noun = map.get("John");

        assert !GrammaticalTermMapImplTest.class.isAssignableFrom(map.getClass()) : "map is equal to the original map";
    }

}