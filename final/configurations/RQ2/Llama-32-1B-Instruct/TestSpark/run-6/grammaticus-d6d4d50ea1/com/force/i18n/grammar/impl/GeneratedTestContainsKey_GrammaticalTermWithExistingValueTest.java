package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey_GrammaticalTermWithExistingValueTest {

    @Test
    public void testContainsKey_GrammaticalTermWithExistingValueTest() {
        // Create a map of grammatical terms with existing value for key "hello"
        Map<String, Noun> termMap = new HashMap<>();
        termMap.put("hello", new Noun("Hello"));

        GrammaticalTermMapImpl<T extends Noun> testImpl = new GrammaticalTermMapImpl<>(termMap, true);

        // Test containsKey method
        assert testImpl.containsKey("hello").isTrue();
    }

}