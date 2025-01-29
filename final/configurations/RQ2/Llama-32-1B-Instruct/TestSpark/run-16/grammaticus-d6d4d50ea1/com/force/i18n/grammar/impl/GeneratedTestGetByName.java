package com.force.i18n.grammar.impl;

public class GeneratedTestGetByName {

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
    public void testGetByName() throws IOException {
        String expectedName = "term1";
        T expectedTerm = mockMap.get(expectedName);
        assertEquals(expectedTerm, actual.get(expectedName));
    }

}