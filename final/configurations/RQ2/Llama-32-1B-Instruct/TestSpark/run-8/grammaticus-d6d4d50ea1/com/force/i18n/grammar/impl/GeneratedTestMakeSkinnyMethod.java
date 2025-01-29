package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinnyMethod {

    @Test
    public void testMakeSkinnyMethod() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));

        GrammaticalTermMap<T> skinnyMap = new GrammaticalTermMapImpl<>(map, true);

        assertEquals(map, skinnyMap);
    }

}