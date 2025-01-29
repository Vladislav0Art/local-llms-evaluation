package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinnyEqualsTrue {

    @Test
    public void testMakeSkinnyEqualsTrue() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", new Noun());
        Noun noun = map.get("term1");
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        assert mapImpl.equals(noun);
    }

}