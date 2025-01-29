package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJson {

    @Test
    public void testWriteJson() throws IOException {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMapImpl<String, String> grammaticalTermMap = new GrammaticalTermMapImpl<>(map);

        // Write json representation
    }

}