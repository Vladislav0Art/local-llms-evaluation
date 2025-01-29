package com.force.i18n.grammar.impl;

public class GeneratedTestIsSkinny {

    private static final Map<String, String> TEST_MAP = new HashMap<>();

    @InjectMocks
    private GrammaticalTermMapImpl<GrammaticalTerm> mock;

    @Test
    public void testIsSkinny() {
        // Arrange
        when(mock.isSkinny()).thenReturn(false);

        // Act
        boolean result = mock.isSkinny();

        // Assert
        assertFalse(result);
    }

}