package com.force.i18n.grammar.impl;

public class GeneratedTestKeySet {

    private Map<String, T> mockMap;
    private GrammaticalTermMap<T> actual;

    @Before
    public void setUp() {
        mockMap = new HashMap<>();
        String[] terms = {"term1", "term2", "term3"};
        for (String term : terms) {
            actual = new GrammaticalTermMapImpl<>(mockMap, true);
            T termObject = new Noun().setName(term).build();
            actual.put(term, termObject);
        }
    }

    @Test
    public void testKeySet() {
        Set<String> expectedKeys = new HashSet<>(Arrays.asList("term1", "term2"));
        assertEquals(expectedKeys, actual.keySet());
    }

}