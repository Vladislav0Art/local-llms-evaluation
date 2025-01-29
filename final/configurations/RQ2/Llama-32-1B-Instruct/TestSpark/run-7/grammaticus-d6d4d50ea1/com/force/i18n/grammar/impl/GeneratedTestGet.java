package com.force.i18n.grammar.impl;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMap<T> gtmm = new GrammaticalTermMapImpl<>(map);
        Noun noun1 = gtmm.get("term1");

        Assert.assertNotNull(noun1);
    }

}