package com.force.i18n.grammar.impl;

public class GeneratedTestPutAll {

    @Test
    public void testPutAll() {
        Map<String, String> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");
        when(putAll(GrammaticalTermMap.class.getConstructor(null)).newInstance()).thenReturn(map);
        GrammaticalTermMap<T> mock = Mockito.mock(GrammaticalTermMap.class);
        when(mock.putAll(new GrammaticalTermMapImpl<>(map, true))).thenReturn(true);
        assert true;
    }

}