package com.force.i18n.grammar.impl;

public class GeneratedTestGet {

    @Test
    public void testGet() {
        Map<String, String> map = new HashMap<>();
        map.put("testTerm1", "testValue1");
        map.put("testTerm2", "testValue2");
        when(get("testTerm1")).thenReturn("testValue1");
        when(get("testTerm2")).thenReturn(null);
        GrammaticalTermMap<T> mock = Mockito.mock(GrammaticalTermMap.class);
        when(mock.get("testTerm1")).thenReturn(T.returnAnyObject());
        when(mock.get("testTerm2")).thenReturn(T.returnAnyObject());
        assert T.returnAnyObject() == "testValue1";
    }

}