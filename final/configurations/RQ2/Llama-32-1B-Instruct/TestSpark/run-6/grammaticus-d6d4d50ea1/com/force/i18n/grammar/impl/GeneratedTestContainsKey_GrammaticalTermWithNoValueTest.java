package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey_GrammaticalTermWithNoValueTest {

    @Test
    public void testContainsKey_GrammaticalTermWithNoValueTest() {
        // Create a map of grammatical terms with no value for key "non-existent-key"
        Map<String, Noun> termMap = new HashMap<>();
        termMap.put("hello", new Noun("Hello"));

        GrammaticalTermMapImpl<T extends Noun> testImpl = new GrammaticalTermMapImpl<>(termMap, true);

        // Test containsKey method
        assert testImpl.containsKey("non-existent-key").isFalse();
    }

}