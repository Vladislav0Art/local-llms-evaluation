package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinny {

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
    public void testMakeSkinny() {
        GrammaticalTermMapImpl<T> instance = new GrammaticalTermMapImpl<>(mockMap, isSkinny);
        instance.makeSkinny();
        assertNotNull(instance.isSkinny());
    }

}