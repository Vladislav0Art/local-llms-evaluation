package com.force.i18n.grammar.impl;

public class GeneratedTestEntrySet {

    @Test
    public void testEntrySet() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMap<T> gtmm = new GrammaticalTermMapImpl<>(map);
        Set<Map.Entry<String, Noun>> entrySet = gtmm.entrySet();

        Assert.assertEquals(3, entrySet.size());
    }

}