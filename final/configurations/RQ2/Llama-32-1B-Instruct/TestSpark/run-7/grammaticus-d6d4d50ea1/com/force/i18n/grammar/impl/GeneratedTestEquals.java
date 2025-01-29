package com.force.i18n.grammar.impl;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("term1", "value1");
        map1.put("term2", "value2");

        Map<String, String> map2 = new HashMap<>();
        map2.put("term1", "value1");
        map2.put("term3", "value3");

        GrammaticalTermMapImpl<String, String> grammaticalTermMap1 = new GrammaticalTermMapImpl<>(map1, true);
        GrammaticalTermMapImpl<String, String> grammaticalTermMap2 = new GrammaticalTermMapImpl<>(map2);

        Assert.assertEquals(grammaticalTermMap1, grammaticalTermMap2);
    }

}