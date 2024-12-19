package com.force.i18n.grammar.impl;

public class GeneratedTestGet_SimpleKey {

    @Test
    public void testGet_SimpleKey() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        map.put("term1", "value1");
        assert map.get("term1") == "value1";
    }

}