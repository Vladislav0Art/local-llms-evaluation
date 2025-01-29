package com.force.i18n.grammar.impl;

public class GeneratedTestGetValues {

    @Test
    public void TestGetValues() {
        // Mock object for test
        Object obj = mock(Object.class);

        // Set the map to be tested
        Map<String, String> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        // Get values method of GrammaticalTermMapImpl
        GrammaticalTermMapImpl<T> objToTest = new GrammaticalTermMapImpl<>(map, false);

        // Test getValues()
        Set<String> expectedValue = ImmutableSet.of("value1", "value2");
        Set<String> actualValue = ((GrammaticalTermMap<T>) objToTest).getValues();
        assertEquals(expectedValue, actualValue);
    }

}