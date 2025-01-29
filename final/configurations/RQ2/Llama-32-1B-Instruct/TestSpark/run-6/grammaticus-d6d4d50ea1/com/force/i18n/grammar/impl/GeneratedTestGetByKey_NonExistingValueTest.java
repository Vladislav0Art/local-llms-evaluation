package com.force.i18n.grammar.impl;

public class GeneratedTestGetByKey_NonExistingValueTest {

    @Test
    public void testGetByKey_NonExistingValueTest() {
        // Create a map of grammatical terms
        Map<String, Noun> termMap = new HashMap<>();
        termMap.put("hello", new Noun("Hello"));

        GrammaticalTermMapImpl<T extends Noun> testImpl = new GrammaticalTermMapImpl<>(termMap, true);

        // Test get method with non-existing value for key "non-existent-key"
        String key = "non-existent-key";
        assert testImpl.get(key).isNull();
    }

}