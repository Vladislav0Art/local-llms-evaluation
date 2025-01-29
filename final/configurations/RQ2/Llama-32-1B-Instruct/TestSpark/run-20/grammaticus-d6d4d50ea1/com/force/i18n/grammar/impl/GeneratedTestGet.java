package com.force.i18n.grammar.impl;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        GrammaticalTermTermMapImpl<T> termMap = new GrammaticalTermTermMapImpl<>(map);
        GrammaticalTerm term = termMap.get("key1");
        assertNotNull(term);

        GrammaticalTerm termInstance = new GrammaticalTerm();
        setExpectedValue(termInstance, "value1");
    }

}