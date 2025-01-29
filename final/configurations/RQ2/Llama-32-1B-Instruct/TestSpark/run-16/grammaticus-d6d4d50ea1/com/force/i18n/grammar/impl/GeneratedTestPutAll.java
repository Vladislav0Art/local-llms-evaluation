package com.force.i18n.grammar.impl;

public class GeneratedTestPutAll {

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
    public void testPutAll() {
        // Mock multiple collections
        mockMap.put("term1", new Noun().setName("value1").build());
        mockMap.put("term2", new Noun().setName("value2").build());

        GrammaticalTerm term = new Noun().setName("expectedValue").build();
        actual.putAll(mockMap);
        T resultTerm = actual.get(term);
        assertNotNull(resultTerm);
    }

}