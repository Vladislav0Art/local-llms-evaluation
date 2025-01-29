package com.force.i18n.grammar.impl;

public class GeneratedTestPutMethod {

    @Test
    public void testPutMethod() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));
        map.put("test", "value");

        assertEquals(1, map.size());
    }

}