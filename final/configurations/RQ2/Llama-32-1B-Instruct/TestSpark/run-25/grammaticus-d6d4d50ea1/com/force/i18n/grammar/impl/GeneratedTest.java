package com.force.i18n.grammar.impl;

public class GeneratedTest {

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

    @Test
    public void TestGetKeyValue() {
        // Mock object for test
        Object obj = mock(Object.class);

        // Set the map to be tested
        Map<String, String> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        // Get method of GrammaticalTermMapImpl
        GrammaticalTermMapImpl<T> objToTest = new GrammaticalTermMapImpl<>(map, false);

        // Test getKeyValue()
        String expectedValue = "value1";
        String actualValue = ((GrammaticalTermMap<T>) objToTest).get("term1");
        assertEquals(expectedValue, actualValue);
    }

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

    @Test
    public void TestPutAll() {
        // Mock objects for test
        Object obj1 = mock(Object.class);
        Object obj2 = mock(Object.class);

        // Set the map to be tested
        Map<String, String> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        // Create a GrammaticalTermMapImpl instance with the mock objects
        GrammaticalTermMapImpl<T> objToTest = new GrammaticalTermMapImpl<>(map, false);

        // PutAll method of GrammaticalTermMapImpl
        objToTest.putAll(obj1);
        objToTest.putAll(obj2);

        // Test putAll()
        Set<Map.Entry<String, String>> expectedValue = ImmutableSet.of();
        Set<Map.Entry<String, String>> actualValue = ((GrammaticalTermMap<T>) objToTest).entrySet();
        assertEquals(expectedValue, actualValue);
    }

}