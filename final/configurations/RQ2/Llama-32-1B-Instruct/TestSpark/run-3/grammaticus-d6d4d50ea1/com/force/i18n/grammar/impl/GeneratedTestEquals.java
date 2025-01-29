package com.force.i18n.grammar.impl;

public class GeneratedTestEquals {

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
    public void testEquals() {
        T term1 = mockTerm("term1");
        String name = "name";
        GrammaticalTermMapImpl<T> instance1 = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        T term2 = mockTerm("testKey");
        String name2 = "name";
        when(instance1.get(name)).thenReturn(term1);
        when(instance2.get(name)).thenReturn(term2);
        assertTrue(instance1.equals(instance2));
    }

}