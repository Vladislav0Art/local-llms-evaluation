package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinny {

    @Test
    public void testMakeSkinny() {
        Map<String, String> map = new HashMap<>();
        map.put("testTerm", "testValue");
        when(map.isSkinny()).thenReturn(true);
        GrammaticalTermMap<T> mock = Mockito.mock(GrammaticalTermMap.class);
        when(mock.makeSkinny()).thenReturn(new GrammaticalTermMapImpl<>(map, true));
        assert mock.makeSkinny() == new GrammaticalTermMapImpl<>(map, true);
    }

}