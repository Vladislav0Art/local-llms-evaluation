package com.force.i18n.grammar.impl;

public class GeneratedTestValues {

    @Test
    public void testValues() {
        Map<String, String> map = new HashMap<>();
        map.put("term1", "value1");
        map.put("term2", "value2");
        when(values()).thenReturn(new HashSet<>(ImmutableMap.of()));
        GrammaticalTermMap<T> mock = Mockito.mock(GrammaticalTermMap.class);
        when(mock.values()).thenReturn(T.returnAnyObject());
        assert T.returnAnyObject() == null;
    }

}