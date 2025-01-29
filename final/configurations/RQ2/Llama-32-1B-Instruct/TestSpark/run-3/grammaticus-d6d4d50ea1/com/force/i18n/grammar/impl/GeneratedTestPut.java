package com.force.i18n.grammar.impl;

public class GeneratedTestPut {

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
    public void testPut() {
        T term = mockTerm("testKey");
        String name = "testName";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.put(name, term)).thenReturn(true);
        verify(mockMap).put(name, term);
    }

}