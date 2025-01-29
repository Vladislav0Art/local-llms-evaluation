package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinny {

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
    public void testMakeSkinny() {
        GrammaticalTermMap<T> expected = mockMap;
        setExpectedEmptyTerms(expected, "term1", "term2");
        actual.makeSkinny();

        // Check that empty terms are removed
        assertEquals(mockMap, expected);
    }

    private void setExpectedEmptyTerms(GrammaticalTermMap<T> expected, String... names) {
        Set<String> expectedTerms = new HashSet<>(Arrays.asList(names));
        for (T term : mockMap.values()) {
            boolean isExpectedTerm = false;
            for (String name : names) {
                if (term.getName().equals(name)) {
                    isExpectedTerm = true;
                    break;
                }
            }
            if (!isExpectedTerm) {
                expectedTerms.remove(term.getName());
            }
        }

        expectedTerms.forEach((key, value) -> actual.put(key, value));
    }

}