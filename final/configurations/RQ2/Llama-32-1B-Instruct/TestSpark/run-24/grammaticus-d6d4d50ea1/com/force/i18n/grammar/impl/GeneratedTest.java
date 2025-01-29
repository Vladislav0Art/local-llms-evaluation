package com.force.i18n.grammar.impl;

public class GeneratedTest {

    @Test
    public void testMakeSkinnyEqualsTrue() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", new Noun());
        Noun noun = map.get("term1");
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        assert mapImpl.equals(noun);
    }

    @Test
    public void testMakeSkinnyHashCodeTrue() {
        Map<String, T> map = new HashMap<>();
        map.put("term1", new Noun());
        Noun noun = map.get("term1");
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        assert mapImpl.hashCode() == noun.hashCode();
    }

    @Test
    public void testMakeSkinnyIsSkinnyFalse() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", new Noun());
        Noun noun = map.get("term1");
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, false);
        assert !mapImpl.isSkinny();
    }

    @Test
    public void testGetEqualTerms() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", new Noun());
        map.put("term2", new Noun());
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        Set<Map.Entry<String, T>> entries = mapImpl.get("term1");
        assertEquals(2, entries.size());
    }

    @Test
    public void testGetNonExistentTerms() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", new Noun());
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        Set<Map.Entry<String, T>> entries = mapImpl.get("nonExistent");
        assertNull(entries);
    }

    @Test
    public void testGetNonExistentKey() {
        Map<String, Noun> map = new HashMap<>();
        Noun noun = map.get("term1");
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        try {
            mapImpl.get(null);
            fail();
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testGetNonExistentValue() {
        Map<String, Noun> map = new HashMap<>();
        Noun noun = map.get("term1");
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        try {
            mapImpl.get(null).set(new Object());
            fail();
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testContainsKeyEqualTerms() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", new Noun());
        map.put("term2", new Noun());
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        Set<Map.Entry<String, T>> entries = mapImpl.containsKey("term1");
        assertTrue(entries.contains(Map.Entry.of("term1", new Noun())));
    }

    @Test
    public void testContainsKeyNonExistentTerms() {
        Map<String, Noun> map = new HashMap<>();
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        Set<Map.Entry<String, T>> entries = mapImpl.containsKey("nonExistent");
        assertNull(entries);
    }

    @Test
    public void testContainsKeyNonExistentValue() {
        Map<String, Noun> map = new HashMap<>();
        Noun noun = map.get("term1");
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        try {
            mapImpl.containsKey(null);
            fail();
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testGetNonExistentKey() {
        Map<String, Noun> map = new HashMap<>();
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        try {
            mapImpl.get(null);
            fail();
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testGetNonExistentValue() {
        Map<String, Noun> map = new HashMap<>();
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        try {
            mapImpl.get(null).set(new Object());
            fail();
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetNonExistentValue() {
        Map<String, Noun> map = new HashMap<>();
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        Object obj = null;
        try {
            mapImpl.get(null).set(obj);
            fail();
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

}