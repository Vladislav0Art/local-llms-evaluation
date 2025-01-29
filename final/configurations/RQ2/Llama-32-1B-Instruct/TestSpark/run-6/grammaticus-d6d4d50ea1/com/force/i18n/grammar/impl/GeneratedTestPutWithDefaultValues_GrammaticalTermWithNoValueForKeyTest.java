package com.force.i18n.grammar.impl;

public class GeneratedTestPutWithDefaultValues_GrammaticalTermWithNoValueForKeyTest {

    @Test
    public void testPutWithDefaultValues_GrammaticalTermWithNoValueForKeyTest() {
        // Create a map of grammatical terms with no value for key "non-existent-key"
        Map<String, Noun> termMap = new HashMap<>();

        GrammaticalTermMapImpl<T extends Noun> testImpl = new GrammaticalTermMapImpl<>(termMap, true);

        // Test put method
        assert testImpl.put("hello", new Noun("Hello")).isTrue();
    }

}