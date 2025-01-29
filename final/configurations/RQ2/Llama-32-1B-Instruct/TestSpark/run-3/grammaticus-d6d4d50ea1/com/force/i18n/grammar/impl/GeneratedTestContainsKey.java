package com.force.i18n.grammar.impl;

public class GeneratedTestContainsKey {

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
    public void testContainsKey() {
        T term = mockTerm("testKey");
        String name = "testName";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.containsKey(name)).thenReturn(true);
        verify(mockTerm).containsKey("testName");
    }

}