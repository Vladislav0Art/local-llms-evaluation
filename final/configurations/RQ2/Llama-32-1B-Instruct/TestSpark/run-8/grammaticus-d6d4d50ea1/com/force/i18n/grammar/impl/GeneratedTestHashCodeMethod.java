package com.force.i18n.grammar.impl;

public class GeneratedTestHashCodeMethod {

    @Test
    public void testHashCodeMethod() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));
        assertEquals(0, map.hashCode());

        Object obj = new Object() {
            public void print(Object o) {
            }
        };

        try {
            map.hashCode();
            fail("HashCode method should throw NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}