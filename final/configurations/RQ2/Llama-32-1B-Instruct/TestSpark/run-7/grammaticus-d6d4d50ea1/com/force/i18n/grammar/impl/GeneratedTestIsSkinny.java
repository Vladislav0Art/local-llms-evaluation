package com.force.i18n.grammar.impl;

public class GeneratedTestIsSkinny {

    @Test
    public void testIsSkinny() {
        Map<String, Noun> map = new HashMap<>();
        map.put("term1", "value1");

        GrammaticalTermMapImpl<String, String> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, true);
        Assert.assertTrue(grammaticalTermMap.isSkinny());

        GrammaticalTermMapImpl<String, String> skinnyGmtm = new GrammaticalTermMapImpl<>(map, false);

        Assert.assertFalse(skinnyGmtm.isSkinny());
    }

}