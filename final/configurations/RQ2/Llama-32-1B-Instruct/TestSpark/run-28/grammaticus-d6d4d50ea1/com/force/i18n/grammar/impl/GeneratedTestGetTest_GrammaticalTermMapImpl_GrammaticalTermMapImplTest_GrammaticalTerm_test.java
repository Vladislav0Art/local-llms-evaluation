package com.force.i18n.grammar.impl;

public class GeneratedTestGetTest_GrammaticalTermMapImpl_GrammaticalTermMapImplTest_GrammaticalTerm_test {

    @Test
    public void testGetTest_GrammaticalTermMapImpl_GrammaticalTermMapImplTest_GrammaticalTerm_test() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test", new GrammaticalTerm("test"));
        GrammaticalTermMapImpl<T> grammaticalTermMap = new GrammaticalTermMapImpl<>(map);
        T test = grammaticalTermMap.get("test");
        assertEquals(test, new GrammaticalTerm("test"));
    }

}