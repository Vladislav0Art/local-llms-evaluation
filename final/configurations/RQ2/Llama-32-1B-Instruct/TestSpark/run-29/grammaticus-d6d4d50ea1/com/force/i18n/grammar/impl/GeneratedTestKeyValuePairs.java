package com.force.i18n.grammar.impl;

public class GeneratedTestKeyValuePairs {

    @Test
    public void testKeyValuePairs() {
        TestUtils.createGrammaticalTermMap(new HashMap<>(), true)
                .put("test", TestUtils.getGrammaticalTerm("test"));
        Set<Map.Entry<String, T>> entrySet = TestUtils.createGrammaticalTermMap(new HashMap<>(), true).entrySet();
        TestUtils.assertThat(entrySet, entrySet::contains);
    }

}