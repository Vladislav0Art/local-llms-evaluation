package com.force.i18n.grammar.impl;

public class GeneratedTestIsEmptyMethod {

    @Test
    public void testIsEmptyMethod() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));

        assertTrue(map.isEmpty());

        Object obj = new Object() {
            public void print(Object o) {
            }
        };

        try {
            map.isEmpty();
            fail("Empty method should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}