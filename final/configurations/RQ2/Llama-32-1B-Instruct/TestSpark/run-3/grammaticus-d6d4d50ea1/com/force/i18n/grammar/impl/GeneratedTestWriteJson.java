package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJson {

    private Map<String, T> mockMap;
    private boolean isSkinny;

    @Mock
    private Appendable output;

    public void setUp() throws IOException {
        mockMap = new HashMap<>();
        mockMap.put("testKey", new Noun());
        isSkinny = false;
    }

    @Test
    public void testWriteJson() {
        T term1 = mockTerm("term1");
        String name = "name";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.writeJson(output, RenamingProvider.empty(), LanguageDictionary.empty(), Collections.emptySet())).thenReturn(true);
        verify(mockOutput).write("testKey");
    }

}