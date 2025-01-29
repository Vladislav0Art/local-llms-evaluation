package com.force.i18n.grammar.impl;

public class GeneratedTestPutAll_GrammaticalTermWithNonExistingValueTest {

    @Test
    public void testPutAll_GrammaticalTermWithNonExistingValueTest() {
        // Create a map of grammatical terms with non-existing value for key "hello"
        Map<String, Noun> termMap = new HashMap<>();
        termMap.put("hello", new Noun("Hello"));

        GrammaticalTermMapImpl<T extends Noun> testImpl = new GrammaticalTermMapImpl<>(termMap, true);

        // Test putAll method
        testImpl.put("world", new Noun("World"));
    }

}