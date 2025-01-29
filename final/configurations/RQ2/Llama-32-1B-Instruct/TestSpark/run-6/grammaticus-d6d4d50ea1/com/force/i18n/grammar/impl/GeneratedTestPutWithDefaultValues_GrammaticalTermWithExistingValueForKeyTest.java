package com.force.i18n.grammar.impl;

public class GeneratedTestPutWithDefaultValues_GrammaticalTermWithExistingValueForKeyTest {

    @Test
    public void testPutWithDefaultValues_GrammaticalTermWithExistingValueForKeyTest() {
        // Create a map of grammatical terms with existing value for key "hello"
        Map<String, Noun> termMap = new HashMap<>();
        termMap.put("hello", new Noun("Hello"));

        GrammaticalTermMapImpl<T extends Noun> testImpl = new GrammaticalTermMapImpl<>(termMap, true);

        // Test put method
        assert testImpl.put("world", new Noun("World")).isTrue();
    }

}