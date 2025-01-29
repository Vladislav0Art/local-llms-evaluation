package com.force.i18n.grammar.impl;

public class GeneratedTestHashCode {

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
    public void testHashCode() {
        T term1 = mockTerm("term1");
        String name = "name";
        GrammaticalTermMapImpl<T> instance1 = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        T term2 = mockTerm("testKey");
        String name2 = "name";
        when(instance1.get(name)).thenReturn(term1);
        when(instance2.get(name)).thenReturn(term2);
        assertEquals(instance1.hashCode(), instance2.hashCode());
    }

}