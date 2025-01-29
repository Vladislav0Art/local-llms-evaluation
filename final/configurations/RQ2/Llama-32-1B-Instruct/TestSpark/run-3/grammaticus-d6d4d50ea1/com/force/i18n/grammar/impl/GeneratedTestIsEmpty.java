package com.force.i18n.grammar.impl;

public class GeneratedTestIsEmpty {

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
    public void testIsEmpty() {
        T term1 = mockTerm("term1");
        String name = "name";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.isEmpty()).thenReturn(true);
        verify(mockMap).isEmpty();
    }

}