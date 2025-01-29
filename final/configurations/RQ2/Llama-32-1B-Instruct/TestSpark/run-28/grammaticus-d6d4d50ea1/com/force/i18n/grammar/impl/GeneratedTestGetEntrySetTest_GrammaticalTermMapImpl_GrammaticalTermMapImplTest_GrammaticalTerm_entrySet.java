package com.force.i18n.grammar.impl;

public class GeneratedTestGetEntrySetTest_GrammaticalTermMapImpl_GrammaticalTermMapImplTest_GrammaticalTerm_entrySet {

    @Test
    public void testGetEntrySetTest_GrammaticalTermMapImpl_GrammaticalTermMapImplTest_GrammaticalTerm_entrySet() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test", new GrammaticalTerm("test"));
        GrammaticalTermMapImpl<T> grammaticalTermMap = new GrammaticalTermMapImpl<>(map);
        Collection<Map.Entry<String, GrammaticalTerm>> entrySet = grammaticalTermMap.entrySet();
        assertEquals(1, entrySet.size());
    }

}