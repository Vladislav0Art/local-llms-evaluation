package com.force.i18n.grammar.impl;

public class GeneratedTestCreateWithSkinny {

    @Test
    public void testCreateWithSkinny() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertNotNull(map);
        assertTrue(map.isSkinny());
        // Additional tests for isSkinny method (e.g., with different languages)
    }

}