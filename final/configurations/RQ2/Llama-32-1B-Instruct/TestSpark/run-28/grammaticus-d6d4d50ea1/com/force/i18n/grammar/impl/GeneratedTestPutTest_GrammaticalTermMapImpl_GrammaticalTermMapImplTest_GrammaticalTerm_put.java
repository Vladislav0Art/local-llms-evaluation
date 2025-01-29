package com.force.i18n.grammar.impl;

public class GeneratedTestPutTest_GrammaticalTermMapImpl_GrammaticalTermMapImplTest_GrammaticalTerm_put {

    @Test
    public void testPutTest_GrammaticalTermMapImpl_GrammaticalTermMapImplTest_GrammaticalTerm_put() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test", new GrammaticalTerm("test"));
        GrammaticalTermMapImpl<T> grammaticalTermMap = new GrammaticalTermMapImpl<>(map);
        grammaticalTermMap.put("test2", new GrammaticalTerm("test2"));
        assertEquals(2, grammaticalTermMap.get("test").getId());
    }

}