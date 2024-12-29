package com.force.i18n.grammar.impl;

public class GeneratedTestHashCode {

    private Map<String, T> map;
    private boolean isSkinny;

    @Test
    public void testHashCode() {
        map = new HashMap<>();
        map.put("term1", Noun.of("example"));
        T other = Noun.of("example");
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(map, false);
        int hashCode1 = instance.hashCode();
        int hashCode2 = other.hashCode();
        assertNotEquals(hashCode1, hashCode2);
    }

}