package com.force.i18n.grammar.impl;

public class GeneratedPutAllTests {

    private static final HumanLanguage ENGLISH = new HumanLanguage("English");
    private static final ImmutableMap<String, T> ENGLISH_MAP = ImmutableMap.of("term1", new Noun(ENGLISH, "Noun"));
    private static final ImmutableMap<String, T> EMPTY_MAP = ImmutableMap.of();

    @Test
    public void putAllTests() {
        GrammaticalTermMapImpl<T> obj = new GrammaticalTermMapImpl<>();
        ImmutableMap<String, T> otherMap = ImmutableMap.of("term2", new Noun(ENGLISH, "OtherNoun"));
        obj.putAll(otherMap);
        assertEquals(2, obj.getTerms().size());
        assertTrue(obj.getTerms().containsValue(new Noun(ENGLISH, "NewNoun")));
    }

}