package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinnyIsSkinnyFalse {

    @Test
    public void testMakeSkinnyIsSkinnyFalse() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", new Noun());
        Noun noun = map.get("term1");
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, false);
        assert !mapImpl.isSkinny();
    }

}