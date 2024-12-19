package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJson_SimpleWriting {

    @Test
    public void testWriteJson_SimpleWriting() {
        String json = "{\"key\":\"value\"}";
        GrammaticalTermMapImpl<String, String> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        map.put("term", "value");
        map.writeJson(System.out, null, LanguageDictionary.createEmptyDictionary(),
                Collections.singletonMap("key", json));
    }

}