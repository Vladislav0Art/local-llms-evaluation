package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey_GrammaticalTermMapWithAllTermsTest {

    @Test
    public void testContainsKey_GrammaticalTermMapWithAllTermsTest() {
        // Create a map of grammatical terms
        Map<String, Noun> termMap = new HashMap<>();
        termMap.put("hello", new Noun("Hello"));
        termMap.put("world", new Noun("World"));

        GrammaticalTermMapImpl<T extends Noun> testImpl = new GrammaticalTermMapImpl<>(termMap, true);

        // Test containsKey method
        assert testImpl.containsKey("hello").isTrue();
    }

}