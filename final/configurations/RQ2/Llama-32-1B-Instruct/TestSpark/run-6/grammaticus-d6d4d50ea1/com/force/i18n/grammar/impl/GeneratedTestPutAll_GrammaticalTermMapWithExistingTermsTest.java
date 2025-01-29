package com.force.i18n.grammar.impl;

public class GeneratedTestPutAll_GrammaticalTermMapWithExistingTermsTest {

    @Test
    public void testPutAll_GrammaticalTermMapWithExistingTermsTest() {
        // Create a map of grammatical terms with existing values for keys "hello" and "world"
        Map<String, Noun> termMap = new HashMap<>();
        termMap.put("hello", new Noun("Hello"));
        termMap.put("world", new Noun("World"));

        GrammaticalTermMapImpl<T extends Noun> testImpl = new GrammaticalTermMapImpl<>(termMap, true);

        // Test putAll method
        testImpl.put("foo", new Noun("Foo"));
    }

}