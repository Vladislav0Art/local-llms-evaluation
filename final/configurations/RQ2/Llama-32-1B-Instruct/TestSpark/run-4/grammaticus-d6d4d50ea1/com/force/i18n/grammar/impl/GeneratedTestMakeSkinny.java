package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinny {

    private static final Map<String, String> TEST_MAP = new HashMap<>();

    @InjectMocks
    private GrammaticalTermMapImpl<GrammaticalTerm> mock;

    @Test
    public void testMakeSkinny() {
        // Arrange
        String name = "test";
        TEST_MAP.put(name, new GrammaticalTerm("value"));

        when(mock.makeSkinny()).thenReturn(new GrammaticalTermMapImpl<GrammaticalTerm>(TEST_MAP, false));

        // Act
        GrammaticalTermMapImpl<GrammaticalTerm> result = mock.makeSkinny();

        // Assert
        assertEquals(name, result.get(name));
    }

}