package com.force.i18n.grammar.impl;

public class GeneratedTestEqualsMethod {

    @Test
    public void testEqualsMethod() {
        Map<String, Noun> map1 = new HashMap<>();
        map1.put("John", new Noun());
        Noun noun1 = map1.get("John");

        Map<String, Noun> map2 = new HashMap<>();
        map2.put("Jane", new Noun());

        assert GrammaticalTermMapImplTest.class.isAssignableFrom(grammaticalTermMap1.getClass()) : "map1 is not equal to map2";
    }

}