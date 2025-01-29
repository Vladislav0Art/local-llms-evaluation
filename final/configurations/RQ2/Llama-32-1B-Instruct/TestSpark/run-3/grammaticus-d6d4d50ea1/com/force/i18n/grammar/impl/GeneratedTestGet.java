package com.force.i18n.grammar.impl;

public class GeneratedTestGet {

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
    public void testGet() {
        T term = mockTerm("testKey");
        String name = "testName";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.get(name)).thenReturn(term);
        verify(mockTerm).get("testName");
    }

}