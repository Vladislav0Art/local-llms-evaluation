package com.force.i18n.grammar.impl;

public class GeneratedTestPutWithDefaultValues_GrammaticalTermWithExistingValueForMultipleKeysTest {

    @Test
    public void testPutWithDefaultValues_GrammaticalTermWithExistingValueForMultipleKeysTest() {
        // Create a map of grammatical terms with existing values for keys "hello" and "world"
        Map<String, Noun> termMap = new HashMap<>();
        termMap.put("hello", new Noun("Hello"));
        termMap.put("world", new Noun("World"));

        GrammaticalTermMapImpl<T extends Noun> testImpl = new GrammaticalTermMapImpl<>(termMap, true);

        // Test put method
        assert testImpl.put("foo", new Noun("Foo")).isTrue();
    }

}