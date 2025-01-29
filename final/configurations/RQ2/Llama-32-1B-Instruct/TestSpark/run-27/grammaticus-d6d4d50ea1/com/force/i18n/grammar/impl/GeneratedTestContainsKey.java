package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey {

    @Test
    public void testContainsKey() {
        String termName = "test_term";
        GrammaticalTermMap<T> map = new GrammaticalTermMapImpl<Map<String, T>, String>(new HashMap<>(), false);
        map.put(termName, new Noun("Test"));
        assertTrue(map.containsKey(termName));
    }

}