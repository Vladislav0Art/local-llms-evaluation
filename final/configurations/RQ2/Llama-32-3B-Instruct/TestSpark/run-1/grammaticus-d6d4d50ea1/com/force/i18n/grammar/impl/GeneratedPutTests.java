package com.force.i18n.grammar.impl;

public class GeneratedPutTests {

    private static final HumanLanguage ENGLISH = new HumanLanguage("English");
    private static final ImmutableMap<String, T> ENGLISH_MAP = ImmutableMap.of("term1", new Noun(ENGLISH, "Noun"));
    private static final ImmutableMap<String, T> EMPTY_MAP = ImmutableMap.of();

    @Test
    public void putTests() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>();
        obj.put("newTerm", new Noun(ENGLISH, "NewNoun"));
        assertEquals(2, obj.getTerms().size());
        assertTrue(obj.getTerms().containsValue(new Noun(ENGLISH, "NewNoun")));
    }

}