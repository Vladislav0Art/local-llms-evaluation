package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJsonEmptyOutput {

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
    public void testWriteJsonEmptyOutput() {
        T term1 = mockTerm("term1");
        String name = "name";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.writeJson(output, RenamingProvider.empty(), LanguageDictionary.empty(), Collections.emptySet())).thenReturn(false);
        verify(mockOutput).write("testKey");
    }

    private T mockTerm(String name) {
        return new Noun();
    }

}