package com.force.i18n.grammar.impl;

public class GeneratedTestGetKeySetTest_GrammaticalTermMapImpl_GrammaticalTermMapImplTest_GrammaticalTerm_keySet {

    @Test
    public void testGetKeySetTest_GrammaticalTermMapImpl_GrammaticalTermMapImplTest_GrammaticalTerm_keySet() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test", new GrammaticalTerm("test"));
        GrammaticalTermMapImpl<T> grammaticalTermMap = new GrammaticalTermMapImpl<>(map);
        Set<String> keySet = grammaticalTermMap.keySet();
        assertEquals(1, keySet.size());
    }

}