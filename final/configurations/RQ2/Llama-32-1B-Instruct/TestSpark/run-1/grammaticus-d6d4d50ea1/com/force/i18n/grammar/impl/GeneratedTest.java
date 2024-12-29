package com.force.i18n.grammar.impl;

public class GeneratedTest {

    private Map<String, T> map;
    private boolean isSkinny;

    @Test
    public void testConstruct() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        assertEquals(map, instance.map);
        assertTrue(instance.isSkinny());
    }

    @Test
    public void testConstruct_Skinny() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        isSkinny = true;
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, isSkinny);
        assertEquals(map, instance.map);
        assertFalse(instance.isSkinny());
    }

    @Test
    public void testEquals() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        T other = Noun.of("example");
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(instance.equals(other));
    }

    @Test
    public void testHashCode() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        T other = Noun.of("example");
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        int hashCode1 = instance.hashCode();
        int hashCode2 = other.hashCode();
        assertNotEquals(hashCode1, hashCode2);
    }

    @Test
    public void testIsSkinny() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        isSkinny = true;
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(instance.isSkinny());
    }

    @Test
    public void testGet() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        T expected = Noun.of("example");
        assertEquals(expected, instance.get("term1"));
    }

    @Test
    public void testContainsKey() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(instance.containsKey("term1"));
        assertFalse(instance.containsKey("nonexistent_term"));
    }

    @Test
    public void testKeySet() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        Set<String> expected = ImmutableSet.of("term1");
        assertEquals(expected, instance.keySet());
    }

    @Test
    public void testGetValue() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        T expected = Noun.of("example");
        assertEquals(expected, instance.get("term1"));
    }

    @Test
    public void testPut() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        instance.put("term2", Noun.of("example2"));
        assertEquals(2, instance.values().size());
    }

    @Test
    public void testPutAll() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        Map<String, T> otherMap = new HashMap<>();
        otherMap.put("other_term", Noun.of("other_example"));
        instance.putAll(otherMap);
        assertEquals(2, instance.values().size());
    }

    @Test
    public void testIsEmpty() {
        map = new HashMap<>();
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(instance.isEmpty());
        instance.clear();
        assertFalse(instance.isEmpty());
    }

}