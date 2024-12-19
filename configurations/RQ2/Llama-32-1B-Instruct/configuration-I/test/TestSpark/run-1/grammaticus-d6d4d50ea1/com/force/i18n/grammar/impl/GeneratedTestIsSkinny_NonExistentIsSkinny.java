package com.force.i18n.grammar.impl;

public class GeneratedTestIsSkinny_NonExistentIsSkinny {

    @Test
    public void testIsSkinny_NonExistentIsSkinny() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>();
        assert !map1.isSkinny();
        assert !map2.isSkinny();
    }

}