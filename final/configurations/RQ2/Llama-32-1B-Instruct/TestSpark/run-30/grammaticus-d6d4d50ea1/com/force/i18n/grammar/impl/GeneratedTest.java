package com.force.i18n.grammar.impl;

public class GeneratedTest {

    @Test
    public void testGet_GrammaticalTermMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("term1", new GrammaticalTerm());
        map.put("term2", new GrammaticalTerm());

        GrammaticalTermMapImpl<T> mapInstance = new GrammaticalTermMapImpl<>(map, true);
        T expectedValue = map.get("term1");
        T actualValue = mapInstance.get("term1");

        assertEquals(expectedValue, actualValue);

        mapInstance = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        try {
            mapInstance.get("term2");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void testEquals_GrammaticalTermMap() {
        Map<String, Object> map1 = new HashMap<>();
        map1.put("term1", new GrammaticalTerm());
        map1.put("term2", new GrammaticalTerm());

        Map<String, Object> map2 = new HashMap<>();
        map2.put("term1", new GrammaticalTerm());
        map2.put("term3", new GrammaticalTerm());

        GrammaticalTermMapImpl<T> mapInstance1 = new GrammaticalTermMapImpl<>(map1, true);
        GrammaticalTermMapImpl<T> mapInstance2 = new GrammaticalTermMapImpl<>(map2, false);

        assertTrue(mapInstance1.equals(mapInstance2));
    }

    @Test
    public void testIsSkinny_GrammaticalTermMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("term1", new GrammaticalTerm());
        map.put("term2", new GrammaticalTerm());

        GrammaticalTermMapImpl<T> mapInstance = new GrammaticalTermMapImpl<>(map, true);
        boolean isSkinny = mapInstance.isSkinny();

        assertFalse(isSkinny);

        mapInstance = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        try {
            mapInstance.isSkinny();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    public void testMakeSkinny_GrammaticalTermMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("term1", new GrammaticalTerm());
        map.put("term2", new GrammaticalTerm());

        GrammaticalTermMapImpl<T> mapInstance = new GrammaticalTermMapImpl<>(map, true);
        GrammaticalTermMap<T> skinnyMapInstance = mapInstance.makeSkinny();

        assertTrue(skinnyMapInstance.isEmpty());
    }

    @Test
    public void testWriteJson_GrammaticalTermMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("term1", new GrammaticalTerm());
        map.put("term2", new GrammaticalTerm());

        GrammaticalTermMapImpl<T> mapInstance = new GrammaticalTermMapImpl<>(map, true);
        String jsonContent = mapInstance.writeJson(System.out, new RenamingProvider(), new LanguageDictionary(), Collections.emptyList());

        assertEquals("{}", jsonContent);
    }

    @Test
    public void testWriteJson_GrammaticalTermSet() {
        Set<Map.Entry<String, Object>> entries = new HashSet<>();
        entries.add(new AbstractMap.SimpleEntry<>("term1", new GrammaticalTerm()));
        entries.add(new AbstractMap.SimpleEntry<>("term2", new GrammaticalTerm()));

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        String jsonContent = mapInstance.writeJson(System.out, new RenamingProvider(), new LanguageDictionary(), entries);

        assertEquals("{}", jsonContent);
    }

    @Test
    public void testWriteJson_GrammaticalTermValues() {
        Set<T> values = new HashSet<>();
        values.add(new GrammaticalTerm());

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        String jsonContent = mapInstance.writeJson(System.out, new RenamingProvider(), new LanguageDictionary(), values);

        assertEquals("{}", jsonContent);
    }

}