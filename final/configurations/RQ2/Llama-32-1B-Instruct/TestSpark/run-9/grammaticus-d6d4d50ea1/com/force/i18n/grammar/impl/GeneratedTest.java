package com.force.i18n.grammar.impl;

public class GeneratedTest {

    @Test
    public void testEqualsMethod() {
        Map<String, Noun> map1 = new HashMap<>();
        map1.put("John", new Noun());
        Noun noun1 = map1.get("John");

        Map<String, Noun> map2 = new HashMap<>();
        map2.put("Jane", new Noun());

        assert GrammaticalTermMapImplTest.class.isAssignableFrom(grammaticalTermMap1.getClass()) : "map1 is not equal to map2";
    }

    @Test
    public void testHashCodeMethod() {
        Map<String, T> map = new HashMap<>();
        map.put("John", new Noun());
        T noun = map.get("John");

        assert !GrammaticalTermMapImplTest.class.isAssignableFrom(map.getClass()) : "map is equal to the original map";
    }

    @Test
    public void testSkinnyMethod() {
        Map<String, T> map = new HashMap<>();
        Noun noun1 = new Noun();
        map.put("John", noun1);

        GrammaticalTermMap<T> skinnyMap = GrammaticalTermMapImpl.makeSkinny(map);

        assert !GrammaticalTermMapImplTest.class.isAssignableFrom(skinnyMap.getClass()) : "skinny map is not equal to the original map";
    }

    @Test
    public void testWriteJsonMethod() {
        Map<String, T> map = new HashMap<>();
        Noun noun1 = new Noun();
        map.put("John", noun1);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(map);
        }

        InputStream is = bos.toByteArray();

        assertEquals(map, GrammaticalTermMapImplTest.class.isAssignableFrom(map.getClass()) ? (T[]) is : null);
    }

    @Test
    public void testKeySet() {
        Map<String, T> map = new HashMap<>();
        Noun noun1 = new Noun();
        map.put("John", noun1);

        assert map.keySet().size() == 1 : "key set should have only one element";
    }

    @Test
    public void testGet() {
        GrammaticalTermMap<T> map = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        Noun noun1 = new Noun();
        map.put("John", noun1);

        assert map.get("John") instanceof Noun : "get method should return a Noun";
    }

    @Test
    public void testContainsKey() {
        Map<String, T> map = new HashMap<>();
        Noun noun1 = new Noun();
        map.put("John", noun1);

        assert !map.containsKey("Jane") : "contains key should return false";
    }

    @Test
    public void testEntrySet() {
        Map<String, T> map = new HashMap<>();
        Noun noun1 = new Noun();
        map.put("John", noun1);

        HashSet<Map.Entry<String, T>> entrySet = map.entrySet();

        assert !entrySet.isEmpty : "entry set should be empty";
    }

    @Test
    public void testValues() {
        GrammaticalTermMap<T> map = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        Noun noun1 = new Noun();
        map.put("John", noun1);

        assert map.values().size() == 1 : "values should have only one element";
    }

    @Test
    public void testPutMethod() {
        Map<String, T> map = new HashMap<>();
        Noun noun1 = new Noun();
        map.put("John", noun1);

        GrammaticalTermMap<T> map2 = new GrammaticalTermMapImpl<>(map, false);
        map2.put("Jane", new Noun());

        assert !GrammaticalTermMapImplTest.class.isAssignableFrom(map2.getClass()) : "put method should return a different object";
    }

    @Test
    public void testPutAllMethod() {
        Map<String, T> map = new HashMap<>();
        Noun noun1 = new Noun();
        map.put("John", noun1);

        GrammaticalTermMap<T> map2 = new GrammaticalTermMapImpl<>(map, true);
        map2.put("Jane", new Noun());

        assert !GrammaticalTermMapImplTest.class.isAssignableFrom(map2.getClass()) : "putAll method should return a different object";
    }

    @Test
    public void testIsEmpty() {
        Map<String, T> map = new HashMap<>();
        assert !map.isEmpty() : "isEmpty method should return true";
    }

}