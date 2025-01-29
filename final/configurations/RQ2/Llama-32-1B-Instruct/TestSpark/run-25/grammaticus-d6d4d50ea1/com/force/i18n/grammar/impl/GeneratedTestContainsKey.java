package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey {

    @Test
    public void TestContainsKey() {
        // Mock object for test
        Object obj = mock(Object.class);

        // Set the map to be tested
        Map<String, String> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        // Create a GrammaticalTermMapImpl instance with the mock object
        GrammaticalTermMapImpl<T> objToTest = new GrammaticalTermMapImpl<>(map, false);

        // Test containsKey
        boolean expectedValue = true;
        boolean actualValue = ((GrammaticalTermMap<T>) objToTest).containsKey("term1");
        assertTrue(actualValue);
        actualValue = ((GrammaticalTermMap<T>) objToTest).containsKey("term2");
        assertTrue(actualValue);

        // Test containsKey with no key
        expectedValue = false;
        actualValue = ((GrammaticalTermMap<T>) objToTest).containsKey("term3");
        assertFalse(actualValue);
    }

}