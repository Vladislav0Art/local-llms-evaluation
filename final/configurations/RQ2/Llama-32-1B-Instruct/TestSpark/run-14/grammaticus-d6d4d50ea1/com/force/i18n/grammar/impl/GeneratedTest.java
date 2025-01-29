package com.force.i18n.grammar.impl;

public class GeneratedTest {

    @Test
    public void testCreate() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        assertNotNull(map);
        assertEquals("", map.get("test"));
    }

    @Test
    public void testCreateWithSkinny() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertNotNull(map);
        assertTrue(map.isSkinny());
        // Additional tests for isSkinny method (e.g., with different languages)
    }

    @Test
    public void testMakeSkinny() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        GrammaticalTermMap<String, String> skinnyMap = map.makeSkinny();
        assertEquals(new HashMap<>(), skinnyMap.get("test"));
    }

    @Test
    public void testWriteJson() throws IOException {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(map);
        oos.close();

        // Additional tests for keySet(), get(String), containsKey(String), entrySet(), values()
    }

    @Test
    public void testGet() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>());
        assertEquals("", map.get("test"));
        // Additional tests for get(String)
    }

    @Test
    public void testContainsKey() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.containsKey("test"));
        assertFalse(map.containsKey("non-existent"));
    }

    @Test
    public void testKeySet() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>());
        assertEquals(0, map.keySet().size());
        // Additional tests for keySet()
    }

    @Test
    public void testGetters() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        assertEquals("", map.get("test"));
    }

}