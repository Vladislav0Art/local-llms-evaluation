package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJson_NonExistentWriting {

    @Test
    public void testWriteJson_NonExistentWriting() {
        String json = "{\"key\":\"value\"}";
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        assert json == "";
    }

}