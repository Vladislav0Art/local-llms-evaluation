package com.force.i18n.grammar.impl;

public class GeneratedTestPutAllMethodWithEmptyMap {

    @Test
    public void testPutAllMethodWithEmptyMap() {
        TestUtils.createGrammaticalTermMap(new HashMap<>(), false)
                .put("test", TestUtils.getGrammaticalTerm("test"));
        Set<Map.Entry<String, T>> entrySet = TestUtils.createGrammaticalTermMap(new HashMap<>(), true).entrySet();
        TestUtils.assertThat(entrySet, entrySet::isEmpty);
    }

}