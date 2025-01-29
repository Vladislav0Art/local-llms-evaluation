package com.force.i18n.grammar.impl;

public class GeneratedTestKeySet {

    @Test
    public void testKeySet() {
        Map<String, String> map = new HashMap<>();
        map.put("testTerm", "testValue");
        when(map.keySet()).thenReturn(new HashSet<>(ImmutableMap.of("testTerm", "testValue")));
        GrammaticalTermMap<T> mock = Mockito.mock(GrammaticalTermMap.class);
        when(mock.keySet()).thenReturn(HashMap.of(), new HashSet<>());
        assert mock.keySet() == new HashSet<>(new ImmutableMap.of("testTerm", "testValue"));
    }

}