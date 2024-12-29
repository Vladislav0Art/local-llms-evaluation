package com.force.i18n.grammar.impl;

public class GeneratedValuesTests {

    private static final HumanLanguage ENGLISH = new HumanLanguage("English");
    private static final ImmutableMap<String, T> ENGLISH_MAP = ImmutableMap.of("term1", new Noun(ENGLISH, "Noun"));
    private static final ImmutableMap<String, T> EMPTY_MAP = ImmutableMap.of();

    @Test
    public void valuesTests() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        Collection<T> values = map.values();
        assertEquals(1, values.size());
        assertNotNull(values.iterator().next());
    }

}