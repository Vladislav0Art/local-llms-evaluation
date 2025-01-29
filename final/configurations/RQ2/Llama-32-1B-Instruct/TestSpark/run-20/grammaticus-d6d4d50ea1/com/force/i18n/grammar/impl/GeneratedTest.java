package com.force.i18n.grammar.impl;

public class GeneratedTest {

    @Test
    public void testCreateMapWithEmptySet() {
        Map<String, String> map = new HashMap<>();
        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(map);
        assertNotNull(mapInstance);
    }

    @Test
    public void testGet() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        GrammaticalTermTermMapImpl<T> termMap = new GrammaticalTermTermMapImpl<>(map);
        GrammaticalTerm term = termMap.get("key1");
        assertNotNull(term);

        GrammaticalTerm termInstance = new GrammaticalTerm();
        setExpectedValue(termInstance, "value1");
    }

    @Test
    public void testEquals() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("key1", "value1");

        Map<String, String> map2 = new HashMap<>();
        map2.put("key1", "value1");

        GrammaticalTermMap<T> mapInstance1 = new GrammaticalTermMapImpl<>(map1);
        GrammaticalTermMap<T> mapInstance2 = new GrammaticalTermMapImpl<>(map2);

        assertTrue(mapInstance1.equals(mapInstance2));
    }

    @Test
    public void testGetNoMatch() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key3", "value3");

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(map);
        assertNotNull(mapInstance.get("key2"));
    }

    @Test
    public void testContainsKey() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key3", "value3");

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(map);
        assertTrue(mapInstance.containsKey("key2"));
    }

    @Test
    public void testKeySet() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key3", "value3");

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(map);
        Set<String> expected = ImmutableMap.of("key1", "value1");
        assertEquals(expected, mapInstance.keySet());
    }

    @Test
    public void testKeySetNull() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(map);
        assertNotNull(mapInstance.keySet());
    }

    @Test
    public void testGetNewKey() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(map);
        GrammaticalTerm term = mapInstance.get("key3");
        assertNull(term);

        setExpectedValue(term, "");
    }

    @Test
    public void testGetNewNone() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(map);
        assertNull(mapInstance.get("key2"));
    }

    @Test
    public void testEqualsNull() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");

        GrammaticalTermMap<T> mapInstance = null;

        assertTrue(mapInstance.equals(null));
    }

    @Test
    public void testMakeSkinny() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(map);
        GrammaticalTermTermMapImpl<T> termMap = new GrammaticalTermTermMapImpl<>(mapInstance.makeSkinny());
        assertEquals(mapInstance, termMap);
    }

    private void setExpectedValue(GrammaticalTerm term, String expected) {
        // implement test to return correct value
    }
}

class GrammaticalTermTermMapImpl<T> implements GrammaticalTermMap<T>, Serializable {

    public static Map<String, GrammaticalTerm> createMap() {
        return new HashMap<>();
    }

    private GrammaticalTermTermMapImpl(Map<String, String> map) {
        // implementation
    }
}

class GrammaticalTerm {

    public void setExpectedValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) { /* implementation */ }

    @Override
    public int hashCode() { /* implementation */ }

    @Override
    public String toString() { /* implementation */
    }

}