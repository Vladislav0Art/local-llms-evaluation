package com.force.i18n.grammar.impl;

public class GeneratedKeySetTests {

    private static final HumanLanguage ENGLISH = new HumanLanguage("English");
    private static final ImmutableMap<String, T> ENGLISH_MAP = ImmutableMap.of("term1", new Noun(ENGLISH, "Noun"));
    private static final ImmutableMap<String, T> EMPTY_MAP = ImmutableMap.of();

    @Test
    public void keySetTests() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        Set<String> keys = map.keySet();
        assertEquals(1, keys.size());
        assertTrue(keys.contains("term1"));
    }

}