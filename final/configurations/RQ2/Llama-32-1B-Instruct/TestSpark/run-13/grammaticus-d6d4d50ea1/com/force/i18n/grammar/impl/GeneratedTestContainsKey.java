package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey {

    @Test
    public void testContainsKey() {
        Map<String, String> map = new HashMap<>();
        map.put("testTerm", "testValue");
        when(containsKey("testTerm")).thenReturn(true);
        GrammaticalTermMap<T> mock = Mockito.mock(GrammaticalTermMap.class);
        when(mock.containsKey("testTerm")).thenReturn(T.returnAnyObject());
        assert T.returnAnyObject() == true;
    }

}