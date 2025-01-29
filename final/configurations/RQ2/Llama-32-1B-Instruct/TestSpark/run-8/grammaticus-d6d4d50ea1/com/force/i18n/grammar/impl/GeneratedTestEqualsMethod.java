package com.force.i18n.grammar.impl;

public class GeneratedTestEqualsMethod {

    @Test
    public void testEqualsMethod() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));

        assertEquals(map1, map2);

        Object obj = new Object() {
            public void print(Object o) {
            }
        };

        try {
            map1.equals(obj);
            fail("Equals method should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}