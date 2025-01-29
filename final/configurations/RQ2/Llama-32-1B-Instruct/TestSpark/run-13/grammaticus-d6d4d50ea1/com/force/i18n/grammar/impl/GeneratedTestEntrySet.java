package com.force.i18n.grammar.impl;

public class GeneratedTestEntrySet {

    @Test
    public void testEntrySet() {
        Map<String, String> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");
        when(entrySet()).thenReturn(new HashSet<>(ImmutableMap.of()));
        GrammaticalTermMap<T> mock = Mockito.mock(GrammaticalTermMap.class);
        when(mock.entrySet()).thenReturn(T.returnAnyObject());
        assert T.returnAnyObject() == null;
    }

}