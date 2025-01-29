package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinny {

    @Test
    public void testMakeSkinny() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        GrammaticalTermMap<String, String> skinnyMap = map.makeSkinny();
        assertEquals(new HashMap<>(), skinnyMap.get("test"));
    }

}