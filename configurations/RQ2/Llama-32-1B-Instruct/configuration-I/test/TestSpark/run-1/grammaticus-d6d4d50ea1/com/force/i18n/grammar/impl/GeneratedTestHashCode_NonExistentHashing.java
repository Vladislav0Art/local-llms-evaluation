package com.force.i18n.grammar.impl;

public class GeneratedTestHashCode_NonExistentHashing {

    @Test
    public void testHashCode_NonExistentHashing() {
        GrammaticalTermMapImpl<String, String> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String, String> map2 = new GrammaticalTermMapImpl<>();
        assert !map1.hashCode().equals(map2.hashCode());
    }

}