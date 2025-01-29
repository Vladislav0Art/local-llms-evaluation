package com.force.i18n.grammar.impl;

public class GeneratedTestPutAllMethodWithNonEmptyMap {

    @Test
    public void testPutAllMethodWithNonEmptyMap() {
        TestUtils.createGrammaticalTermMap(new HashMap<>(), false)
                .put("test", TestUtils.getGrammaticalTerm("test"));
        Set<Map.Entry<String, T>> entrySet = TestUtils.createGrammaticalTermMap(new HashMap<>(), true).entrySet();
        TestUtils.assertThat(entrySet, entrySet::contains);
    }

}