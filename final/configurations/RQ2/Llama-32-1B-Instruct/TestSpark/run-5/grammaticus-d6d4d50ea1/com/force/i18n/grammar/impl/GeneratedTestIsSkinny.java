package com.force.i18n.grammar.impl;

public class GeneratedTestIsSkinny {

    @Test
    public void testIsSkinny() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>(new HashMap<>(), true);

        assertTrue(map1.isSkinny());
        assertFalse(map2.isSkinny());
    }

}