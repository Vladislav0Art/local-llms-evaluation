package com.force.i18n.grammar.impl;

public class GeneratedTestKeySetByName {

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
    public void testKeySetByName() {
        T term1 = mockTerm("term1");
        T term2 = mockTerm("term2");
        String name = "name";
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        when(instance.getKeySet()).thenReturn(ImmutableMap.of(name, term1));
        verify(mockMap).containsKey(name);
    }

}