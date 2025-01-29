package com.force.i18n.grammar.impl;

public class GeneratedTestGetByNonExistentKey {

    @Test
    public void testGetByNonExistentKey() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));
        assertEquals(null, map.get("nonExistentKey"));
    }

}