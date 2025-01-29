package com.force.i18n.grammar.impl;

public class GeneratedTestGetAllKeys {

    @Test
    public void TestGetAllKeys() {
        // Mock object for test
        Object obj = mock(Object.class);

        // Set the map to be tested
        Map<String, String> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        // Get all keys method of GrammaticalTermMapImpl
        GrammaticalTermMapImpl<T> objToTest = new GrammaticalTermMapImpl<>(map, false);

        // Test getAllKeys()
        Set<String> expectedValue = ImmutableSet.of("term1", "term2");
        Set<String> actualValue = ((GrammaticalTermMap<T>) objToTest).getAllKeys();
        assertEquals(expectedValue, actualValue);
    }

}