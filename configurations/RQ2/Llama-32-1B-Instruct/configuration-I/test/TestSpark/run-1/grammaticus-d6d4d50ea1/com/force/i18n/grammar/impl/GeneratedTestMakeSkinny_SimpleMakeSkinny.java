package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinny_SimpleMakeSkinny {

    @Test
    public void testMakeSkinny_SimpleMakeSkinny() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        map.put("term", "value");
        map.makeSkinny();
        assert !map.isEmpty();
    }

}