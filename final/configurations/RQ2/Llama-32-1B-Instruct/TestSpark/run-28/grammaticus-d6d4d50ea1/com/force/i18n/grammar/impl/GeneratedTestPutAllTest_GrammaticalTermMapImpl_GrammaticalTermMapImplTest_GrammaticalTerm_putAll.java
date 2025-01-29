package com.force.i18n.grammar.impl;

public class GeneratedTestPutAllTest_GrammaticalTermMapImpl_GrammaticalTermMapImplTest_GrammaticalTerm_putAll {

    @Test
    public void testPutAllTest_GrammaticalTermMapImpl_GrammaticalTermMapImplTest_GrammaticalTerm_putAll() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test", new GrammaticalTerm("test"));
        map.put("test2", new GrammaticalTerm("test2"));
        GrammaticalTermMapImpl<T> grammaticalTermMap = new GrammaticalTermMapImpl<>(map);
        grammaticalTermMap.putAll(new HashMap<>());
        assertEquals(0, grammaticalTermMap.get("test").getId());
    }

}