package com.force.i18n.grammar.impl;

public class GeneratedTestSkinnyMethod {

    @Test
    public void testSkinnyMethod() {
        Map<String, T> map = new HashMap<>();
        Noun noun1 = new Noun();
        map.put("John", noun1);

        GrammaticalTermMap<T> skinnyMap = GrammaticalTermMapImpl.makeSkinny(map);

        assert !GrammaticalTermMapImplTest.class.isAssignableFrom(skinnyMap.getClass()) : "skinny map is not equal to the original map";
    }

}