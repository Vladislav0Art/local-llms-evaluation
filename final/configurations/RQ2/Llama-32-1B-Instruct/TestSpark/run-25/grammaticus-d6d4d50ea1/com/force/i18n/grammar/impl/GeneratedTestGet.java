package com.force.i18n.grammar.impl;

public class GeneratedTestGet {

    @Test
    public void TestGet() {
        // Mock object for test
        Object obj = mock(Object.class);

        // Set the map to be tested
        Map<String, String> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        // Get method of GrammaticalTermMapImpl
        GrammaticalTermMapImpl<T> objToTest = new GrammaticalTermMapImpl<>(map, false);

        // Test equals()
        assertEquals(map, objToTest.getKeySet());

        // Test get
        String expectedValue = "value1";
        String actualValue = ((GrammaticalTermMap<T>) objToTest).get("term1");
        assertEquals(expectedValue, actualValue);
    }

}