package com.force.i18n.grammar.impl;

public class GeneratedTest {

    @Test
    public void testEquals() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        assertEquals(true, map.equals(new GrammaticalTermMapImpl<String, String>(Map.of("one", "noun"), true)));
    }

    @Test
    public void testGet_InvalidName() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        assertThrows(IllegalArgumentException.class, () -> map.get("invalid"));
    }

    @Test
    public void testGet_Skinniness() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        assertEquals(true, map.isSkinny());
    }

    @Test
    public void testMakeSkinny() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        setExpectedValue(true, map.makeSkinny());
    }

    @Test
    public void testWriteJson_Skinniness() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        setExpectedValue(false, map.writeJson(null, null, null, null));
    }

    @Test
    public void testKeySet_Skinniness() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        setExpectedValue(false, map.keySet());
    }

    @Test
    public void testGetters() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        setExpectedValue(true, map.get("one"));
    }

    @Test
    public void testContainsKey() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        setExpectedValue(true, map.containsKey("invalid"));
    }

    @Test
    public void testEntrySet_Skinniness() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        setExpectedValue(false, map.entrySet());
    }

    @Test
    public void testValues_Skinniness() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        setExpectedValue(false, map.values());
    }

    @Test
    public void testPut_Skinniness() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        setExpectedValue(false, map.put("one", "noun"));
    }

    @Test
    public void testAddAll_Skinniness() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        setExpectedValue(false, map.addAll(new GrammaticalTermMap<String, String>(Map.of("two", "verb"), true)));
    }

    @Test
    public void testIsEmpty_Skinniness() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(Map.of("one", "noun"), true);

        // Mocking is not used here

        setExpectedValue(false, map.isEmpty());
    }

    private void setExpectedValue(boolean expected, Object result) {
        assertEquals(expected, result);
    }

}