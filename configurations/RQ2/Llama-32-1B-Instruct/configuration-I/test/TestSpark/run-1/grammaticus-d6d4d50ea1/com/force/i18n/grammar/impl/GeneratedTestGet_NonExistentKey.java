package com.force.i18n.grammar.impl;

public class GeneratedTestGet_NonExistentKey {

    @Test
    public void testGet_NonExistentKey() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        assert map.get("term3") == null;
    }

}