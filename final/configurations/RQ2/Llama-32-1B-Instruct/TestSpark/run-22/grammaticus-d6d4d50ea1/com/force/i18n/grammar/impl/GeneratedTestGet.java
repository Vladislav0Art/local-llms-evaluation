package com.force.i18n.grammar.impl;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMapImpl<Noun, String> mockGrammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);

        Object getMethodCall = mockGrammaticalTermMap.get;
        Noun noun = (Noun) getMethodCall.invoke(null);
        assertEquals("value1", noun.getValue());

        mockGrammaticalTermMap.put("term1", "newValue");
        getMethodCall = mockGrammaticalTermMap.get;
        Noun noun2 = (Noun) getMethodCall.invoke(null);
        assertEquals("newValue", noun2.getValue());
    }

}