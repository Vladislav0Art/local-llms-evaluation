package com.force.i18n.grammar.impl;

public class GeneratedTestIsSkinnyMethod {

    @Test
    public void testIsSkinnyMethod() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));

        assertTrue(map.isSkinny());
    }

}