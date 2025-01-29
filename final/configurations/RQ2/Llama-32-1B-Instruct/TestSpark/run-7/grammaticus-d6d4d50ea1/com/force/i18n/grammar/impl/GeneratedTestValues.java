package com.force.i18n.grammar.impl;

public class GeneratedTestValues {

    @Test
    public void testValues() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");

        GrammaticalTermMap<T> gtmm = new GrammaticalTermMapImpl<>(map);
        Collection<Noun> values = gtmm.values();

        Assert.assertEquals(3, values.size());
    }

}