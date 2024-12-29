package com.force.i18n.grammar.impl;

public class GeneratedEntrySetTests {

    private static final HumanLanguage ENGLISH = new HumanLanguage("English");
    private static final ImmutableMap<String, T> ENGLISH_MAP = ImmutableMap.of("term1", new Noun(ENGLISH, "Noun"));
    private static final ImmutableMap<String, T> EMPTY_MAP = ImmutableMap.of();

    @Test
    public void entrySetTests() {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>(ENGLISH_MAP);
        Set<Map.Entry<String, T>> entries = map.entrySet();
        assertEquals(1, entries.size());
        assertTrue(entries.contains(Map.entry("term1", ENGLISH_MAP.get("term1"))));
    }

}