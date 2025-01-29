package com.force.i18n.grammar.impl;

public class GeneratedTestGetByKey_EmptyMapTest {

    @Test
    public void testGetByKey_EmptyMapTest() {
        // Create an empty map of grammatical terms
        Map<String, Noun> termMap = new HashMap<>();

        GrammaticalTermMapImpl<T extends Noun> testImpl = new GrammaticalTermMapImpl<>(termMap, true);

        // Test get method with empty map
        String key = "non-existent-key";
        String expectedResult = null;
        assert testImpl.containsKey(key).isTrue();
    }

}