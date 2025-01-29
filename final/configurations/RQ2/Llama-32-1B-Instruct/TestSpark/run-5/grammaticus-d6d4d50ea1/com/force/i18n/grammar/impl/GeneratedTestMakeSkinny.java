package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinny {

    @Test
    public void testMakeSkinny() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>(new HashMap<>());

        map1.makeSkinny();
        map2.makeSkinny();

        assertTrue(map1.isEmpty());
        assertFalse(map2.isEmpty());
    }

}