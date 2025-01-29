package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey {

    @Test
    public void testContainsKey() {
        Map<String, T> map = new HashMap<>();
        Noun noun1 = new Noun();
        map.put("John", noun1);

        assert !map.containsKey("Jane") : "contains key should return false";
    }

}