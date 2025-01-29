package com.force.i18n.grammar.impl;

public class GeneratedTest {

    @Test
    public void testEquals() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("term1", "value1");
        map1.put("term2", "value2");

        Map<String, String> map2 = new HashMap<>();
        map2.put("term1", "value1");
        map2.put("term3", "value3");

        GrammaticalTermMapImpl<String, String> grammaticalTermMap1 = new GrammaticalTermMapImpl<>(map1, true);
        GrammaticalTermMapImpl<String, String> grammaticalTermMap2 = new GrammaticalTermMapImpl<>(map2);

        Assert.assertEquals(grammaticalTermMap1, grammaticalTermMap2);
    }

    @Test
    public void testHashCode() {
        Map<String, Noun> map1 = new HashMap<>();
        map1.put("term1", "value1");
        map1.put("term2", "value2");

        Map<String, String> map2 = new HashMap<>();
        map2.put("term1", "value1");
        map2.put("term3", "value3");

        GrammaticalTermMapImpl<String, String> grammaticalTermMap1 = new GrammaticalTermMapImpl<>(map1);
        GrammaticalTermMapImpl<String, String> grammaticalTermMap2 = new GrammaticalTermMapImpl<>(map2);

        Assert.assertEquals(grammaticalTermMap1.hashCode(), grammaticalTermMap2.hashCode());
    }

    @Test
    public void testIsSkinny() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");

        GrammaticalTermMapImpl<String, String> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, true);
        Assert.assertTrue(grammaticalTermMap.isSkinny());

        GrammaticalTermMapImpl<String, String> skinnyGmtm = new GrammaticalTermMapImpl<>(map, false);

        Assert.assertFalse(skinnyGmtm.isSkinny());
    }

    @Test
    public void testMakeSkinny() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");

        GrammaticalTermMap<T> gtmm = new GrammaticalTermMapImpl<>(map);
        String skinnyTerms = gtmm.makeSkinny().keySet();

        Assert.assertTrue(skinnyTerms.containsAll(Arrays.asList("term1")));
    }

    @Test
    public void testWriteJson() throws IOException {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMapImpl<String, String> grammaticalTermMap = new GrammaticalTermMapImpl<>(map);

        // Write json representation
    }

    @Test
    public void testKeySet() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMap<T> gtmm = new GrammaticalTermMapImpl<>(map);
        Set<String> keySet = gtmm.keySet();

        Assert.assertEquals(3, keySet.size());
    }

    @Test
    public void testGet() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMap<T> gtmm = new GrammaticalTermMapImpl<>(map);
        Noun noun1 = gtmm.get("term1");

        Assert.assertNotNull(noun1);
    }

    @Test
    public void testContainsKey() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMap<T> gtmm = new GrammaticalTermMapImpl<>(map);
        Assert.assertTrue(gtmm.containsKey("term1"));
    }

    @Test
    public void testEntrySet() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMap<T> gtmm = new GrammaticalTermMapImpl<>(map);
        Set<Map.Entry<String, Noun>> entrySet = gtmm.entrySet();

        Assert.assertEquals(3, entrySet.size());
    }

    @Test
    public void testValues() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMap<T> gtmm = new GrammaticalTermMapImpl<>(map);
        Collection<Noun> values = gtmm.values();

        Assert.assertEquals(3, values.size());
    }

    @Test
    public void testPutAll() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMap<T> gtmm = new GrammaticalTermMapImpl<>(map);
        gtmm.put("term3", "value3");

        Assert.assertEquals(4, gtmm.values().size());
    }

    @Test
    public void testIsEmpty() {
        Map<String, Noun> map = new HashMap<>();

        GrammaticalTermMap<T> gtmm = new GrammaticalTermMapImpl<>(map);
        Assert.assertTrue(!gtmm.isEmpty());
    }

}