package com.force.i18n.grammar.impl;

public class GeneratedTestHashCode {

    @Test
    public void testHashCode() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);

        int hash1 = map1.hashCode();
        int hash2 = map2.hashCode();

        assertTrue(hash1 == hash2);
    }

}