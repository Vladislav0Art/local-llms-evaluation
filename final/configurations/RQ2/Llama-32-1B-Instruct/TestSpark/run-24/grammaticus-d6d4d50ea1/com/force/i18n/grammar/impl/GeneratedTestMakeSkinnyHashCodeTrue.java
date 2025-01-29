package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinnyHashCodeTrue {

    @Test
    public void testMakeSkinnyHashCodeTrue() {
        Map<String, T> map = new HashMap<>();
        map.put("term1", new Noun());
        Noun noun = map.get("term1");
        GrammaticalTermMap<T> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        assert mapImpl.hashCode() == noun.hashCode();
    }

}