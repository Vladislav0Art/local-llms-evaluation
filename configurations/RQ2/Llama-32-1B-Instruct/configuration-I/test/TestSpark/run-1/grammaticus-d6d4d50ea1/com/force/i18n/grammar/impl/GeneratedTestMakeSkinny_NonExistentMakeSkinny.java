package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinny_NonExistentMakeSkinny {

    @Test
    public void testMakeSkinny_NonExistentMakeSkinny() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>();
        assert !map1.makeSkinny();
        assert !map2.makeSkinny();
    }

}