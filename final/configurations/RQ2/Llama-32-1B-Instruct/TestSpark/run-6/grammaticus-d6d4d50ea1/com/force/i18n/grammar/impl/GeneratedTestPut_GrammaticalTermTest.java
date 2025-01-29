package com.force.i18n.grammar.impl;

public class GeneratedTestPut_GrammaticalTermTest {

    @Test
    public void testPut_GrammaticalTermTest() {
        // Create a map of grammatical terms
        Map<String, Noun> termMap = new HashMap<>();
        termMap.put("hello", new Noun("Hello"));

        GrammaticalTermMapImpl<T extends Noun> testImpl = new GrammaticalTermMapImpl<>(termMap, true);

        // Test put method
        testImpl.put("world", new Noun("World"));
    }

}