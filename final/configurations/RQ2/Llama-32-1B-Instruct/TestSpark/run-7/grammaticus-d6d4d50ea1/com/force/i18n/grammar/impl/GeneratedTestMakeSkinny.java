package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinny {

    @Test
    public void testMakeSkinny() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");

        GrammaticalTermMap<T> gtmm = new GrammaticalTermMapImpl<>(map);
        String skinnyTerms = gtmm.makeSkinny().keySet();

        Assert.assertTrue(skinnyTerms.containsAll(Arrays.asList("term1")));
    }

}