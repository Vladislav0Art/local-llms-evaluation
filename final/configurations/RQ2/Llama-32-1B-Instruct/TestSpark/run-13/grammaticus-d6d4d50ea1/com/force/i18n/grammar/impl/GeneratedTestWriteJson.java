package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJson {

    @Test
    public void testWriteJson() {
        String json = "{\"term1\":\"value1\",\"term2\":\"value2\"}";
        when(writeJson("out", new RenamingProvider(), LanguageDictionary.empty(), Collections.emptyList())).thenReturn(json);
        GrammaticalTermMap<T> mock = Mockito.mock(GrammaticalTermMap.class);
        when(mock.writeJson("out", new RenamingProvider(), LanguageDictionary.empty(), Collections.emptyList())).thenReturn(json);
        assert json == mock.writeJson("out", new RenamingProvider(), LanguageDictionary.empty(), Collections.emptyList());
    }

}