package com.force.i18n.grammar.impl;

public class GeneratedTestPutByName {

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
    public void testPutByName() throws IOException {
        String key = "expectedKey";
        T value = new Noun().setName("expectedValue").build();
        actual.put(key, value);
        T resultValue = mockMap.get(key);
        assertSame(value, resultValue);
    }

}