package com.force.i18n.grammar.impl;

public class GeneratedTest {

    @Test
    public void testEquals() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        assertTrue(map1.equals(map2));
    }

    @Test
    public void testHashCode() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        int hash1 = map1.hashCode();
        int hash2 = map2.hashCode();

        assertTrue(hash1 == hash2);
    }

    @Test
    public void testIsSkinny() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>(new HashMap<>(), true);

        assertTrue(map1.isSkinny());
        assertFalse(map2.isSkinny());
    }

    @Test
    public void testMakeSkinny() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>(new HashMap<>());

        map1.makeSkinny();
        map2.makeSkinny();

        assertTrue(map1.isEmpty());
        assertFalse(map2.isEmpty());
    }

    @Test
    public void testWriteJson() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        try {
            map.writeJson(baos, null, null, null);
        } finally {
            oos.close();
        }

        byte[] bytes = baos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);

        try {
            GrammaticalTermMap<String, String> loadedMap = (GrammaticalTermMap<String, String>) ois.readObject();

            assertTrue(loadedMap.isEmpty());
        } finally {
            ois.close();
        }
    }

    @Test
    public void testKeySet() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        Set<String> keys = map.keySet();

        assertTrue(keys.size() == 1);
    }

    @Test
    public void testGet() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        String name = map.get("name");

        assertNotNull(name);
    }

    @Test
    public void testContainsKey() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        boolean contains = map.containsKey("key");

        assertTrue(contains);
    }

    @Test
    public void testEntrySet() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        assertTrue(entrySet.size() == 1);
    }

    @Test
    public void testValues() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        Collection<String> values = map.values();

        assertTrue(values.size() == 1);
    }

    @Test
    public void testPut() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        map.put("key", "value");

        assertEquals(1, map.keySet().size());
    }

    @Test
    public void testPutAll() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        Map<String, String> otherMap = new HashMap<>();

        map.putAll(otherMap);

        assertEquals(1, map.keySet().size());
    }

    @Test
    public void testIsEmpty() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        assertTrue(map.isEmpty());

        map.put("key", "value");

        assertFalse(map.isEmpty());
    }

}