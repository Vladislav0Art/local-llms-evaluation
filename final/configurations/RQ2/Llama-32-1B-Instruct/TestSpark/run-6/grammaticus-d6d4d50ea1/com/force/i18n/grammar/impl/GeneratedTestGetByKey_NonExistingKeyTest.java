package com.force.i18n.grammar.impl;

public class GeneratedTestGetByKey_NonExistingKeyTest {

    @Test
    public void testGetByKey_NonExistingKeyTest() {
        // Create a map of grammatical terms
        Map<String, Noun> termMap = new HashMap<>();
        termMap.put("hello", new Noun("Hello"));

        GrammaticalTermMapImpl<T extends Noun> testImpl = new GrammaticalTermMapImpl<>(termMap, true);

        // Test get method with non-existing key
        String key = "non-existent-key";
        assert testImpl.containsKey(key).isFalse();
    }

}