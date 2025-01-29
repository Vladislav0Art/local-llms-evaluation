package com.force.i18n.grammar.impl;

public class GeneratedTestPutWithDefaultValues_GrammaticalTermWithNonExistingValueForKeyTest {

    @Test
    public void testPutWithDefaultValues_GrammaticalTermWithNonExistingValueForKeyTest() {
        // Create a map of grammatical terms with non-existing value for key "non-existent-key"
        Map<String, Noun> termMap = new HashMap<>();
        termMap.put("hello", new Noun("Hello"));

        GrammaticalTermMapImpl<T extends Noun> testImpl = new GrammaticalTermMapImpl<>(termMap, true);

        // Test put method
        assert !testImpl.put("foo").isTrue();
    }

}