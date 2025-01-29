package com.force.i18n.grammar.impl;

public class GeneratedTestIsEmpty {

    @Test
    public void testIsEmpty() {
        Map<String, Noun> map = new HashMap<>();

        GrammaticalTermMap<T> gtmm = new GrammaticalTermMapImpl<>(map);
        Assert.assertTrue(!gtmm.isEmpty());
    }

}