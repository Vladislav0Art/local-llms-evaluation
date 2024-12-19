package com.force.i18n.grammar.impl;

public class GeneratedTestGet_MultipleKeys {

    @Test
    public void testGet_MultipleKeys() {
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>();
        map.put("term1", "value1");
        map.put("term2", "value2");
        assert map.get("term1") == "value1";
        assert map.get("term2") == "value2";
    }

}