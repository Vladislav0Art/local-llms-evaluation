package com.force.i18n.grammar.impl;

public class GeneratedTest {

    @Test
    public void testEquals() {
        String term1 = "test_term";
        String term2 = "test_term";
        GrammaticalTermMap<T> map = new GrammaticalTermMapImpl<Map<String, T>, String>(new HashMap<>(), false);
        T expectedTerm = new Noun("Test");
        GrammaticalTerm actualTerm = map.get(term1);
        assertEquals(expectedTerm, actualTerm);
    }

    @Test
    public void testGet() {
        String termName = "test_term";
        GrammaticalTermMap<T> map = new GrammaticalTermMapImpl<Map<String, T>, String>(new HashMap<>(), false);
        T expectedTerm = new Noun("Test");
        GrammaticalTerm actualTerm = map.get(termName);
        assertEquals(expectedTerm, actualTerm);
    }

    @Test
    public void testContainsKey() {
        String termName = "test_term";
        GrammaticalTermMap<T> map = new GrammaticalTermMapImpl<Map<String, T>, String>(new HashMap<>(), false);
        map.put(termName, new Noun("Test"));
        assertTrue(map.containsKey(termName));
    }

    @Test
    public void testKeySet() {
        String term1 = "term1";
        String term2 = "term2";
        GrammaticalTermMap<T> map = new GrammaticalTermMapImpl<Map<String, T>, String>(new HashMap<>(), false);
        Set<String> expectedKeySet = new HashSet<>();
        expectedKeySet.add(term1);
        expectedKeySet.add(term2);
        map.put(term1, "expected_term");
        map.put(term2, "expected_term");
        assertEquals(expectedKeySet, map.keySet());
    }

    @Test
    public void testValues() {
        String termName = "test_term";
        GrammaticalTermMap<T> map = new GrammaticalTermMapImpl<Map<String, T>, String>(new HashMap<>(), false);
        T expectedTerm = new Noun("Test");
        map.put(termName, expectedTerm);
        List<T> actualValues = map.values();
        assertEquals(1, actualValues.size());
        GrammaticalTerm actualTerm = actualValues.get(0);
        assertEquals(expectedTerm, actualTerm);
    }

    @Test
    public void testWriteJson() {
        String[] termsToInclude = {"term1", "term2"};
        Appendable out = System.out;
        RenamingProvider renamingProvider = new RenamingProvider();
        LanguageDictionary dictionary = new LanguageDictionary();
        Collection<String> termsToIncludeCopy = new HashSet<>(termsToInclude);
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<Map<String, T>, String>(new HashMap<>(), false);
        map.writeJson(out, renamingProvider, dictionary, termsToIncludeCopy);
        assertEquals(2, out.length());
    }

    @Test
    public void testPutAll() {
        String term1 = "term1";
        String term2 = "term2";
        GrammaticalTermMap<T> map = new GrammaticalTermMapImpl<Map<String, T>, String>(new HashMap<>(), false);
        map.put(term1, "expected_term");
        map.put(term2, "expected_term");

        GrammaticalTerm actualTerm = map.get(term1);
        assertEquals("expected_term", actualTerm);

        T expectedTerm = new Noun("Test");
        GrammaticalTerm actualActualTerm = map.get(term2);
        assertEquals(expectedTerm, actualActualTerm);
    }

}