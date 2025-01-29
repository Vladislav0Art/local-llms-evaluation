package com.force.i18n.grammar.impl;

public class GeneratedTestIsSkinny {

    @Test
    public void testIsSkinny() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.isSkinny());
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>();
        assertFalse(map2.isSkinny());
    }

}