package com.force.i18n.grammar.impl;

public class GeneratedTestKeySet {

    @Test
    public void testKeySet() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMap<T> gtmm = new GrammaticalTermMapImpl<>(map);
        Set<String> keySet = gtmm.keySet();

        Assert.assertEquals(3, keySet.size());
    }

}