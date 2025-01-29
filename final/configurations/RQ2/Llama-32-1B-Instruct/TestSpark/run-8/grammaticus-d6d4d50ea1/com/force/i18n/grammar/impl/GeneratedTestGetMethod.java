package com.force.i18n.grammar.impl;

public class GeneratedTestGetMethod {

    @Test
    public void testGetMethod() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));
        assertEquals("string", map.get("test"));
    }

}