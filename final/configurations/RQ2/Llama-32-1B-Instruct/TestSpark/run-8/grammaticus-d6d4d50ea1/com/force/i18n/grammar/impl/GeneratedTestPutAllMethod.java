package com.force.i18n.grammar.impl;

public class GeneratedTestPutAllMethod {

    @Test
    public void testPutAllMethod() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));
        map.putAll(new GrammaticalTermMap<String, String>() {
            @Override
            public void put(String k, T v) {
                // do nothing
            }

            @Override
            public Set<Map.Entry<String, T>> entrySet() {
                return Collections.emptySet();
            }
        });

        assertEquals(1, map.size());
    }

}