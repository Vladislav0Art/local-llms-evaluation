package com.force.i18n.grammar.impl;

public class GeneratedTestPutAll {

    @Test
    public void testPutAll() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMap<T> gtmm = new GrammaticalTermMapImpl<>(map);
        gtmm.put("term3", "value3");

        Assert.assertEquals(4, gtmm.values().size());
    }

}