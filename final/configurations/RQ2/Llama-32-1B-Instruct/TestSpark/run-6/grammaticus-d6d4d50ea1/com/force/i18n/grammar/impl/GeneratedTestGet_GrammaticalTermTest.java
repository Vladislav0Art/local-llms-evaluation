package com.force.i18n.grammar.impl;

public class GeneratedTestGet_GrammaticalTermTest {

    @Test
    public void testGet_GrammaticalTermTest() {
        // Create a map of grammatical terms
        Map<String, Noun> termMap = new HashMap<>();
        termMap.put("hello", new Noun("Hello"));
        termMap.put("world", new Noun("World"));

        GrammaticalTermMapImpl<T extends Noun> testImpl = new GrammaticalTermMapImpl<>(termMap, true);

        // Test get method
        T result = testImpl.get("hello");
        assertNotNull(result);
    }

}