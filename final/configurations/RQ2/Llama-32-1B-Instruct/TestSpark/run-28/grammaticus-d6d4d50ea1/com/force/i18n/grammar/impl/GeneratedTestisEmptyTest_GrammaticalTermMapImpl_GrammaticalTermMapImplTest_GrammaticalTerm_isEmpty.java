package com.force.i18n.grammar.impl;

public class GeneratedTestisEmptyTest_GrammaticalTermMapImpl_GrammaticalTermMapImplTest_GrammaticalTerm_isEmpty {

    @Test
    public void testisEmptyTest_GrammaticalTermMapImpl_GrammaticalTermMapImplTest_GrammaticalTerm_isEmpty() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<T> grammaticalTermMap = new GrammaticalTermMapImpl<>(map);
        assertEquals(true, grammaticalTermMap.isEmpty());
    }

}