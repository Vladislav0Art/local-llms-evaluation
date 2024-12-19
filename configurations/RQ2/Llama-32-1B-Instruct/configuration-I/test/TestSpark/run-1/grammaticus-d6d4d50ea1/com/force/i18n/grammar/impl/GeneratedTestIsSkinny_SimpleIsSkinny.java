package com.force.i18n.grammar.impl;

public class GeneratedTestIsSkinny_SimpleIsSkinny {

    @Test
    public void testIsSkinny_SimpleIsSkinny() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        map.put("term", "value");
        assert map.isSkinny();
    }

}